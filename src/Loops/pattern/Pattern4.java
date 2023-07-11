package Loops.pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            //print space
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            //print *
          for(int k=1;k<=i;k++ ){
              System.out.print("*");
          }
            System.out.println("");

        }
    }
}
