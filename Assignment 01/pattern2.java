// Set B 5

// 1 
// 0 1
// 0 1 0
// 1 0 1 0

public class pattern2 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j <= 4; j++) {
                if (number % 2 == 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
                number++;
            }
            System.out.println();
        }
    }
}
