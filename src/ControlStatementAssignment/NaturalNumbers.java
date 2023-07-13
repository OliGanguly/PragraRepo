package ControlStatementAssignment;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        int i;
        int j = 1;
        int k = 1;
        String cus_reply_for_while;
        String cus_reply_for_do_while;

        System.out.println("The First 10 Natural Numbers");
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Natural Numbers using FOR LOOP");
        for (i = 1; i <= n; i++) {
            System.out.println("INSIDE FOR LOOP " + i);
        }
        System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Do You want to see The same using while loop ?" + "Press Y for Yes" + "Press N for No");
        Scanner proceed = new Scanner(System.in);
        cus_reply_for_while = proceed.next();

        while ((cus_reply_for_while.equals("Y")) || (cus_reply_for_while.equals("y"))) {
            System.out.println("Natural Numbers using WHILE LOOP");
            while (j <= n) {
                System.out.println("INSIDE WHILE LOOP " + j);
                j++;
            }
            System.out.println();
            cus_reply_for_while="N";
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Do You want to see The same using do-while loop ?" + "Press Y for Yes" + "Press N for No");
        cus_reply_for_do_while = proceed.next();
        while ((cus_reply_for_do_while.equals("Y")) || (cus_reply_for_do_while.equals("y"))) {
            System.out.println("Natural Numbers using DO-WHILE LOOP");
            do {
                System.out.println("INSIDE DO-WHILE " + k);
                k++;
            } while (k <= n);
            cus_reply_for_do_while="N";

        }
    }
}
