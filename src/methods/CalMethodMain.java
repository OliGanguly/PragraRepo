package methods;

import java.util.Scanner;

public class CalMethodMain {
    public static void main(String[] args) {
        System.out.println("Enter your Name or age");
        Scanner sc=new Scanner(System.in);
        String pattern = "[a-z,A-Z]+";
         //Name :
        if(sc.hasNext(pattern)){
            String name=sc.nextLine();
            System.out.println("Name : "+PrintDetails.display(name));
        }
         //Age :
        if(sc.hasNext()){
            int num=sc.nextInt();
            System.out.println("Age : "+PrintDetails.display(num));
        }
    }
}
