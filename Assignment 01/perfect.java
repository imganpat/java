// Set A 2

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for n: ");
        int n = sc.nextInt();

        System.out.println("Perfect number from 1 to " + n + " are: ");

        for (int i = 2; i <= n; i++)
            isPerfect(i);

        sc.close();
    }

    public static void isPerfect(int n) {
        int sum = 0;
        for (int j = 1; j < n; j++)
            if (n % j == 0)
                sum += j;

        if (sum == n) {
            System.out.println(n);
        }

    }
}
