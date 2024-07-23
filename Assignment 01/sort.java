// Set B 1

import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of cities: ");
        int n = sc.nextInt();
        String cities[];
        cities = new String[n];

        System.out.println("Enter the names of cities: ");
        for (int i = 0; i < n; i++)
            cities[i] = sc.next();

        System.out.println("\nCities before sorting: ");
        displayCities(cities, n);

        Arrays.sort(cities);
        System.out.println("\nCities after sorting: ");
        displayCities(cities, n);

        sc.close();
    }

    public static void displayCities(String cities[], int size) {
        for (int i = 0; i < size; i++)
            System.out.println(cities[i]);
    }

}
