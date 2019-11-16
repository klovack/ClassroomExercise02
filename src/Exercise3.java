import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");

        int size = input.nextInt();
        int start = input.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            // We can actually directly output the numbers here
            // System.out.println((start + i) + " ");

            // But the exercise want us to do
            myArray[i] = start + i;
        }

        System.out.print("Output: ");

        for (int i = 0; i < myArray.length ; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        System.out.print("Output reversed: ");

        for (int i = myArray.length - 1; i >= 0 ; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}
