import java.util.Scanner;

public class SwitchWithNumber {
    public static void main(String []args){
        System.out.println("Calculator");
        System.out.println("1 for Addtion");
        System.out.println("2 for Substraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Devision");
        System.out.println("5 for Modulus");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No.");
        int no1=sc.nextInt();
        System.out.println("Enter Second No.");
        int no2=sc.nextInt();
        System.out.println("Enter Operation 1,2,3,4,5");
        int num=sc.nextInt();

        int res;
        switch (num){
            case 1:res=no1+no2;
                System.out.println("Addition Result"+no1+"+"+no2+"="+res);
                break;
            case 2:res=no1-no2;
                System.out.println("Substraction Result"+no1+"-"+no2+"="+res);
                break;
            case 3:res=no1*no2;
                System.out.println("Multiplication Result"+no1+"*"+no2+"="+res);
                break;
            case 4:res=no1/no2;
                System.out.println("Devision Result>"+no1+"/"+no2+"="+res);
                break;
            case 5:res=no1%no2;
                System.out.println("Devision Result>"+no1+"%"+no2+"="+res);
                break;
            default:System.out.println("Invalid Symbol");


        }

    }
}
