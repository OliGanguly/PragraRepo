import java.util.Scanner;

public class SwitchWithString {
    public static void main(String[] args) {
        System.out.println("Enter What you know About Me Mentioned Below");
        System.out.println("Name");
        System.out.println("Age");
        System.out.println("Subject");
        System.out.println("Hobby");
       Scanner sc=new Scanner(System.in);
       String EnteredInput=sc.next();
       switch (EnteredInput){
           case "Name":
               System.out.println("My Name is Oli");
               break;
           case "Age":
               System.out.println("My Age is 25");
               break;
           case "Subject":
               System.out.println("Subject is Java");
               break;
           case "Hobby":
               System.out.println("My Hobby is Painting");
               break;
           default:
               System.out.println("Enter some valid input as Suggested");
       }
    }
}
