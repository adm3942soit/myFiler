package ua.edu.file.apache;

import ua.edu.debug.Printer;
import ua.edu.file.MyFiler;
import ua.edu.file.ppt.Presentation;
import ua.edu.file.xls.ExcelFile;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;

import static ua.edu.debug.Printer.debug;
import static ua.edu.debug.Printer.intoConsole;

//import org.apache.poi.POIDataSamples;

/**
 * Created with IntelliJ IDEA.
 * User: Asya
 * Date: 4/26/12
 * Time: 7:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class DocReader {

    public static String[] text;
    public static String textLine;
    public static WordExtractor extractor = null;
    public static int flag=-1;
    public static final int TEXT=0;
    public static final int DOC=1;
    public static final int DOCX=11;
    public static final int XLS=2;
    public static final int XLSX=21;
    public static final int PPT=3;
    public static final int PPTX=31;
    public static final int PDF=4;
    public static final int DJVU=5;

    //***************** String[] readDocFile(String fullName)****************************************
    static boolean ok = true;
    static boolean err = false;

    public static String[] readDocFile(String fullName) {
        Printer.setDebug(true);

        File file = new File(fullName);
        FileInputStream fis;
        String ext=getExtensionFromName(fullName);
        if(flag==-1)return null;


        try {

            fis = new FileInputStream(file.getAbsolutePath());
            POIFSFileSystem fs = HWPFDocument.verifyAndBuildPOIFS(fis);
              if(flag==DOC){

                HWPFDocument document = new HWPFDocument(fis);
                extractor = new WordExtractor(document);
                //String text = extractor.getText();
                //intoConsole(text);
                text = extractor.getParagraphText();
                // dataArray stores the each line from the document
                for (int i = 0; i < text.length; i++) {
                    intoConsole("\n–" + text[i]);
                    // printing lines from the array
                }
              }
              else{ if(flag==DOCX)
                   {
                       XWPFDocument docx = new XWPFDocument(fis);

                       XWPFWordExtractor xextractor = new XWPFWordExtractor(docx);
                       textLine = xextractor.getText();
                       intoConsole(textLine);
                   }
              }
                fis.close();

        } catch (Exception ex) {
            intoConsole("DocReader", "readDocFile", ex.getMessage());
        } finally {

        }


        return text;
    }

    public static boolean createExcelDoc(String name, String content) {
        POIFSFileSystem fs = new POIFSFileSystem();
        DirectoryEntry directory = fs.getRoot();
        try {
            directory.createDocument("ExcelDocument", new ByteArrayInputStream(
                    (content != null ? content.getBytes() : new String("").getBytes())));

            FileOutputStream out = new FileOutputStream(name);

            fs.writeFilesystem(out);
            out.flush();
            out.close();
        } catch (IOException ex1) {
        }
        //catch (FileNotFoundException ex2){}
        return ok;
    }

    public static String getExtensionFromName(String nameFile) {
        if (nameFile == null || nameFile.isEmpty()) {
            Printer.debug("I don't know name file");
            return null;
        }
        if (nameFile.endsWith(".txt")){flag=TEXT; return "txt";}
        else {
            if (nameFile.endsWith(".doc")){flag=DOC; return "doc";}
            else {
                if (nameFile.endsWith(".docx")){flag=DOCX;  return "docx";}
                else {
                    if (nameFile.endsWith(".xls")) {flag=XLS; return "xls";}
                    else {
                        if (nameFile.endsWith(".xlsx")) {flag=XLSX; return "xlsx";}
                        else {
                            if (nameFile.endsWith(".pdf")){flag=PDF;  return "pdf";}
                            else {
                                if (nameFile.endsWith(".ppt")){flag=PPT;  return "ppt";}
                                else {
                                    if (nameFile.endsWith(".pptx")){flag=PPTX;  return "pptx";}
                                    else {
                                        if (nameFile.endsWith(".djvu")){flag=DJVU;  return "djvu";}
                                        else {
                                            int indexPoint = nameFile.indexOf(".");
                                            if (indexPoint != -1) {
                                                String ext = nameFile.substring(indexPoint + 1);
                                                return ext;
                                            } else return "";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean createWordDoc(String name, String content) {
        Printer.setDebug(true);
        String ext = getExtensionFromName(name);
        if (!name.contains(MyFiler.slash)) {
            name = File.separator + name;
        }

        if (ext.equals("txt")) {
            return MyFiler.createFile(name);
        } else if (ext.equals("doc") || ext.equals("docx")) {

            POIFSFileSystem fs = new POIFSFileSystem();
            DirectoryEntry directory = fs.getRoot();
            Printer.debug("DocReader", "createWordDoc", directory.toString());
            try {

                directory.createDocument("WordDocument", new ByteArrayInputStream(
                        content != null ? content.getBytes() : new String("").getBytes()));


                FileOutputStream out = new FileOutputStream(name);
                Printer.debug("DocReader", "createWordDoc", name);
                fs.writeFilesystem(out);
                out.flush();
                out.close();
                return ok;
            } catch (IOException ex1) {
                debug(ex1.getMessage());
                return err;
            }

        } else {
            if(flag==XLS || flag==XLSX){
                return ExcelFile.create(name);
            }
            if(flag==PPT || flag==PPTX){
                return Presentation.createPresentation(name);
            }
            if(flag==PDF){return err;}
            if(flag==DJVU){return err;}
        }

        return ok;
    }

}
