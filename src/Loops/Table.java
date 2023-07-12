package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int n=10;
        int k=1;
//        int l=1;
        System.out.println("Just Print Table of 2");
        for(int i=1;i<=n;i++){
            System.out.println(2+"x"+i+"="+(2*i));
        }
        System.out.println("Print all Tables using FOR loop............................................");
        for (int i= 1;i <= n;i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(i+"x"+j+"="+(i * j)+"\t");
            }
            System.out.println();
        }
        System.out.println("Print all Tables using WHILE loop............................................");
        while(k<=n){
            int l=1;
            while (l<=n){
               System.out.print(k+"x"+l+"="+(k * l)+"\t");
               l++;
           }
            k++;
           System.out.println();

        }
    }
}

