package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashMapshm {
    public static void main(String[] args) {
        // A HashMap is a data structure that stores data in key-value pairs. It
        // provides fast lookup, insertion, and deletion operations with an average time
        // complexity of O(1). This is a huge advantage over arrays or lists, where
        // searching can take O(n) time.

        problem1();

        problem2("Pankaj");

        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(problem3(input));
    }

    private static List<List<String>> problem3(String[] input) {
        // Question 3: Anagram Grouping

        // Anagrams are words or phrases formed by rearranging the letters of another.
        // For example, "listen" and "silent" are anagrams.

        // Task:
        // Given an array of strings, group the anagrams together. The order of the
        // output does to matter.

        // Example:

        // Input: ["eat", "tea", "tan", "ate", "nat", "bat"]

        // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

        // LinkedList list = new LinkedList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : input) {
            char[] charArray = s.toCharArray(); // converted string to char Array
            Arrays.sort(charArray); //sorted it

            String sortedWord = new String(charArray); // converted sorted char array back to string

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }

        return new ArrayList<>(map.values());

    }

    public static HashMap<Character, Integer> problem2(String s) {
        // Question 2: Frequency Counting

        // One of the most common and powerful uses of a HashMap is to count the
        // frequency of elements in a collection, like characters in a string or numbers
        // in an array.

        // Task:
        // Write a Java function that takes a string as input and returns a
        // HashMap<Character, Integer> where each key is a unique character from the
        // string and its corresponding value is the count of its occurrences.

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        return hm;
    }

    public static void problem1() {

        // Question 1: Basic Operations

        // You have a HashMap<String, Integer> representing a shopping list, where the
        // key is the item name and the value is the quantity.

        // Task:

        // Initialize the HashMap with the following items:

        // "Apples" with a quantity of 5

        // "Bananas" with a quantity of 3

        // Add "Oranges" with a quantity of 2 to the list.

        // Retrieve and print the quantity of "Apples".

        // Check if "Bananas" exists in the list and print the result.

        // Remove "Oranges" from the list.

        // Print the final HashMap.

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Apples", 5);
        hm.put("Banana", 3);
        hm.put("Oranges", 2);

        System.out.println(hm);
        System.out.println(hm.get("Apples"));

        if (hm.containsKey("Banana")) {
            System.out.println("yes Bananas are here");
        }

        hm.remove("Oranges");

        System.out.println(hm);
    }
}
