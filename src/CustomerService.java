import java.util.Scanner;

public class CustomerService {
    public static void main(String[] args) {
        System.out.println("Welcome to customer Service");
        System.out.println("Enter 1 to Leave a Message");
        System.out.println("Enter 2 to Go back to main Menu");
        System.out.println("Enter 3 to Talk to Customer Service");
        System.out.println("Enter 4 to Talk to Wait in a Queue");
        System.out.println("Enter Your Choice");
        Scanner sc= new Scanner(System.in);
        int Choice=sc.nextInt();
        switch (Choice){
            case 1:
                System.out.println("Your Message got Delivered");
                break;
            case 2:
                System.out.println("Welcome to main Menu");
                break;
            case 3:
                System.out.println("I am CSR,How can I help You");
                break;
            case 4:
                System.out.println("You are in 5th position , wait for 2 mins");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
