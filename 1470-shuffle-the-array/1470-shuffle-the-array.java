class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i + n];
        }
        for (int i = n - 1; i >= 0; i--) {
            nums[2 * i] = nums[i];
            nums[2 * i + 1] = arr[i];
        }
        return nums;
    }
}