package Array;

import java.util.Scanner;

public class arrayOne {
    public static void main(String[] args) {
        System.out.println("Enter Size : ");

        Scanner sc = new Scanner(System.in);
        int sizeArr=sc.nextInt();
        String str[] = new String[sizeArr];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter Name : " + (i+1));
            str[i] = sc.next();
        }
        System.out.println("Array output....................");
//        for (int j = 0; j < str.length; j++) {
//            System.out.print(str[j]+" " );
//        }
        for(String k : str){
            System.out.print(" "+k);
        }

    }

}

