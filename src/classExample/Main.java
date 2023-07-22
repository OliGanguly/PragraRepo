package classExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp id : ");
        int empId=sc.nextInt();
        System.out.println("Enter emp Name : ");
        String empName=sc.next();
        System.out.println("Enter emp monthly Salary : ");
        double empSal=sc.nextDouble();

        employee.display(empId,empName,empSal);
        employee.annualSal(empSal);
        employee.department(empName);
    }
}
