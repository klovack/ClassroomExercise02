import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");

        int[] myArray = new int[5];
        int odd = 0;
        int even = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();

            // (%) is modulo operator.
            // If the rest of the number modulo 2 is 0 that means the number is even.
            if (myArray[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
