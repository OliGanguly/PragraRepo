package classExample;

public class Employee {
     int emp_id;
     String name;
     double salary;

     public void display(int id,String name, double sal){
         System.out.println("Emiid : "+id);
          System.out.println("Name : "+name);
          System.out.println("Salary : "+sal);
     }
     public void annualSal(double sal)
     {
          System.out.println("Annual Salary : "+sal*12);
     }
     public void department(String name){
          System.out.println( "Hello : " + name + " You are is Testing Department");
     }

}
