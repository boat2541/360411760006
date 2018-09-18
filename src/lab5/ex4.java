package lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {


        ArrayList myList = new ArrayList();
        myList.add("boat");
        System.out.println(myList);
        myList.add("swiss");
        myList.add("jj");
        myList.add("may");
        myList.add("kiw");
        myList.add("mook");
        System.out.println(myList);

        myList.add(2, "bb");
        System.out.println(myList);

        //remove
        myList.remove( 4 );
        System.out.println(myList);
        myList.remove("jj");
        System.out.println(myList);

        //indexof()
        System.out.println(myList.indexOf("swiss"));
        //size
        System.out.println(myList.size());










    }//main



}//class
