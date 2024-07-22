// Set A 1

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime = checkPrime(number);

        if (isPrime)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }
    
    //function to check if a number is prime or not
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
