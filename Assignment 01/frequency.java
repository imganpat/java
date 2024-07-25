// Set C 1

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        char string[] = str.toCharArray();
        int size = str.length(), frequencyArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            frequencyArray[i] = 1;
            for (int j = i + 1; j < size; j++) {
                if (string[i] == string[j]) {
                    frequencyArray[i]++;
                    string[j] = ' ';
                }
            }
        }

        for (int i = 0; i < frequencyArray.length; i++)
            if (string[i] != ' ')
                System.out.println(string[i] + " - " + frequencyArray[i]);

        sc.close();
    }
}
