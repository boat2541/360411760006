package Midtem_Exam;
import java.util.Scanner;
public class midtem_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,v ;
        int d,c ;

        System.out.print("กรุณากรอกชื่อ-สกุล :");
        a = sc.nextLine();
        System.out.print("กรุณากรอกคณะ :");
        v = sc.nextLine();
        System.out.print("กรุณากรอกเงินเดือน :");
        d = sc.nextInt();
        System.out.print("กรุณากรอกชชั่วโมงการสอน :");
        c = sc.nextInt();


        if (c>=0 && c<12) {
            System.out.println(d);


        }else if (c>=12 && c<16) {
            System.out.println("เงินเดือนรวมโบนัส: " +(d+(d*0.05)));


        }else if (c>=17 && c<=20)  {
            System.out.println("เงินเดือนรวมโบนัส: " +(d+(d*0.1)));

        }

        else if (c>=21){
            System.out.println("เงินเดือนรวมโบนัส: " +(d+(d*0.15)));
        }





















    }//main



}//class
