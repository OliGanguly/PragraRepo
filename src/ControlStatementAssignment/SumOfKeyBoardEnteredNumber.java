package ControlStatementAssignment;

import java.util.Scanner;

//5. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
public class SumOfKeyBoardEnteredNumber {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers to get there SUM and AVG");

//        using FOR LOOP
        String customerReply;
        String customerReplyForDoWhile;
        int sumFor=0;
        int avgFor=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter "+i+" Number inside FOR-LOOP");
            Scanner sc1=new Scanner(System.in);
            sumFor=sumFor+sc1.nextInt();
        }
        avgFor=sumFor/5;
        System.out.println("Sum of Entered 5 Numbers is "+sumFor+" The Average is "+ avgFor +" USING FOR LOOP");
        System.out.println("Do You want to see The same using while loop ?"+"Press Y for Yes"+"Press N for No");
        Scanner proceed=new Scanner(System.in);
        customerReply=proceed.next();

//        USING WHILE LOOP
   while (customerReply.equals("Y")||customerReply.equals("y")){
       int sumWhile=0;
       int avgWhile=0;
       int j=1;
       while (j<=5){
           System.out.println("Enter "+j+" Number inside WHILE-LOOP");
           Scanner sc2=new Scanner(System.in);
           sumWhile+=sc2.nextInt();
           j++;
       }
       avgWhile=sumWhile/5;
       System.out.println("Sum of Entered 5 Numbers is "+sumWhile+" The Average is "+ avgWhile +" USING WHILE LOOP");
       customerReply="N";
   }
        System.out.println("Do You want to see The same using Do-while loop ?"+"Press Y for Yes"+"Press N for No");
        customerReplyForDoWhile=proceed.next();
//        USING D0-WHILE
        while (customerReplyForDoWhile.equals("Y")||customerReplyForDoWhile.equals("y")){
            int sumDoWhile=0;
            int avgDoWhile=0;
            int k=1;
           do{
               System.out.println("Enter "+k+" Number inside DO-LOOP");
               Scanner sc3=new Scanner(System.in);
               sumDoWhile+=sc3.nextInt();
               k++;
           }while (k<=5);
            avgDoWhile=sumDoWhile/5;
            System.out.println("Sum of Entered 5 Numbers is "+sumDoWhile+" The Average is "+ avgDoWhile +" USING WHILE LOOP");
            customerReplyForDoWhile="N";
        }


    }
}
