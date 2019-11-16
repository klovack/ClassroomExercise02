import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n >= m) {
            System.out.println("Wrong Input");
            return;
        }

        // Calculate size example: n = -2 and m = 2
        // 2 - (-2) - 1 = 3
        // exclusive n and exclusive m
        int size = (m - n) - 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length ; i++) {
            array[i] = n + (i + 1);
        }
        System.out.print("Output: ");

        // Print array
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
