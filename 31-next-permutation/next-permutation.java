class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        // Step 1: Find first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            // Entire array is non-increasing, reverse it
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find just-larger element to the right of idx
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                // Swap
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        // Step 3: Reverse the subarray to the right of idx
        reverse(nums, idx + 1, n - 1);
    }

    private void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
