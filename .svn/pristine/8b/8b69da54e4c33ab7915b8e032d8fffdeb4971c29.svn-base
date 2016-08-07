package ua.edu.loops.whileloop;

/**
 * Created by Oxana on 5/21/15.
 */
public class SumNumbers {
    int n=100;

    public SumNumbers(int n) {
        this.n = n;
        int i=1, sum=0, p=1;
        while(i<=this.n){
            sum+=i;
            p*=i;
            System.out.println("Summa of numbers="+sum);
            System.out.println("Proizvedenie of numbers=" + p);

            i++;
        }
        System.out.println("Summa of numbers="+sum);
        System.out.println("Proizvedenie of numbers=" + p);
    }
public static void main(String[] args){
    int n=args.length;
    if(n==0)return;
    SumNumbers sumNumbers=new SumNumbers(Integer.parseInt(args[0]));
}
}
