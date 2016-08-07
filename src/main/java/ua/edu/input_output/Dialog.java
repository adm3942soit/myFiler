package ua.edu.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Oxana on 6/30/15.
 */
public class Dialog {
    public Dialog() {
        System.out.println("What your name?");
        BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
        String name ="";
        try {
            name=buf.readLine();
        }catch (IOException ex){

        }

        System.out.println("Your name is "+name);

    }
    public static void main(String[] str){
        new Dialog();
    }
}
