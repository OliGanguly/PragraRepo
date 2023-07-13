package ControlStatementAssignment;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("The First 10 Natural Numbers");
        System.out.println("Enter Number");
        String cus_reply_for_while;
        String cus_reply_for_do_while;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
        sum=sum+i;
        }
        System.out.println("Sum of "+n+" natural numbers using FOR Loop" + " " + sum);
        ////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Do You want to see The same using while loop ?"+"Press Y for Yes"+"Press N for No");
        Scanner proceed=new Scanner(System.in);
        cus_reply_for_while=proceed.next();
        while ((cus_reply_for_while.equals("Y"))||(cus_reply_for_while.equals("y"))){
            int sumWhile=0;
            int j=1;
            while ( j <= n) {
                sumWhile = sumWhile + j;
                j++;
            }
            System.out.println("Sum of "+n+" natural numbers using WHILE Loop" + " " + sumWhile);
            cus_reply_for_while="N";
        }

        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("Do You want to see The same using do-while loop ?"+"Press Y for Yes"+"Press N for No");
        cus_reply_for_do_while=proceed.next();
        while ((cus_reply_for_do_while.equals("Y"))||(cus_reply_for_do_while.equals("y"))){
            int sumDoWhile=0;
            int k=1;
            do{
                sumDoWhile=sumDoWhile+k;
                k++;

            }while (k<=n);
            System.out.println("Sum of "+n+" natural numbers using DO-WHILE Loop" + " " + sumDoWhile);
            cus_reply_for_do_while="N";
        }

    }
}
