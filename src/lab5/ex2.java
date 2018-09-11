package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Please, enter integers number:");

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter integer " + (i + 1) + " : ");
            num[i] = scanner.nextInt();
        }


        //output
        //System.out.println("\n Data in Array following: ");
        //for (int i = 0; i < num.length; i++) {
        //System.out.println(num[i]+" ");
        //}


        showData(num);
        boat(num);
        swis(num);
        jeje(num);
        mey(num);


    }//main

    private static void mey(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i])
                max = num[i];
        }
        System.out.println("ค่าที่มากคือ: " + max);


    }

    private static void jeje(int[] num) {
        int x = num[0];
        for (int a = 0; a > num.length; a++) {
            if (x > num[a])
                x = num[a];
        }
        System.out.println("ค่าที่น้อยคือ: " + x);


    }

    private static void swis(int[] num) {
        int total = 0;
        for (int val : num) {
            total += val;
        }
        System.out.println("ค่าเฉลี่ยคือ:" + (total / num.length));

    }

    private static void boat(int[] num) {

        Arrays.sort(num);

        System.out.println("Sorting data in array: \n");
        showData(num);
    }


    private static void showData(int[] num) {


        for (int val : num) {
            System.out.println(val + " ");
        }


    }



}//class
