import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No.");
        int n1=sc.nextInt();

        System.out.println("Enter Second No.");
        int n2=sc.nextInt();

        System.out.println("Enter Third No.");
        int n3=sc.nextInt();


        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else if(n3 >= n1 && n3 >= n2 )
            System.out.println(n3 + " is the largest number.");
        else
            System.out.println("Invalid");
    }
}
