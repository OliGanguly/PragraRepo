package NestedSwitch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Portal");
        System.out.println("Which Year are you studying");
        System.out.println("Enter 1 for First Year , 2 For Second Year , 3 for Final Year");
        Scanner sc = new Scanner(System.in);
        int year = 0;
        if (!sc.hasNextInt()) {
            System.out.println("Sorry Please Enter 1 for First Year , 2 For Second Year , 3 for Final Year");
        } else {
            year = sc.nextInt();
        }
        switch (year) {
            case 1:
                System.out.println("You are in First Year");
                System.out.println("Enter M for MBA");
                System.out.println("Enter A for MA");
                System.out.println("Enter T for Technology");
                char ch = sc.next().charAt(0);
                switch (ch){
                    case 'M':
                        System.out.println("You Are a MBA Student");
                        System.out.println("Enter Your Bachelor's GPA like (1, 2, 3 , 4 , 5) out of 5");
                        System.out.println("If It is above 4 You will be eligible for Scholarship");
                        int per = 0;
                        int eligibility = 5;
                        if (!sc.hasNextInt()) {
                            System.out.println("Sorry Enter Your GPA in decimal/Fraction");
                        } else {
                            per = sc.nextInt();
                        }
                        switch (per) {
                            case 1:
                                System.out.println("Not Eligible for Scholarship");
                                break;
                            case 2:
                                System.out.println("Not Eligible for Scholarship");
                                break;
                            case 3:
                                System.out.println("Not Eligible for Scholarship");
                                break;
                            case 4:
                                System.out.println("You are Eligible for Scholarship");
                                System.out.println("Enter 3 digit Roll No. to Send Eligibility Application");
                                int app = sc.nextInt();
                                int length = String.valueOf(app).length();
                                switch (length) {
                                    case 3:
                                        System.out.println("Check your registered mail to see your marks");
                                        break;
                                    default:
                                        System.out.println("Wrong Input,Check Your Roll, It should be 3 digit");
                                }
                                break;
                            case 5:
                                System.out.println("You are Eligible for Scholarship");
                                System.out.println("Enter 3 digit Roll No. to Send Eligibility Application");
                                int app5 = sc.nextInt();
                                int length_m_5 = String.valueOf(app5).length();
                                switch (length_m_5) {
                                    case 3:
                                        System.out.println("Check your registered mail to see your marks");
                                        break;
                                    default:
                                        System.out.println("Wrong Input,Check Your Roll, It should be 3 digit");
                                }
                                break;
                            default:
                                System.out.println("Wrong Input");
                        }
                        break;
                    case 'A':
                        System.out.println("You are a MA Student");
                        System.out.println("Enter Your Bachelor's GPA like (1, 2, 3 , 4 , 5) out of 5");
                        System.out.println("If It is above 4 You will be eligible for Scholarship");
                        int per_a = 0;
                        if (!sc.hasNextInt()) {
                            System.out.println("Sorry Enter Your GPA in decimal/Fraction");
                        } else {
                            per_a = sc.nextInt();
                        }
                        switch (per_a) {
                            case 1:
                                System.out.println("Not Eligible for Scholarship");
                                break;
                            case 2:
                                System.out.println("Not Eligible for Scholarship");
                                break;
                            case 3:
                                System.out.println("Not Eligible for Scholarship");
                                break;
                            case 4:
                                System.out.println("You are Eligible for Scholarship");
                                System.out.println("Enter 3 digit Roll No. to Send Eligibility Application");
                                int app = sc.nextInt();
                                int length4 = String.valueOf(app).length();
                                switch (length4) {
                                    case 3:
//
                                        System.out.println("Check your registered mail to see your marks");
                                        break;
                                    default:
                                        System.out.println("Wrong Input,Check Your Roll, It should be 3 digit");
                                }
                                break;
                            case 5:
                                System.out.println("You are Eligible for Scholarship");
                                System.out.println("Enter 3 digit Roll No. to Send Eligibility Application");
                                int app5 = sc.nextInt();
                                int length5 = String.valueOf(app5).length();
                                switch (length5) {
                                    case 3:
//                                        int length = String.valueOf(app).length();
//                                        if(length==3)
                                        System.out.println("Check your registered mail to see your marks");
                                        break;
                                    default:
                                        System.out.println("Wrong Input,Check Your Roll, It should be 3 digit");
                                }
                        }
                        break;

                    case 'T':
                        System.out.println("You are a Technology Student , You are eligible for Scholarship");
                        System.out.println("Enter 3 digit Roll No. to Send Eligibility Application");
                        int app_t = sc.nextInt();
                        int length_t = String.valueOf(app_t).length();
                        switch (length_t) {
                            case 3:
                                System.out.println("Check your registered mail to see your marks");
                                break;
                            default:
                                System.out.println("Wrong Input,Check Your Roll, It should be 3 digit");
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("You are in Second Year");
                System.out.println("Enter R to Show Result");
                char result = sc.next().charAt(0);
                switch (result) {
                    case 'R':
                        System.out.println("Enter 3 digit Roll to see your marks");
                        int roll=sc.nextInt();
                        int roll_length=String.valueOf(roll).length();
                        switch(roll_length){
                            case 3:
                                System.out.println("Check your registered mail to see your marks");
                                break;
                            default:
                                System.out.println("Wrong Roll Number");
                        }
                        break;
                    default:
                        System.out.println("Please Follow Instruction and Press R to see Result");
                }
                break;

            case 3:
                System.out.println("You are in Third Year");
                System.out.println("Enter Semester to see date of next Semester");
                System.out.println("Enter Result to see pervious Semester Result");
                String result_3 = sc.next();
                switch (result_3){
                    case "Semester":
                        System.out.println("Your semester will be on 12th july 2023");
                        break;
                    case "Result":
                        System.out.println("Enter 3 digit Roll to see your marks");
                        int roll=sc.nextInt();
                        int roll_length=String.valueOf(roll).length();
                        switch(roll_length){
                            case 3:
                                System.out.println("Check your registered mail to see your marks");
                                break;
                            default:
                                System.out.println("Wrong Roll Number");
                        }
                        break;
                    default:
                        System.out.println("Wrong input");
                }
                break;

            default:
                System.out.println("Sorry Please Enter 1 for First Year , 2 For Second Year , 3 for Final Year");

        }

    }
}
