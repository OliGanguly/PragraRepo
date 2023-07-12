package ControlStatementAssignment;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[ ] arg)
    {
        int i=0;
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
            case 'U'  :i++;
        }
        if(i==1)
            System.out.println("Entered character "+ch+" is  Vowel");
        else
            System.out.println("Entered character "+ch+" is Consonent");

    }
}
