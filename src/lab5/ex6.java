package lab5;

import java.util.StringTokenizer;

public class ex6 {
    public static void main(String[] args) {

    //StringBuffer

    StringBuffer strbuf = new StringBuffer("I am at RUTS");
    strbuf.insert(0,"MT: ");
    System.out.println(strbuf);
    System.out.println(strbuf.reverse());
    //StringBuilder

        StringBuilder strbui = new StringBuilder("I am at RUTS");
        strbui.append(" :MT");
        System.out.println(strbui);
        System.out.println(strbui.reverse());

    //StringTokenizer

        StringTokenizer strTok = new StringTokenizer("I am at RUTS");

        System.out.println("Word count in message = "+strTok.countTokens());

        while (strTok.hasMoreTokens()){
            System.out.println(strTok.nextToken());
        }












    }//main



}//class
