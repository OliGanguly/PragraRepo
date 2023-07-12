package ControlStatementAssignment;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("The First 10 Natural Numbers");
        System.out.println("Enter Number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int j=0;
        for(int i=1;i<=n;i++){
        sum=sum+i;
        }
        System.out.println("Sum of 10 natural numbers using FOR Loop" + " " + sum);
         int sumWhile=0;
        while ( j <= n) {
            sumWhile = sumWhile + j;
            j++;
        }
        System.out.println("Sum of 10 natural numbers using WHILE Loop" + " " + sum);
    }
}
