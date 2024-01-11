package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arraysResults = new int[k];
        int count =1;
        int as = 0;
        Map<Integer, Integer> maps = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[as])
                maps.put(nums[i], count++);
            if(nums[i] != nums[as]) {
                as++;
                i--;
                count= 1;
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(maps.entrySet());

        for (int i = 0; i < k; i++) {
            arraysResults[i] = maxHeap.poll().getKey();
        }
        return arraysResults;

    }
}
