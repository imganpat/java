// Set A 5

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();

        System.out.println("The vowels are: ");

        for (int i = 0; i < string.length(); i++) {
            char letter = string.toLowerCase().charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                System.out.println(letter + " ");
        }

    }
}
