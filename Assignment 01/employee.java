// Set A 3

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        System.out.println("Enter the name of employee: ");
        Scanner sc = new Scanner(System.in);
        String employee = sc.nextLine();

        System.out.println(reverse(employee));

        sc.close();
    }

    public static String reverse(String string) {
        int stringLength = string.length();
        String reversedString = "";

        for (int i = stringLength - 1; i >= 0; i--)
            reversedString += string.charAt(i);

        return reversedString;
    }
}
