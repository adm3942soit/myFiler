package ua.edu.objects;


import ua.edu.debug.Printer;
import ua.edu.file.MyFiler;
import ua.edu.file.apache.DocReader;
import ua.edu.objects.graph.test.TestForm;


import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: ${Admin}
 * Date: Feb 12, 2012
 * Time: 8:06:19 PM
 * To change this template use MyFile | Settings | MyFile Templates.
 */
public class ObjectLoader {

    public static void main(String args[])
    {
        //MyFiler.createDirInCurrentDir("DataBases");
       // MyFiler.createFile("DataBases\\TestBase.doc");
        Printer.Debug=true;
        String nameFile= MyFiler.getCurrentDirectory() + File.separator+"DataBases"+File.separator+"TestBase.doc";
/*
        boolean ok=MyFiler.isFileExists( nameFile);
        Printer.debug(String.valueOf(ok));
*/
        String[] text={"1", "2"};

        boolean doIt= DocReader.createWordDoc(nameFile, text[0]);

        Printer.intoConsole("DocReader.createDoc",String.valueOf(doIt));

        String[] str= DocReader.readDocFile(nameFile);
        int i=0;

        while (str!=null && str.length!=0 && i<str.length)
        {
            Printer.intoConsole(str[i]);
        }

        //XLS
 /*       try{
        XLSFileReader xls=new XLSFileReader("first.xls");
        }catch(Exception ex)
        {
          Printer.intoConsole("Error"+ex.getMessage());
        }
 */
/*
        DocReader.createDoc("MyObjects\\34.xls", "Ok");
        //Doc
        String[] str= DocReader.readDocFile("MyObjects\\34.xls");
        int i=0;

        while (str!=null && str.length!=0 && i<str.length)
        {
            Printer.intoConsole(str[i]);
        }
*/

/*
        JFrame frame=new JFrame();
        frame.setPreferredSize(Global.maxSize);
        frame.setMinimumSize(Global.minSize);
        frame.setMaximumSize(Global.maxSize);
        MenuFiler menuFiler=new MenuFiler();
        LoginDetector login=new LoginDetector(menuFiler);
        login.setVisible(true);
        login.setPreferredSize(menuFiler.getPreferredSize());
        frame.add(menuFiler);
        frame.setVisible(true);
*/


/*
        frame.add(login);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(500,300));
        frame.setPreferredSize(new Dimension(500,300));
*/
/*
        if(LoginDetector.isCorrectLogin)
        {
            System.out.println("Login successfully!Welcome!");
            //System.exit(0);
            login.close();
            System.out.println("Login successfully!Welcome!2");
           // MenuFiler menuFiler=new MenuFiler();
            System.out.println("Login successfully!Welcome!3");
            menuFiler.setVisible(true);
            menuFiler.setPreferredSize(Global.maxSize);
            frame.add(menuFiler);
            System.out.println("Login successfully!Welcome!4");

        }

*/
        TestForm form=new TestForm();
        form.setVisible(true);
    }


}
