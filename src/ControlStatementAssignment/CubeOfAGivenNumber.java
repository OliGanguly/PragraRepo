package ControlStatementAssignment;

import java.util.Scanner;

public class CubeOfAGivenNumber {
    public static void main(String[] args) {
        String cus_rep_while;
        String cus_reply_for_do_while;
        System.out.println("Cube of a Number");
        Scanner sc=new Scanner(System.in);

        if(!sc.hasNextInt()){
            System.out.println("Sorry ! Enter a Valid Integer Number");
        }else{
            long number=sc.nextInt();
            //Using fo Loop
            System.out.println("USING FOR LOOP");
            for(int i=1;i<=number;i++)
            {
                System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
            }


            //using while
            System.out.println("Do You want to see The same using while loop ?"+"Press Y for Yes"+"Press N for No");
            Scanner proceed=new Scanner(System.in);
            cus_rep_while=proceed.next();
            System.out.println("Enter a Number For While");
            int number2=sc.nextInt();
            int j=1;
            System.out.println("USING FOR LOOP");
            while (cus_rep_while.equals("Y")||cus_rep_while.equals("y")){
                while (j<=number2){
                    System.out.println("Number is : " +j+" and cube of " +j+" is : "+(j*j*j));
                    j++;
                }
                cus_rep_while="N";
            }


        }
    }
}
