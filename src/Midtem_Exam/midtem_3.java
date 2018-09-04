package Midtem_Exam;
import java.util.Scanner;
public class midtem_3 {
    public static void main(String[] args) {

            System.out.println("####### Please select product type #######");
            Scanner input = new Scanner(System.in);
            int price =0,select;
            System.out.println("Type 1 10%");
            System.out.println("Type 2 15%");
            System.out.println("Type 3 17%");
            System.out.println("Type 4 40%");

            System.out.println("\nSelect : ");
            select = input.nextInt();


            System.out.print("Product Price : ");
            price = input.nextInt();



            double total =0   ;
            switch (select) {
                case 1:
                    total = price+(price *0.1);
                    break;
                case 2:
                    total = price+( price *0.15);
                    break;
                case 3:
                    total = price+( price *0.17);
                    break;
                case 4:
                    total = price+( price *0.40);
                    break;

            }

            System.out.println("Total Price : " +total );











    }//main




}//class
