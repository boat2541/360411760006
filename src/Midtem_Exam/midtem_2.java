package Midtem_Exam;

import java.util.Scanner;


public class midtem_2 {


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1,b2,c3,d4 ;


        do {
        System.out.print("คะแนนสอบย่อย : ");
        a1 = sc.nextInt();

        if (a1 > 20 || a1 < 0)
        System.out.println("กรุณากรอกคะแนนใหม่");

        }while (a1 > 20 || a1 < 0) ;

        do {
        System.out.print("คะแนนปฏิบัติ : ");
        b2 = sc.nextInt();

        if (b2 > 20 || b2 < 0)
        System.out.println("กรุณากรอกคะแนนใหม่");

        }while (b2 > 20 || b2 < 0) ;

        do {
        System.out.print("คะแนนสอบกลางภาค : ");
        c3 = sc.nextInt();

        if (c3 > 30 || c3 < 0)
        System.out.println("กรุณากรอกคะแนนใหม่");

        }while (c3 > 30 || c3 < 0) ;

        do {
        System.out.print("คะแนนสอบปลายภาค : ");
        d4 = sc.nextInt();

        if (d4 > 30 || d4 < 0)
        System.out.println("กรุณากรอกคะแนนใหม่");

        }while (d4 > 30 || d4 < 0) ;

        System.out.println("ผลคะแนนรวม :"+(a1+b2+c3+d4));

        if ((a1+b2+c3+d4)>=0 && (a1+b2+c3+d4)<=49){
        System.out.println("F");
        }
        else if ((a1+b2+c3+d4) >=50 &&(a1+b2+c3+d4)<=59){
        System.out.println("D");

        }else if ((a1+b2+c3+d4)>=60 &&(a1+b2+c3+d4)<=69) {
            System.out.println("C");

        }else if ((a1+b2+c3+d4)>=70 && (a1+b2+c3+d4)<=79){
        System.out.println("B");
        }

        else if ((a1+b2+c3+d4)>=80 && (a1+b2+c3+d4)<=100){
        System.out.println("A");
        }

        else {
        System.out.println("กรุณากรอกคะแนนใหม่");
        }



        }//main




        }//class