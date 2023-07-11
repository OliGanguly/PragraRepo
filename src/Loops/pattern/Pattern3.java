package Loops.pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=i;j++)  {
             System.out.print("*");
            }
            System.out.println("");
        }

        for(int k=1;k<=n;k++){
            for(int l=n-1;l>=k;l--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
