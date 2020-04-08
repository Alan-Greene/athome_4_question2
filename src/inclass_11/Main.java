package inclass_11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {10, 11, 12, 13, 14};
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("What index would you like?");
                int index = in.nextInt();
                System.out.println("Answer: " + array[index]);
                valid = true;
            } catch (IndexOutOfBoundsException i) {
                System.out.println("Exception: " + i.getMessage());
                i.printStackTrace(System.out);
            } finally {
                System.out.println("Exiting gracefully?");
            }
        }

        System.out.println("Yes!");
    }
}
