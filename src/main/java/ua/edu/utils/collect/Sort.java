package ua.edu.utils.collect;

import ua.edu.utils.collect.compare.NameComparator;
import ua.edu.utils.collect.list.TestCollection;

import java.util.Collections;

/**
 * Created by Oxana on 7/3/15.
 */
public class Sort {
    public static void main(String[] args){
        TestCollection test=new TestCollection();
        Collections.sort(TestCollection.al, new NameComparator());
        for (Object obj:TestCollection.al){
            System.out.println(obj);
        }

    }
}
