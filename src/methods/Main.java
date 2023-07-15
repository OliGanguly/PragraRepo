package methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        String cus_reply;
        do{
            System.out.println("1 for Addtion");
            System.out.println("2 for Substraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Devision");
            System.out.println("5 for Modulus");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First No.");
            int no1 = sc.nextInt();
            System.out.println("Enter Second No.");
            int no2 = sc.nextInt();
            System.out.println("Enter Operation 1,2,3,4,5");
            int num = 0;
            if (!sc.hasNextInt()) {
                System.out.println("Sorry Enter 1,2,3,4,5!");
            } else {
                num = sc.nextInt();
            }
            int res;
            switch (num) {
                case 1:
                    System.out.println("Addition Result"+CalMethod.sumFunc(no1,no2));
                    break;
                case 2:
                    System.out.println("Substraction Result"+CalMethod.substractionFunc(no1,no2));
                    break;
                case 3:
                    System.out.println("Multiplication Result" + CalMethod.multiplication(no1,no2));
                    break;
                case 4:
                    System.out.println("Devision Result>" + CalMethod.devisionFunc(no1,no2));
                    break;
                default:
                    System.out.println("Invalid Symbol");

            }
            System.out.println("Do you want to Exit ? "+"Press Y/y for Exit" + "Press N/n to not exit");
            cus_reply=sc.next();
        }while(cus_reply.equals("N")||(cus_reply.equals("n")));


    }
}
