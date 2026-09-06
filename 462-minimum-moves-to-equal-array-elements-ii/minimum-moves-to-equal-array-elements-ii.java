class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median =nums[nums.length/2];
        int  operation=0;
        for(int num:nums){
            operation+=Math.abs(num-median);
        }
        return operation;
        
    }
}