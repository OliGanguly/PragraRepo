package methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        String cus_reply;
        do{
            CalMethod.takeInput();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First No.");
            int no1 = sc.nextInt();
            System.out.println("Enter Second No.");
            int no2 = sc.nextInt();
            System.out.println("Enter third No. ");
            int no3=sc.nextInt();
            System.out.println("Enter Operation 1 for add 3 numbers ,2 ,3,4,5");
            int num = 0;
            if (!sc.hasNextInt()) {
                System.out.println("Sorry Enter 1,2,3,4,5!");
            } else {
                num = sc.nextInt();
            }
            int res;
            switch (num) {
                case 1:
                    System.out.println("Addition Result "+ CalMethod.sumFunc(no1,no2,no3));
                    break;
                case 2:
                    System.out.println("Substraction Result "+CalMethod.substractionFunc(no1,no2));
                    break;
                case 3:
                    System.out.println("Enter 4th number for multiplication");
                    int no4=sc.nextInt();
                    System.out.println("Multiplication Result " + CalMethod.multiplication(no1,no2,no3,no4));
                    break;
                case 4:
                    System.out.println("Devision Result " + CalMethod.devisionFunc(no1,no2));
                    break;
                case 5:
                    System.out.println("Multiply 2 numbers "+ CalMethod.multiplication(no1,no2));
                    break;
                default:
                    System.out.println("Invalid Symbol");

            }
            System.out.println("Do you want to Exit ? "+"Press Y/y for Exit" + "Press N/n to not exit");
            cus_reply=sc.next();
        }while(cus_reply.equals("N")||(cus_reply.equals("n")));


    }
}
