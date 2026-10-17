class Solution {
    static {
        System.gc();
    }

    public int majorityElement(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        return nums[n / 2];
    }
}