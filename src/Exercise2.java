import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");

        int n = input.nextInt();
        int m = input.nextInt();

        int index = n;
        int sum = 0;

        while (m > index) {
            sum = sum + index;

            index++;
        }

        if (n >= m) {
            System.out.println("Wrong Input");
        } else {
            System.out.println("Output: " + sum);
        }
    }
}
