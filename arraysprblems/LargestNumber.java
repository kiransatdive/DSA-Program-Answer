package arraysprblems;

import java.security.PublicKey;
import java.util.*;

public class LargestNumber {
    public static int large(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

        }
        return largest;
    }

    public static int Smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 8, 5, 6 };
        System.out.println("Largest value is :" + large(numbers));
        System.out.println("Smallest value is : " + Smallest(numbers));
    }
}
