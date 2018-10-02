package lab7;

import java.util.Scanner;

public class employeeApp {
    public static void main(String[] args) {

        employee emp1 = new employee("Piyawat",
                "emp001",
                "Programmer",
                15000.00,
                "Botba109@gmail.com");



        System.out.println(emp1.toString());
        emp1.setName("Piyawat Sutthipanya");
        System.out.println(emp1.toString());



        employee emp2 = new employee();

        emp2 = inputData(emp2);













    }//main

    private static employee inputData(employee emp2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        emp2.setName(sc.nextLine());

        System.out.print("enter your id: ");
        emp2.setId(sc.nextLine());

        System.out.print("Enter your  position: ");
        emp2.setId(sc.nextLine());

        System.out.print("enter your email: ");
        emp2.setEmail(sc.nextLine());

        System.out.print("enter your salary: ");
        emp2.setSalary(sc.nextDouble());



        return emp2;
    }


}//class
