class Solution {
    public int findPeakElement(int[] nums) {

        int low = 0;
        int end = nums.length - 1;

        while (low < end) {

            int mid = low + (end - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // We are going downhill
                // Peak is on left side, including mid
                end = mid;
            } 
            else {
                // We are going uphill
                // Peak is on right side
                low = mid + 1;
            }
        }

        return low;
    }
}