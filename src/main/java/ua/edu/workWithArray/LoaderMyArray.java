package ua.edu.workWithArray;


import ua.edu.workWithArray.inputArray.consoleVariant.implementations.InputArrayStreamer;
import ua.edu.workWithArray.inputArray.consoleVariant.interfaces.InputArrayStream;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ${Admin}
 * Date: Feb 3, 2012
 * Time: 9:07:25 PM
 * To change this template use MyFile | Settings | MyFile Templates.
 */
public class LoaderMyArray {
    public static void main(String args[])
    {
       try{
        InputArrayStream ar=new InputArrayStreamer();
        ar.input();
        ((InputArrayStreamer)ar).arOut.print(ar.get());
       }catch(IOException ex)
       {
         ex.printStackTrace();
       }
    }
}
