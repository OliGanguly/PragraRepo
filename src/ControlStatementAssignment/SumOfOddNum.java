package ControlStatementAssignment;

import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        int n;
        String cus_rep_while;
        String cus_reply_for_do_while;
        System.out.println("Sum of odd Natural Numbers...");
        System.out.println("Enter n : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sumFor=0;
        for(int i=1;i<=n;i++){
            System.out.println((2*i)-1);
            sumFor+=(2*i)-1;
        }
        System.out.println ("The Sum of odd Natural Number upto " +n+" terms is "+sumFor);


        /////////////while////////////////////////////
        System.out.println("Do You want to see The same using while loop ?"+"Press Y for Yes"+"Press N for No");
        Scanner proceed=new Scanner(System.in);
        cus_rep_while=proceed.next();
        while ((cus_rep_while.equals("Y"))||(cus_rep_while.equals("y"))){
            int j=1;
            int sumWhile=0;
            while (j<=n){
                System.out.println((2*j)-1);
                sumWhile+=(2*j)-1;
                j++;
            }
            System.out.println ("The Sum of odd Natural Number upto " +n+" terms is "+sumWhile);
            cus_rep_while="N";
        }

        System.out.println("Do You want to see The same using do-while loop ?"+"Press Y for Yes"+"Press N for No");
        cus_reply_for_do_while=proceed.next();
        while ((cus_reply_for_do_while.equals("Y"))||(cus_reply_for_do_while.equals("y"))){
            int k=1;
            int sumDoWhile=0;
            do{
                System.out.println((2*k)-1);
                sumDoWhile+=(2*k)-1;
                k++;
            }while (k<=n);
            System.out.println ("The Sum of odd Natural Number upto " +n+" terms is "+sumDoWhile);
            cus_reply_for_do_while="N";
        }

    }
}
