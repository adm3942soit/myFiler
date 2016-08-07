package ua.edu.workWithArray.summator.implement;

import ua.edu.workWithArray.summator.interf.SummatorI;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Oxana on 7/2/15.
 */
public class Summator implements SummatorI {
    public static int Elems;
    public  static Object[] Mass= new  Object[100];

    Integer Summ=0;

    public Summator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Specify the length of the array: ");
        Summator.Elems = Integer.parseInt(in.next());
        Summator.Mass= new  Object[Summator.Elems];
        for(int i = 0; i<Summator.Mass.length;i++){
            System.out.println("Enter the value of an array element  " + (i) + ":");
            int x=Integer.parseInt(in.next());

            Summator.Mass[i] = x;
        }

    }

    @Override
    public int getSumm() throws IOException {
        int i;
        System.out.println(Mass.length);
        for (i=0;i<Mass.length;i++)
        {
            Summ+=(Integer)Mass[i];

        }
        return Summ;
    }
    public static void main (String[] args) throws IOException{

        Summator x=new Summator();

        System.out.print("SUM"+x.getSumm());

    }

}
