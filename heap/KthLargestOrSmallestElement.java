package heap;
// Kth largest element -> a problem where you need to find the kth largest element in an Array

// Example Array: {12,31,4,54,5,6,56,34,3} -> we need to find 3 largest elements in this array

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestOrSmallestElement {
    private static String kthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int element : arr) {
            pq.add(element);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        return pq.toString();
    }

    private static String kthSmallestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int element : arr) {
            pq.add(element);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        return pq.toString();
    }

    public static void main(String[] args) {
        int[] arr = {12,31,4,54,5,6,56,34,3};
        int k = 3;
        // kth largest numbers
        System.out.println(kthLargestElement(arr, k));

        // kth smallest numbers
        System.out.println(kthSmallestElement(arr, k));
    }
}
