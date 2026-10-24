class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int[] freq = new int[101];
        for( int i = 0; i < nums.length; i++){
            result += freq[nums[i]];
            freq[nums[i]]++;
        }
        return result;
    }
}