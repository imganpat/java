// Set B 2

import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int armstrongArray[] = new int[n];
        int numbers[] = new int[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();

        for (int i = 0, j = 0; i < n; i++)
            if (isArmstrong(numbers[i])) {
                armstrongArray[j] = numbers[i];
                j++;
            }

        System.out.println("\nNumbers are: ");
        printArray(numbers);

        System.out.println("\nArmstrong numbers are: ");
        printArray(armstrongArray);

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, count = 0;
        int temp = num;

        while (temp > 0) {
            temp /= 10;
            count++;
        }
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

// here i have used n for both as i cant update the array size in java, i got to
// know this after some research.
// Unlike other languages, Java does not allow the size of an array to be
// changed once it is created.

// In armstrongArray 0's are printed if the giver number is not armstrong