package ua.edu.file.xls;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import ua.edu.file.MyFiler;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: Asya
 * Date: 5/16/12
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataBaseInsert {

    public static void main( String [] args ) {

        String fileName= MyFiler.getCurrentDirectory()+ File.separator
                +"DataBases"+ File.separator+"File.xls";
       try{
           XLSFileReader cr=new XLSFileReader(fileName);
           cr.createXls(fileName);
           Vector dataHolder=read(fileName);
           saveToDatabase(dataHolder);

       }catch(Exception x)
       {
          x.printStackTrace();
       }
    }

    public static Vector read(String fileName)    {
        Vector cellVectorHolder = new Vector();
        try{
            FileInputStream myInput = new FileInputStream(fileName);
            POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
            HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
            HSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Iterator rowIter = mySheet.rowIterator();
            while(rowIter.hasNext()){
                HSSFRow myRow = (HSSFRow) rowIter.next();
                Iterator cellIter = myRow.cellIterator();
                Vector cellStoreVector=new Vector();
                while(cellIter.hasNext()){
                    HSSFCell myCell = (HSSFCell) cellIter.next();
                    cellStoreVector.addElement(myCell);
                }
                cellVectorHolder.addElement(cellStoreVector);
            }
        }catch (Exception e){e.printStackTrace(); }
        return cellVectorHolder;
    }
    private static void saveToDatabase(Vector dataHolder) {
        String username="";
        String password="";
        for (int i=0;i<dataHolder.size(); i++){
            Vector cellStoreVector=(Vector)dataHolder.elementAt(i);
            for (int j=0; j < cellStoreVector.size();j++){
                HSSFCell myCell = (HSSFCell)cellStoreVector.elementAt(j);
                String st = myCell.toString();
                username=st.substring(0,1);
                password=st.substring(0);
            }
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                Statement stat=con.createStatement();
                int k=stat.executeUpdate("insert into login(username,password) value('"+username+"','"+password+"')");
                System.out.println("Data is inserted");
                stat.close();
                con.close();
            }
            catch(Exception e){}
        }
    }

}
