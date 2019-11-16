import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");

        int size = sc.nextInt();
        int[] array = new int[size];
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            // Alternative
//            if (array[i] == i) {
//                j = i;
//            }
        }

        // Exercise wants this!
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == i) {
                j = i;
            }
        }

        System.out.println("Output: " + j);
    }
}
