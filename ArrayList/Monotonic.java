package ArrayList;
import java.util.ArrayList;

public class Monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(java.util.Arrays.asList(1, 5, 3));
        ArrayList<Integer> list2 = new ArrayList<>(java.util.Arrays.asList(6, 5, 4, 4));
        ArrayList<Integer> list3 = new ArrayList<>(java.util.Arrays.asList(1, 3, 2));

        System.out.println(isMonotonic(list1)); // Should output true
        System.out.println(isMonotonic(list2)); // Should output true
        System.out.println(isMonotonic(list3)); // Should output false
    }

    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                decreasing = false;
            } else if (list.get(i) < list.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
