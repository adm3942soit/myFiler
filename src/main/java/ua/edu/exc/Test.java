package ua.edu.exc;

/**
 * Created by Oxana on 7/6/15.
 */
public class Test {
    static void getNumber() throws MyException {
        System.out.print("Enter number less than 100 :");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        if(num >=100)
        throw new MyException("Invalid Input");
        else{
            System.out.println(num + " is Valid Number.");
        }

        System.out.println("Finished Normally.");
    }
    public static void main(String args[]) {
        try {
            getNumber();
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
