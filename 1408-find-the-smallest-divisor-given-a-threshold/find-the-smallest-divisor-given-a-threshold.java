class Solution {
    // Helper function to calculate sum of ceilings
    public int divv(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;  // Efficient ceil logic
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;  // start from 1
        int e = 0;

        // Find maximum element for upper bound of binary search
        for (int num : nums) {
            e = Math.max(e, num);
        }

        // Binary search
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (divv(nums, mid) <= threshold) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }
}
