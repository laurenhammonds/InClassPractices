package Sba;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToList implements MyList {
    static ArrayList<String> arrayToList = new ArrayList<>();
    
    public void convert(String[] a) {
        int i = 0;
        for (i=0; i <= a.length-1; i++) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: " + a[i] + " at the index: " + i);
        }
    }
    
    public void replace(int i) {
        String s = arrayToList.get(i);
        arrayToList.set(i, null);
        System.out.println("I have replaced the string: " + s + " with a null string");
    }
    
    @Override
    public ArrayList<String> compact() {
        for(Iterator<String> itr = arrayToList.iterator(); itr.hasNext();) {
            String s = itr.next();
        if(s == null) {
            itr.remove();
    }
    }
    return arrayToList;
}
}



