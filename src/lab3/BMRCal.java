package lab3;

import java.util.Scanner;

public class BMRCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input

        System.out.print("เพศ : ");
        String G = scanner.nextLine();

        System.out.print("ความสูง: ");
        int h = scanner.nextInt();

        System.out.print("น้ำหนัก: ");
        double w = scanner.nextDouble();

        System.out.print("อายุ: ");
        int a = scanner.nextInt();


        if (G =="ชาย" )

        System.out.print(66+(13.7*w)+(5*h)-(6.8*a));

        else

        System.out.print(655+(9.6*w)+(1.8*h)-(4.7*a));


















    }//mian



}//class
