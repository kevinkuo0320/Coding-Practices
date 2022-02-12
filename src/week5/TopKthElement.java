package week5;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKthElement {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<Integer>((a, b) -> hm.get(b) - hm.get(a));
        for(int key : hm.keySet()) {
            heap.add(key);
        }

        int[] lis = new int[k];
        for(int i = 0; i < k; i++) {
            lis[i] = heap.poll();
        }

        return lis;

    }
}
