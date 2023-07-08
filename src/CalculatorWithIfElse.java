import java.util.Scanner;

public class CalculatorWithIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter First No.");
        int no1=sc.nextInt();
        System.out.println("Enter Second No.");
        int no2=sc.nextInt();
        System.out.println("Enter Operation +,-,*,/");
        char symbol=sc.next().charAt(0);
        if(symbol=='+') {
            System.out.println(no1 + " + " + no2 + " = " + (no1 + no2));
        }else if(symbol=='-'){
            System.out.println(no1 + " - " + no2 + " = " + (no1 - no2));
        } else if (symbol=='*') {
            System.out.println(no1 + " * " + no2 + " = " + (no1 * no2));
        } else if (symbol=='/') {
            System.out.println(no1 + " / " + no2 + " = " + (no1 / no2));
        }else {
            System.out.println("Wrong Input");
        }
    }
}
