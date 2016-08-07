package ua.edu.collect.compare;

/**
 * Created by Oxana on 7/3/15.
 */
public class NameCompare implements Comparable {
    String str;

    public NameCompare(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(Object o) {
        String str1=(String)o;

        if(str.length()>str1.length())return 1;
        if(str.length()<str1.length())return -1;
       return 0;
    }

    public String getStr() {
        return str;
    }
}
