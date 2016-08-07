package ua.edu.collect.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Oxana on 7/3/15.
 */
public class TestCollection {
    public static ArrayList<String> al;
    public TestCollection() {
        al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

    }

    public static void main(String[] args){


        new TestCollection();
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            }


        }

}
