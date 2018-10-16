package Quiz2;
import java.util.Scanner;

//ทรงกลม
//ทรงกระบอก
//ทรงกรวย
//ทรงพีระมิด
//ทรงปริซึม



public class Quiz2 {
    private static final double PI = 3.1414;
    private static Scanner sc = new Scanner(System.in);
    private static void  Sphere () {
        double r, v;
        System.out.print("ป้อนค่ารัศมี (r) เป็นเซนติเมตร");
        r = sc.nextDouble();
        v = (4 / 3) * PI * (r * r * r);

        System.out.println("ปริมาตรทรงกลม : " + v);
    }//Sphere

    public static void Cylindrical () {
        double r, h, v;
        System.out.print("ป้อนค่ารัศมี (r) เป็นเซนติเมตร : ");
        r = sc.nextDouble();
        System.out.print("ป้อนค่าความสูง (h) เป็นเซนติเมตร : ");
        h = sc.nextDouble();
        v = PI * (r * r) * h;

        System.out.println("ปริมาตรทรงกระบอก : " + v);
    }//Cylindrical

    private static void Cone () {
        double r, h, v;
        System.out.print("ป้อนค่ารัศมี (r) เป้นเซนติเมตร : ");
        r = sc.nextDouble();
        System.out.print("ป้อนค่าความสูง (h) เป้นเซนติเมตร : ");
        h = sc.nextDouble();
        v = (1 / 3) * PI * (r * r) * h;

        System.out.println("ปริมาตรทรงกรวย : " + v);
    }//Cone
    private static void Pyramid () {
        double a, h, v;
        System.out.print("ป้อนค่าพื้นฐาน (a) เป็นเซนติเมตร : ");
        a = sc.nextDouble();
        System.out.print("ป้อนค่าความสูง (h) เป็นเซนติเมตร : ");
        h = sc.nextDouble();
        v = (1 / 3) * a * h;

        System.out.println("ปริมาตรพีรมิด ; " + v);
    }//Pyramid
    private static void Prismatic() {
        double a, h, v;
        System.out.print("ป้อนค่าพื้นฐาน (a) เป็นเซนติเมตร : ");
        a = sc.nextDouble();
        System.out.print("ป้อนค่าความสูง (h) เป้นเซนติเมตร : ");
        h = sc.nextDouble();
        v = a * h;

        System.out.println("ปริมาตรทรงปริซึม : " + v);
    }//Prismatic


    public static void main(String[] args) {
        int select =0;
        do {
            System.out.println("โปรดป้อนรูปทรงที่คุณต้องการจะหาปริมาตร");
            System.out.println("1.ปริมาตรทรงกลม");
            System.out.println("2.ปริมาตรทรงกระบอก");
            System.out.println("3.ปริมาตรทรงกรวย");
            System.out.println("4.ปริมาตรทรงพีรมิด");
            System.out.println("5.ปริมาตรทรงปริซึม");
            System.out.println("6.ออก");
            System.out.print("select : ");
            select = sc.nextInt();


            switch (select) {
                case 1:
                    Sphere();
                    break;
                case 2:
                    Cylindrical();
                    break;
                case 3:
                    Cone();
                    break;
                case 4:
                    Pyramid();
                    break;
                case 5:
                    Prismatic();
                    break;
                case 6:
                    System.out.println("Good bye ");
                    break;
            }
        }while ((select >=1)&& (select<=5));

    }
}//class