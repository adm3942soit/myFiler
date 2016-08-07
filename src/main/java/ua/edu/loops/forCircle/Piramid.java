package ua.edu.loops.forCircle;

/**
 * Created by Oxana on 5/19/15.
 */
public class Piramid {
    public static void main(String[] args){
        for (int x=1;x<10;x++){
            for (int y=0;y<x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
