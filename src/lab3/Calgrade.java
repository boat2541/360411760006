package lab3;
import java.util.Scanner;

public class Calgrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            int n1 = 0;
            do {
                System.out.print("Enter an integer: ");
                n1 = input.nextInt();
                if (n1 >= 0 && n1 <= 49) {
                    System.out.println("F");
                } else if (n1 >= 50 && n1 < 54)
                    System.out.println("D");
                else if (n1 >= 55 && n1 < 59)
                    System.out.println("D+");
                else if (n1 >= 60 && n1 < 64)
                    System.out.println("C");
                else if (n1 >= 65 && n1 < 69)
                    System.out.println("C+");
                else if (n1 >= 70 && n1 < 74)
                    System.out.println("B");
                else if (n1 >= 75 && n1 < 79)
                    System.out.println("B+");
                else if (n1 >= 80 && n1 < 100)
                    System.out.println("A");
                else {
                    System.out.println("กรอก 1-100 ");}

        }while (n1>100 || n1<0);
        System.out.println("Good bye.");



    }//main

}//class
