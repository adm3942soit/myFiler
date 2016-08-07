package ua.edu.file;

import ua.edu.debug.Printer;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.util.ArrayList;

import static ua.edu.debug.Printer.Debug;
import static ua.edu.debug.Printer.debug;

/**
 * Created by IntelliJ IDEA.
 * User: Oxana Nastasyuk
 * Date: 3/26/12
 * Time: 9:43 PM
 * To change this template use MyFile | Settings | MyFile Templates.
 */
public class MyFiler extends Object {

    public static String error = "";
    public static String message = "";
    private static String nameFile = "";

   // private static File file;
    private static FileWriter fileWriter;
    private static FileReader fileReader;

    private static boolean created = false;
    private static boolean readably = false;
    public static boolean found = false;
    public static boolean written = false;
    public static boolean deleted = false;
    public static String pathName = "";

    static final boolean err = false;
    static final boolean ok = true;

    public static int numberLine = -1;

    private static String textFile = "";
    private static String currentDir = "";


    /**
     * ************************************************************
     */
    /*get current directory*/
    public static String getCurrentDirectory() {
        File directory = new File(".");
        try {
            currentDir = new String(directory.getCanonicalPath().toString());
        } catch (Exception e) {
            debug("Exception is =" + e.getMessage());
        }
        return currentDir;
    }

    public static String getPathName() {
        return pathName;
    }

    public static void setPathName(String pathName) {
        MyFiler.pathName = pathName;
    }

    //****************create directory in current dir******************************
    public static String createDirInCurrentDir(String nameDir) {
        if (!checkNameFileOnly(nameDir)) return null;

        String currentDir = getCurrentDirectory();
        setPathName(currentDir + System.getProperty("file.separator") + nameDir);
        File file = new File(getPathName());
        if (file.exists()) return getPathName();
        if (!file.mkdirs()) {
            error = "!!!!!!!!!!";
            return null;
        }
        return getPathName();
    }

    private static char smb = 92;
    public static String slash = "" + smb;
    public static String twoSlashes = slash + slash;

    public static String convertPathFromSingleSlashToSeparator(String pathName) {
        String newName = "";
        if (pathName.indexOf(twoSlashes) != -1) {
          return pathName;
        }
        if (pathName.indexOf(slash) != -1) {
            debug("slash ", slash);
            debug("twoSlashes ", twoSlashes);
            int index = -1;
            StringBuilder build = new StringBuilder();
            String newPath = pathName;
            while ((index = newPath.indexOf(slash)) != -1) {
                build.append(newPath.substring(0, index) + twoSlashes);
                newPath = newPath.substring(index + 1, newPath.length());
                debug(build.toString());
            }

            build.append(newPath);
            debug(build.toString());
            debug(build.toString());
            //newName=pathName.replaceAll(slash, twoSlashes);
            newName = build.toString();
        }
        debug("!!!!!" + newName);
        return newName;


    }

/*
    public static String convertPathFromSingleToDoubleSlash(String pathName) {

        //String twoSlashes = slash+slash;
        String newName = pathName.replaceAll(slash, twoSlashes);
        return newName;
    }

    public static String convertPathFromDoubleToSingleSlash(String pathName) {

        //String twoSlashes = slash+slash;
        String newName = pathName.replaceAll(twoSlashes, slash);

        return newName;
    }
*/

    //*****************readFile(String name)****************************************
    public static boolean readFile(String name) {
        if (!checkNameFile(name)) return err;

        File file = new File(name);
        readably = file.canRead();

        error = !readably ? "Error reading file " + name : "";
        message = !readably ? "" : "Reading of file " + file.getAbsolutePath() + " succesfully!";
        writeErrorMessageIntoConsole();
        return readably;
    }

    public static boolean createDir(String path) {
        if (!checkNameFileOnly(path)) return err;
        File file = new File(path);
        created = file.mkdirs();
        if (created) message = "Directory " + file.getAbsolutePath() + " created!";
        writeErrorMessageIntoConsole();
        return created;

    }

    public static boolean isFileExists(String filename) {

        boolean exists = new File(convertPathFromSingleSlashToSeparator(filename)).exists();
        debug("file " + convertPathFromSingleSlashToSeparator(filename) + " exists already!" + exists);
        return exists;
    }

    //*****************createFile(String name)****************************************
    public static boolean createFile(String name) {
        if (!checkNameFileOnly(name)) return err;
        nameFile = name;
        if (created = isFileExists(name)) return ok;
        File file=new File(name);
        try {


            boolean isDir=file.isDirectory();
            if (created && isDir) {
                message = "Directory " + file.getAbsolutePath() + " already created!";
                writeErrorMessageIntoConsole();
                return created;
            }
            if (!created && isDir) {
                created = createDir(nameFile);
                return created;
            }
            if (created && !isDir) {
                message = "File " + nameFile + "exist already";
                return created;
            }
            if (!created && !isDir) {
                created = file.createNewFile();
                message = "Creating file " + nameFile + (created ? "successfully" : "not successfully");
            }
            //if(created) deleteFile(nameFile);
        } catch (IOException e) {
            error = new String(e.getMessage());
        } finally {
            if (created)
                message = "MyFile " + file.getAbsolutePath() + " has been created successfully!";
            else
                error = "can't create file " + nameFile;

            writeErrorMessageIntoConsole();
            return created;
        }

    }

    public static boolean createFile(String name, boolean deleteExistTable) {

        if (!checkNameFileOnly(name)) {
            return err;
        } else {
            nameFile = name;
        }
        if (created = isFileExists(name) && !deleteExistTable) return ok;
        debug("createFile()", "created" + created);
        File file=new File(name);

        try {
            boolean isDir=file.isDirectory();
            if (created && isDir) {
                message = "Directory " + file.getCanonicalPath() + " already created!";
                writeErrorMessageIntoConsole();
                debug("createFile()", "1created" + created);
                return created;
            }
            if (!created && isDir) {
                created = createDir(nameFile);
                debug("createFile()", "2created" + created);
                return created;
            }
            message = "Creating file " + nameFile;
            if (created) {
                if (deleteExistTable) {
                    debug("createFile()", "3created" + created);
                    deleteFile(nameFile);
                    created = file.createNewFile();
                    message = "Created file " + nameFile + created;
                }
            } else {
                created = file.createNewFile();
                debug("createFile()", "4created" + created);
                message = "Created file " + nameFile + created;
            }

        } catch (IOException e) {
            error = new String(e.getMessage());
        } finally {
            if (created)
                message = "MyFile " + file.getAbsolutePath() + " has been created successfully!";
            else
                error = error + " Can't create file " + nameFile;
            writeErrorMessageIntoConsole();
            return created;

        }
    }

    /*
        how read doc-files
        http://www.roseindia.net/tutorial/java/poi/readDocFile.html
        http://mvnrepository.com/artifact/org.apache.poi/poi/3.8
    */
    //***************** String[] readDocFile(String fullName)****************************************
    public static String[] text;
    public static WordExtractor extractor = null;

    public static String[] readDocFile(String fullName) {
        //  if(!checkNameFile(fullName)) return null;
        try {

            File file = new File(fullName);
            //FileInputStream fis=new FileInputStream(file.getAbsolutePath());
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(fullName));
            HWPFDocument document = new HWPFDocument(fs);
            extractor = new WordExtractor(document);
            text = extractor.getParagraphText();
            for (int i = 0; i < text.length; i++) {
                if (text[i] != null)
                    debug("MyFiler", "readDocFile", text[i]);
            }
        } catch (Exception ex) {
            debug("MyFiler", "readDocFile", ex.getMessage());
        }


        return text;
    }

    //***************** boolean checkNameFile(String name)****************************************
    public static boolean checkNameFile(String name) {
        Debug = true;
        clearErrorMessage();
        debug("MyFiler", "checkNameFile()", name);
        // convertPathFromSingleSlashToSeparator(name);
        if (!checkNameFileOnly(name)) {
            return err;
        }
        nameFile = name;
        if (created = isFileExists(nameFile)) return created;
        debug("MyFiler", "checkNameFile()", "######1");
        error = "File " + nameFile + " is not exist!";
        writeErrorMessageIntoConsole();
        return err;
    }

    //***************** boolean checkNameFile(String name)****************************************
    public static boolean checkNameFileOnly(String name) {
        clearErrorMessage();
        if (name == null || name.isEmpty()) {
            error = "name of file is empty!";
            writeErrorMessageIntoConsole();
            return err;
        }
        nameFile = name;
        return ok;
    }

    //***************** String readTextFromFile(String name)****************************************
    public static String readTextFromFile(String name) {
        Printer.Debug = true;
        debug("MyFiler", "readText", name);
        name = convertPathFromSingleSlashToSeparator(name);
        if (!checkNameFile(name)) {
            debug("MyFiler", "readText", "!checkNameFile");
            return null;
        }
        BufferedReader buf = null;
        try {
            Printer.debug("MyFiler", "readText", "checkNameFile");
            buf = new BufferedReader(new FileReader(name));
            String temp;
            while ((temp = buf.readLine()) != null) {
                textFile = textFile + temp + "\n" + "\r";
                debug("buf.readLine()!=null" + textFile);
            }
            debug(textFile);
        } catch (IOException ex) {
            error = ex.getMessage();
        } finally {
            try {
                if (buf != null) buf.close();
            } catch (IOException e) {
                error.concat("\n" + "\r" + e.getMessage());
            }
            writeErrorMessageIntoConsole();
        }
        return textFile;
    }

    //***************** String getPath(String name)****************************************
    public static String getPath(String name) {
        nameFile = name;
        if (!checkNameFile(nameFile)) {
            return textFile;
        }
        if (created = isFileExists(name)) {
            pathName = new File(nameFile).getAbsolutePath();
        }
        return pathName;
    }

    //***************** writeTextIntoFile****************************************
    public static boolean writeTextIntoFile(String nameFile,
                                            StringBuffer text) {
        // MyFiler.convertPathFromDoubleToSingleSlash(nameFile);
        if (!checkNameFile(nameFile)) return err;
        return writeTextIntoFile(text);
    }

    //***************** writeTextIntoFile****************************************
    public static boolean writeTextIntoFile(StringBuffer text) {
        clearErrorMessage();

        BufferedWriter bw = null;
        try {
            if (createFile(nameFile)) {

                fileWriter = new FileWriter(nameFile, false);
                bw = new BufferedWriter(fileWriter);
                char[] ar = text.toString().toCharArray();
                for (int i = 0; i < text.length(); i++) {

                    bw.append(ar[i]);
                }

                bw.flush();

            }
        } catch (IOException e) {
            error = new String(e.getMessage());
            written = false;
        } finally {
            writeErrorMessageIntoConsole();
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {
                written = false;
            }
        }
        writeErrorMessageIntoConsole();
        message = "Text " + text + " wrote into file " + new File(nameFile).getAbsolutePath() + " successfully!";
        written = true;
        return written;
    }

    //***************** deleteFile****************************************
    public static boolean deleteFile(String name) {
        if (!checkNameFile(name)) return err;
        try {
            nameFile = name;
            File file = new File(nameFile);
            if (file.delete()) {
                debug("MyFiler", "boolean deleteFile(String nameFile)", file.getName() + " is deleted!");
                message = file.getName() + " is deleted!";
                deleted = ok;
            } else {
                debug("Delete operation is failed.");
                error = "Delete operation is failed.";
                deleted = err;
            }

        } catch (Exception e) {

            e.printStackTrace();
            error = e.getMessage();

        } finally {
            writeErrorMessageIntoConsole();
        }

        return deleted;
    }

    //***************** writeTextIntoFile(String text)****************************************
    public static boolean writeTextIntoFile(String text) {
        clearErrorMessage();
        BufferedWriter bw = null;
        try {
            debug("writeTextIntoFile", "nameFile" + nameFile);
            if (!(isFileExists(nameFile))) {
                error = "File " + nameFile + " is not exist!";
                writeErrorMessageIntoConsole();
                return err;
            }
            fileWriter = new FileWriter(nameFile, true);
            bw = new BufferedWriter(fileWriter);

            char[] ar = text.toString().toCharArray();
            for (int i = 0; i < text.length(); i++) {
                bw.append(ar[i]);
            }

            bw.flush();
            message = "Text wrote into " + nameFile+ " successfully!";
        } catch (IOException e) {
            error = new String(e.getMessage());
            writeErrorMessageIntoConsole();
            return err;
        } finally {
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {
                error = new String(ioe2.getMessage()); // just ignore it
                writeErrorMessageIntoConsole();
                return err;
            }
        }

        writeErrorMessageIntoConsole();
        return true;
    }

    //***************** appendTextIntoFile(String text)****************************************
    public static boolean appendTextIntoFile(String text) {
        clearErrorMessage();
        BufferedWriter bw = null;
        try {
            debug("appendTextIntoFile()");
            File file = new File(nameFile);
            if (!(file.exists() && file.canWrite())) {
                error = "MyFile is not exist or not writable!";
                writeErrorMessageIntoConsole();
                return err;
            }
            fileWriter = new FileWriter(nameFile, true);
            bw = new BufferedWriter(fileWriter);
            char[] ar = text.toString().toCharArray();
            for (int i = 0; i < text.length(); i++) {
                bw.write(ar[i]);
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            error = new String(e.getMessage());
            writeErrorMessageIntoConsole();
            return err;
        } finally {
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {
                // just ignore it
            }

        }
        message = "Text " + text + " added into file " + nameFile + " successfully!";
        writeErrorMessageIntoConsole();

        return true;

    }

    //***************** appendTextIntoFile(StringBuffer text)****************************************
    public static boolean appendTextIntoFile(StringBuffer text) {
        clearErrorMessage();
        BufferedWriter bw = null;
        try {
            debug("appendTextIntoFile()" + nameFile);
            File  file = new File(nameFile);
            if (!(file.exists() && file.canWrite())) {
                error = "MyFile is not exist or not writable!";
                writeErrorMessageIntoConsole();
                return err;
            }
            fileWriter = new FileWriter(nameFile, true);
            bw = new BufferedWriter(fileWriter);

            char[] ar = text.toString().toCharArray();
            for (int i = 0; i < text.length(); i++) {
                bw.append(ar[i]);
            }

            bw.flush();
        } catch (IOException e) {
            error = new String(e.getMessage());
            writeErrorMessageIntoConsole();
            return err;
        } finally {
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {
                // just ignore it
            }

        }

        message = "Text " + text + " added into file " + nameFile + " successfully!";
        writeErrorMessageIntoConsole();
        return true;

    }

    //***************** findTextInFile(String text)****************************************
    public static boolean findTextInFile(String text) {
        clearErrorMessage();
        if (text.isEmpty()) {
            error = "Enter text, please!";
            writeErrorMessageIntoConsole();
        }

        if (isFileExists(nameFile)) {
            try {
                fileReader = new FileReader(nameFile);
                BufferedReader buffer = new BufferedReader(fileReader);
                String str;
                numberLine = 0;
                while ((str = buffer.readLine()) != null && !str.isEmpty()) {
                    numberLine++;
                    if (str != null && !str.isEmpty() && str.indexOf(text) != -1) {
                        found = true;
                        message = "Text " + text + "found in file " + nameFile + "!";
                        writeErrorMessageIntoConsole();
                        return found;
                    }

                }
                error = "Text " + text + " not found in file " + nameFile + "!";
            } catch (FileNotFoundException ex) {
                error = ex.getMessage();
                writeErrorMessageIntoConsole();
            } catch (IOException ex1) {
                error = ex1.getMessage();
                writeErrorMessageIntoConsole();
            }
        } else {
            error = "Can't read file" + nameFile;
        }
        writeErrorMessageIntoConsole();
        return found;
    }

    public static ArrayList<String> str = new ArrayList<String>();

    public static ArrayList<String> getListStr() {
        return str;
    }

    public static FoundStringOfFile obj = null;

    //***************** findTextInFile(String text)****************************************
    public static FoundStringOfFile findTextInFileAndGetLine(String nameFile, String text) {
        clearErrorMessage();
        if (!checkNameFileOnly(nameFile)) {
            return null;
        }
        if (text.isEmpty()) {
            error = "Enter text, please!";
            writeErrorMessageIntoConsole();
            return null;
        }

        if (isFileExists(nameFile)) {
            try {
                fileReader = new FileReader(nameFile);
                BufferedReader buffer = new BufferedReader(fileReader);
                ArrayList<String> str = new ArrayList<String>();
                String txt;
                int i = 0;
                while ((txt = buffer.readLine()) != null && !txt.isEmpty()) {
                    str.add(txt);
                    numberLine = i + 1;
                    if (str.get(i) != null && !str.get(i).isEmpty() && str.get(i).indexOf(text) != -1) {
                        found = true;
                        message = "Text " + text + "found in file " + nameFile + "!";
                        writeErrorMessageIntoConsole();
                        return (new FoundStringOfFile(true, numberLine, str));
                    }
                    i++;
                }
                found = false;
                error = "Text " + text + " not found in file " + nameFile + "!";
            } catch (FileNotFoundException ex) {
                found = false;
                error = ex.getMessage();
                writeErrorMessageIntoConsole();
                return null;
            } catch (IOException ex1) {
                found = false;
                error = ex1.getMessage();
                writeErrorMessageIntoConsole();
                return null;
            }
        } else {
            found = false;
            error = "Can't read file" + nameFile;

        }

        writeErrorMessageIntoConsole();
        return null;
    }


    public static boolean findTextInFile(String nameFile, String text) {
        clearErrorMessage();
        if (text.isEmpty()) {
            error = "Enter text, please!";
            writeErrorMessageIntoConsole();
        }

        if (isFileExists(nameFile)) {
            try {
                fileReader = new FileReader(nameFile);
                BufferedReader buffer = new BufferedReader(fileReader);
                String str;
                numberLine = 0;
                while ((str = buffer.readLine()) != null && !str.isEmpty()) {
                    numberLine++;

                    if (str != null && !str.isEmpty() && str.indexOf(text) != -1) {
                        found = true;
                        message = "Text " + text + " found in file " + nameFile + "!";
                        writeErrorMessageIntoConsole();
                        return found;
                    }

                }
                found = false;
                error = "Text " + text + " not found in file " + nameFile + "!";
            } catch (FileNotFoundException ex) {
                error = ex.getMessage();
                found = false;
                writeErrorMessageIntoConsole();
                return found;
            } catch (IOException ex1) {
                found = false;
                error = ex1.getMessage();
                writeErrorMessageIntoConsole();
                return found;
            }
        } else {
            found = false;
            error = "Can't read file" + nameFile;
        }
        writeErrorMessageIntoConsole();
        return found;
    }

    public static String getLineFileByNumber(String nameFile, int numberLine) {
        String text = readTextFromFile(nameFile);
        debug("ready Text!");
        int i = 0;
        int countLines = 0;
        String line = "";
        while (i < text.length()) {
            line = line + text.charAt(i);
            if (text.charAt(i) == '\r') {
                countLines++;
                if (countLines - 1 == numberLine) {
                    debug("line " + line);
                    return line;
                } else {
                    line = "";
                    i++;
                    continue;
                }

            } else {
                i++;
                continue;
            }
        }
        return null;
    }

    public static boolean rewriteLineInFile(String nameFile, int line, String newLine) {
        String text = readTextFromFile(nameFile);
        String result = "";
        int i = 0;
        int indexBegin = -1;
        int indexEnd = -1;
        numberLine = -1;
        while (i < (line - 1)) {
            i++;
            if (text.charAt(i) == '\r') {
                numberLine++;
                if (numberLine == (line - 2)) {
                    indexBegin = i;
                }
                if (numberLine == (line - 1)) {
                    indexEnd = i;
                    break;
                }
            }
        }
        if (indexBegin != -1) {
            if (indexEnd != -1) {
                result = text.substring(0, indexBegin - 1)
                        .concat(newLine)
                        .concat(text.substring(indexEnd + 1, text.length() - 1));
            } else {
                result = text.substring(0, indexBegin - 1)
                        .concat(newLine);
            }
            return writeTextIntoFile(nameFile, new StringBuffer(result));
        }
        return err;
    }

    //***************** clearErrorMessage****************************************
    private static void clearErrorMessage() {
        found = false;
        written = false;
        //nameFile = "";
        error = "";
        message = "";
        textFile = "";
    }

    //***************** writeErrorMessageIntoConsole****************************************
    private static void writeErrorMessageIntoConsole() {
        if (!message.isEmpty()) debug("MyFiler", "writeErrorMessageIntoConsole()", message);
        if (!error.isEmpty()) debug("MyFiler", "writeErrorMessageIntoConsole()", error);
    }

    public static String getError() {
        return error;
    }

    public static String getMessage() {
        return message;
    }
    /*getters&setters*/

    public static String getNameFile() {
        return nameFile;
    }

    public static void setNameFile(String nameFile) {
        MyFiler.nameFile = nameFile;
    }

    public static int getNumberLine() {
        return numberLine;
    }

    public static void setNumberLine(int numberLine) {
        MyFiler.numberLine = numberLine;
    }

    public static class FoundStringOfFile {
        boolean found = false;
        ArrayList<String> listStr = null;
        int numberLine = -1;

        public FoundStringOfFile(boolean found, int numberLine, ArrayList<String> list) {
            this.setFound(found);
            this.setListStr(list);
            this.setNumberLine(numberLine);

        }

        public int getNumberLine() {
            return numberLine;
        }

        public void setNumberLine(int numberLine) {
            this.numberLine = numberLine;
        }

        public boolean isFound() {
            return found;
        }

        public void setFound(boolean found) {
            this.found = found;
        }

        public ArrayList<String> getListStr() {
            return listStr;
        }

        public void setListStr(ArrayList<String> listStr) {
            this.listStr = listStr;
        }
    }
}
