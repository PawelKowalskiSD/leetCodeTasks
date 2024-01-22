package algorithms;

public class BubbleSort {

    public int[] bubbleSortBasicForm(int[] nums) {
        long start = System.nanoTime();// Basic form BUBBLE SORT (best case O(n), average o(n^2), worst o(n^2))
        for (int i = 1; i < nums.length; i++) {                 // best case O(n) only when arrays it is sorted
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        long end = System.nanoTime();
        long times = end - start;
        System.out.println("Current Time in milliseconds basic = " + times);
        return nums;
    }

    public int[] bubbleSortAverageForm(int[] nums) {
        long start = System.nanoTime();
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        long end = System.nanoTime();
        long times = end - start;
        System.out.println("Current Time in milliseconds average = " + times);
        return nums;
    }

    public int[] bubbleSortGoodPractice(int[] nums) {
        int count = 0;
        boolean swap = true;
        long start = System.nanoTime();
        while(swap) {
            swap = false;
            count++;
            for (int i = 0; i < nums.length - count; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    swap = true;
                }
            }
        }
        long end = System.nanoTime();
        long times = end - start;
        System.out.println("Current Time in milliseconds best practice = " + times);
        return nums;
    }

    private void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

}
