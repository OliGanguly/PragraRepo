package Constructor;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(){
        super();
    }
    public Calculator(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double add(){
      return num1+num2;
    }
    public double substract(){
        return num1-num2;
    }
    public  double multiply(){
        return num1*num2;
    }
    public  double divide(){
        return num1/num2;
    }
}
class Example{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2=sc.nextInt();
        Calculator obj = new Calculator(num1,num2);
        System.out.println("Addtion : " + obj.add());
        System.out.println("Substraction : "+obj.divide());
        System.out.println("Multiplication : " + obj.multiply());
        System.out.println("Division : " + obj.substract());
    }
}
