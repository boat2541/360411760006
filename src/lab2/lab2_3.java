package lab2;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Fahrenheit degree : ");
        int FD = scanner.nextInt();

        //output
        double CS = (5.0/9.0)*(FD - 32.0);
        System.out.print("Celsius degree :"+CS+"");



    }//main



}//class

