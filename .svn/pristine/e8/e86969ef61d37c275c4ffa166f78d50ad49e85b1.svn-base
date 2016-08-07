package ua.edu.debug;

/**
 * Created by Oxana on 7/2/15.
 */
public class Printer {
    public static boolean Debug = false;

    public Printer() {
    }

    public static void intoConsole(String message) {
        System.out.println(message);
    }

    public static void intoConsole(String className, String method, String message) {
        System.out.println("Class: " + className + " method:" + method + "-> " + message);
    }

    public static void intoConsole(String className, String message) {
        System.out.println("Class: " + className + "-> " + message);
    }

    public static void debug(String message) {
        if(Debug) {
            intoConsole(message);
        }

    }

    public static void debug(String className, String message) {
        if(Debug) {
            intoConsole(className, message);
        }

    }

    public static void debug(String className, String method, String message) {
        if(Debug) {
            intoConsole(className, method, message);
        }

    }
    public static void setDebug(boolean debug) {
        Debug = debug;
    }
}
