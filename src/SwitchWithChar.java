import java.util.Scanner;

public class SwitchWithChar {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator with +,-,*,/");
        System.out.println("Enter First No.");
        int no1=sc.nextInt();
        System.out.println("Enter Second No.");
        int no2=sc.nextInt();
        System.out.println("Enter Operation +,-,*,/");
        String symbol=sc.next();
        int res;
        switch (symbol){
            case "+":res=no1+no2;
                System.out.println("Addition Result"+res);
                break;
            case "-":res=no1-no2;
                System.out.println("Substraction Result"+no1+"-"+no2+"="+res);
                break;
            case "*":res=no1*no2;
                System.out.println("Multiplication Result"+res);
                break;
            case "/":res=no1/no2;
                System.out.println("Devision Result--->"+res);
                break;
            default:System.out.println("Invalid Symbol");


        }

    }
}
