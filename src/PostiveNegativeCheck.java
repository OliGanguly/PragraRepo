import java.util.Scanner;

public class PostiveNegativeCheck {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No.");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }else if(num==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
