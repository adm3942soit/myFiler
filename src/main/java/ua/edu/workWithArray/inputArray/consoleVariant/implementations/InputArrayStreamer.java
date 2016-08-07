package ua.edu.workWithArray.inputArray.consoleVariant.implementations;


import ua.edu.workWithArray.inputArray.consoleVariant.interfaces.InputArrayStream;
import ua.edu.workWithArray.outputArray.consoleVariant.implementations.OutputArrayStreamer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ${Admin}
 * Date: Feb 3, 2012
 * Time: 9:17:57 PM
 * To change this template use MyFile | Settings | MyFile Templates.
 */
public class InputArrayStreamer implements InputArrayStream {
    public Object[] objA=new Object[MAX_COUNT];
    public ua.edu.workWithArray.outputArray.consoleVariant.interfaces.OutputArrayStream arOut=new OutputArrayStreamer();
    public Object[] get(){
      return objA;  
    }
    public Object[] input() throws IOException {
        System.out.println("Input " + MAX_COUNT + " elements of array");
        int i=0;
        while(i<MAX_COUNT)
        {
          System.out.println(++i+"th "  + "element:");
          BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
          objA[i-1]=buf.readLine();

        }
        System.out.println("Thanks:)");

        return objA;
    }

    public Object[] inputIntegerArray() throws IOException{
        System.out.println("Input " + MAX_COUNT + "integer digits");
        int i=0;
        while(i<MAX_COUNT)
        {
          System.out.println(++i+"-th "  + "element:");
          BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
          objA[i-1]=Integer.parseInt(buf.readLine());

        }
        System.out.println("Thanks:)");

        return objA;
    }
    public Object[] inputDoubleArray()throws IOException{
        System.out.println("Input " + MAX_COUNT + " real digits");
        int i=0;
        while(i<MAX_COUNT)
        {
          System.out.println(++i+"th "  + "element:");
          BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
          objA[i-1]=Double.parseDouble(buf.readLine());

        }
        System.out.println("Thanks:)");

        return objA;
    }
    public Object[] inputStringArray()throws IOException{
        System.out.println("Input " + MAX_COUNT + " words");
        int i=0;
        while(i<MAX_COUNT)
        {
          System.out.println(++i+"-th "  + "element:");
          BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
          objA[i-1]=buf.readLine();
        }
        System.out.println("Thanks:)");

        return objA;
    }
}
