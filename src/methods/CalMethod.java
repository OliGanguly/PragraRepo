package methods;

public class CalMethod {
    public static int sumFunc(int num1,int num2,int num3){
//        System.out.println(num1+num2);
        return num1+num2+num3;
    }
    public  static  int substractionFunc(int num1 , int num2){
        return  num1-num2;
    }
     public  static  int multiplication(int num1,int num2,int num3,int num4){
        return num1*num2*num3*num4;
     }
    public  static  int multiplication(int num1,int num2){
        return num1*num2;
    }
     public  static  int devisionFunc(int num1,int num2){
        return  num1/num2;
     }
     public static void takeInput(){
         System.out.println("1 for Addtion");
         System.out.println("2 for Substraction");
         System.out.println("3 for Multiplication");
         System.out.println("4 for Devision");
         System.out.println("5 for Modulus");
     }
}
