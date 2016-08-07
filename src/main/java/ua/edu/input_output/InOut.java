package ua.edu.input_output;

import java.util.Scanner;

/**
 * Created by Oxana on 6/30/15.
 */
public class InOut {

    public InOut(){
        Scanner sc = new Scanner(System.in);
        int i = 2;
        String str="";
        System.out.print("Input number: ");
        if(sc.hasNextInt()) {
            i = sc.nextInt();

        }
        System.out.println("Your number:"+i);

    }


    public static void main(String args[]){
        new InOut();
    }

}
