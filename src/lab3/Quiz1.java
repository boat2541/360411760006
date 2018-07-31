package lab3;

public class Quiz1 {
    public static void main(String[] args) {

        int count = 0;
        int boat=0;
        for (int x = 500; x < 1000; x++) {
            //statement for
            if (x % 3 == 0 && x % 6 == 0){

                System.out.print(x + " ");
            count++;
            boat+=x;//boat = boat+x;
        }

    }


    System.out.println("\nNumber of valus is "+count);
    System.out.println("The summation is "+boat);
    System.out.println("The average value is "+(boat/count));















    }//main


}//class
