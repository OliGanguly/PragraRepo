package ControlStatementAssignment;

import java.util.Scanner;

public class GreatestNo {
    public static void main(String[] args) {
        String cus_reply;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first No");
            int n1 = sc.nextInt();
            System.out.println("Enter Second No");
            int n2 = sc.nextInt();
            System.out.println("Enter Third No");
            int n3 = sc.nextInt();
            if (n1 >= n2 && n1 >= n3)
                System.out.println(n1 + " is the largest number.");

            else if (n2 >= n1 && n2 >= n3)
                System.out.println(n2 + " is the largest number.");

            else if (n3 >= n1 && n3 >= n2)
                System.out.println(n3 + " is the largest number.");
            else
                System.out.println("Invalid");
            System.out.print("Do you want to Exit" + "Press Y/y for Yes" + "Press N/n for Know"
                    );
            cus_reply=sc.next();
        }while (cus_reply.equals("N")||cus_reply.equals("n"));;


    }
}
