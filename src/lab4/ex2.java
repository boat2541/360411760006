package lab4;
// 1. summation (+)
// 2. substraction (-)
// 3. multipie (*)
// 4. Divided (/)

import java.util.Scanner;

public class ex2 {

    public static int summation (int x,int y){
        return  x+y;
    }
    public static int substraction (int x,int y){
        return  x-y;
    }
    public static int multipie (int x,int y){
        return  x*y;
    }
    public static int Divided (int x,int y){
        return  x/y;
    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, select;

        System.out.println("Please input 2 integers and choose your option....");
        //input data
        System.out.println("input number 1: ");
        x = input.nextInt();
        System.out.println("input number 2: ");
        y = input.nextInt();
        //show opions
        System.out.println("1. summation.");
        System.out.println("2. subtraction.");
        System.out.println("3. multiple.");
        System.out.println("4. division.");
        do {
            System.out.print("option: ");
            select = input.nextInt();

        }while (select<1 || select >4);


        int r = 0;

        switch (select) {
            case 1:
                r = summation(x, y);
                break;
            case 2:
                r = substraction(x, y);
                break;
            case 3:
                r = multipie(x, y);
                break;
            case 4:
                r = Divided(x, y);
                break;
            default:
                System.out.println("Please select opions (1-4) only. ");


        }

        System.out.println("output : " + r);













    }//main




}//class
