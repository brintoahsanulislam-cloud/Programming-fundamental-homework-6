
package task3;

import java.util.Scanner;

public class DigitSum {

    public static int sumDigits(long x) {

        if (x < 10) {
            return (int) x;
        }

        return (int) (x % 10) + sumDigits(x / 10);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        long x = input.nextLong();

        if (x < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("Sum of digits: " + sumDigits(x));
        }

        input.close();
    }
}

