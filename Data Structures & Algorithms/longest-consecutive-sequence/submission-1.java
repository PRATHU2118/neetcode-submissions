class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;       
        Arrays.sort(nums);
        int currLen = 1;
        int maxLen = 1;
        if (n==0){
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }
        return Math.max(maxLen, currLen);
    }
}
