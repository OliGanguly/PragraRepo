package ControlStatementAssignment;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[ ] arg)
    {
        String cus_reply="N";
        do{
            int count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a character");
            String pattern = "[a-z,A-Z]+";
            if(sc.hasNext(pattern))
            {
              String ch=sc.next();
              if(ch.length()<=1){
                  switch (ch){
                      case "a":
                      case "e" :
                      case "i":
                      case "o":
                      case "u":
                      case "A":
                      case "E":
                      case "I":
                      case "O":
                      case "U":count++;
                  }
                  if(count==1){
                      System.out.println("Entered character "+ch+" is  Vowel");
                  }else{
                      System.out.println("Entered character " + ch + " is Consonent");
                  }
              }else{
                  System.out.println("Please enter single charater");
              }
            }
            else
            {
                System.out.println("please enter a valid alphabet");
                continue;
            }
            System.out.println("Do you want to Exit ? "+"Press Y/y for Exit" + "Press N/n to not exit");
            cus_reply=sc.next();
        }while(cus_reply.equals("N")||(cus_reply.equals("n")));

        }

}
