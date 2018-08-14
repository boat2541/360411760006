package lab4;

public class ex3 {
    public static void main(String[] args) {

        System.out.println(findmax(10.0,22.22));
        System.out.println(findmax(10,22.22));



    }//main

    public static double findmax(double x , double y){

        if (x>y)
            return x;
        else
            return y;
    }

    public static int findmax (int x, int y){
        if (x>y)
            return x;
        else
            return y;
    }




}//class
