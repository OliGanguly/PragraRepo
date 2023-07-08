package Loops;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 10, sum = 0, i=1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of natural numbers using while Loop" + " " + sum);
    }
    }

