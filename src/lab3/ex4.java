package lab3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int selected;

        //Show options

        System.out.println("กรูณาเลือกรายวิชาที่คุณชอบมากที่สุด?");
        System.out.println("1.SA");
        System.out.println("2.Database");
        System.out.println("3.Accounting");
        System.out.print("กรอกหมายเลขรายวิชา : ");
        selected = scanner.nextInt();


        //switch-case
        switch (selected){

            case 1: System.out.println("คุณชอบ SA "); break;
            case 2: System.out.println("คุณชอบ Database "); break;
            case 3: System.out.println("คุณชอบ Accounting "); break;
            default:System.out.println("กรุณากรอกหมายเลข 1-3.");










        }











    }//main




}//class
