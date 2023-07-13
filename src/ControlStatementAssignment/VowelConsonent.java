package ControlStatementAssignment;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[ ] arg)
    {
        String cus_reply;
        do{
            int count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a character");
            char ch=sc.next().charAt(0);
            switch(ch)
            {
                case  'a' :
                case 'e'  :
                case 'i'   :
                case 'o'  :
                case 'u'  :
                case  'A' :
                case 'E'  :
                case 'I'   :
                case 'O'  :
                case 'U'  : count++;

            }
            if(count==1)
                System.out.println("Entered character "+ch+" is  Vowel");
            else {
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    System.out.println("Entered character " + ch + " is Consonent");
                else
                    System.out.println("Not an alphabet");
            }
            System.out.println("Do you want to Exit ? "+"Press Y/y for Exit" + "Press N/n to not exit");
            cus_reply=sc.next();
        }while(cus_reply.equals("N")||(cus_reply.equals("n")));

        }

}
