// Set B 3

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to search: ");
        String searchName = sc.nextLine();
        System.out.println(searchName);

        boolean nameFound = false;
        int founedIndex = 0;
        String names[] = { "Ganpat", "Rahul", "Ajay", "Raj", "Jhon", "Bob",
                "Charlie", "David", "Eve", "Frank" };

        for (int i = 0; i < names.length; i++)
            if (searchName.equals(names[i])) {
                founedIndex = i;
                nameFound = true;
                break;
            }

        if (nameFound)
            System.out.println(searchName + " is present is present at index: " + founedIndex);
        else
            System.out.println(searchName + " is not present in the array.");

        sc.close();
    }
}
