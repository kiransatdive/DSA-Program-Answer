package Hashing;
import java.util.*;

public class Practice2 {
    public String frequencySort(String s) {
        // Create a frequency map
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Create a max heap using a custom comparator
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Add characters to the max heap
        maxHeap.addAll(frequencyMap.keySet());

        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            int frequency = frequencyMap.get(ch);
            for (int i = 0; i < frequency; i++) {
                sortedString.append(ch);
            }
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        Practice2 practice = new Practice2();
        String s = "tree";
        String result = practice.frequencySort(s);
        System.out.println(result);
    }
}
