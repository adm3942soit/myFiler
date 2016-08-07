package ua.edu;





import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import ua.edu.file.MyFiler;
import ua.edu.file.apache.DocReader;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Asya
 * Date: 5/15/12
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestFiler {
    public static String nameFile= MyFiler.getCurrentDirectory()+File.separator+"test.docx";
    public static String[]test;
    public static String text;
    public static void main(String []args){
       // DocReader.createDocFile(nameFile, test);
        DocReader.createWordDoc(nameFile, text);
        DocReader.readDocFile(nameFile);

                File file = null;
                WordExtractor extractor = null ;
                try {

                    file = new File(nameFile);
                    FileInputStream fis=new FileInputStream(file.getAbsolutePath());
                    HWPFDocument document=new HWPFDocument(fis);
                    extractor = new WordExtractor(document);
                    String [] fileData = extractor.getParagraphText();
                    for(int i=0;i<fileData.length;i++){
                        if(fileData[i] != null)
                            System.out.println(fileData[i]);
                    }
                }
                catch(Exception exep){}

    }
}
