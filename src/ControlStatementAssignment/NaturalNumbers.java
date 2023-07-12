package ControlStatementAssignment;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
//        int i;
        System.out.println("The First 10 Natural Numbers");
        System.out.println("Enter Number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        System.out.println();

    }
}
