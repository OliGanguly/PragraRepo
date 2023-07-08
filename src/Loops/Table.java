package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Just Print Table of 2");
        for(int i=1;i<=n;i++){
            System.out.println(2+"x"+i+"="+(2*i));
        }
        System.out.println("Print all Tables............................................");
        for (int i= 1;i <= n;i++) {
            for (int j=1; j<=10; j++) {
                System.out.print(i+"x"+j+"="+(i * j)+"\t");
            }
            System.out.println();
        }
    }
}

