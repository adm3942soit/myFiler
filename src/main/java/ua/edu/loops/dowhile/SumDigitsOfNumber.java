package ua.edu.loops.dowhile;

/**
 * Created by Oxana on 5/21/15.
 */
public class SumDigitsOfNumber {

        public static void main(String args[]){
            int a, n=124, s=0;
            do{
                a=n % 10;

                System.out.println("a="+a);
                s=s+a;
                System.out.println("s="+s);
                n=n/10;

            } while(n>0);
            System.out.print("Sum = "+s);
        }//end of main

}
