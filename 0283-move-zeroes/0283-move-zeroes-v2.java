class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int start=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]==0){
                    start=nums[i];
                    nums[i]=nums[j];
                    nums[j]=start;
                }
            }
        }
    }
}