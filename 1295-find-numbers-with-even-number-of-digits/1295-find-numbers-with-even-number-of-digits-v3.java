class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int ele : nums){
            if(((int)Math.log10(ele)+1) % 2==0){
                count++;
            }
        }
        return count;
    }
}