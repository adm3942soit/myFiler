package ua.edu.file.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Asya
 * Date: 5/18/12
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class PDFOperator {
        public static void main(String[] args) {
// Create a new document.
            Document document = new Document();
            try {
// Get an instance of PdfWriter and create a HelloWorld.pdf
// file as an output.
                PdfWriter.getInstance(document,
                new FileOutputStream(new File("HelloWorld.pdf")));
                document.open();
// Create our first paragraph for the pdf document to be
// created. We also set the alignment and the font of the
// paragraph.
//
                String text =
                "Kode Java website provides beginners to Java " +
                "programming some examples to use the Java API " +
                "(Application Programming Interface) to develop " +
                "applications. Learning from some examples will " +
                "hopefully decrease the time required to learn " +
                "Java.";
                Paragraph paragraph = new Paragraph(text);
                paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
                paragraph.setFont(new Font(
                        Font.FontFamily.HELVETICA, 10, Font.NORMAL));
                document.add(paragraph);
            } catch (DocumentException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                document.close();
            }
        }
    }

