package ControlStatementAssignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        String cus_rep_while;
        String cus_reply_for_do_while;
        System.out.println("Multiplication Table....");
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Multiplication Table using For Loop");
        for(int i=1;i<=10;i++){
            System.out.println("FOR "+ n +"*" + i +" = "+(n*i));
        }
        System.out.println();

        /////////////while////////////////////////////
        System.out.println("Do You want to see The same using while loop ?"+"Press Y for Yes"+"Press N for No");
        Scanner proceed=new Scanner(System.in);
        cus_rep_while=proceed.next();

        while ((cus_rep_while.equals("Y"))||(cus_rep_while.equals("y"))){
            int j=0;
            while (j<=10){
                System.out.println("WHILE "+ n +"*" + j +" = "+(n*j));
                j++;
            }
            cus_rep_while="N";
        }

        ////////////////////DO-WHILE//////////////////
        System.out.println("Do You want to see The same using do-while loop ?"+"Press Y for Yes"+"Press N for No");
        cus_reply_for_do_while=proceed.next();
        while ((cus_reply_for_do_while.equals("Y"))||(cus_reply_for_do_while.equals("y"))){
            int k=1;
            do{
                System.out.println("DO-WHILE "+ n +"*" + k +" = "+(n*k));
                k++;
            }while(k<=10);
            cus_reply_for_do_while="N";
        }

    }
}
