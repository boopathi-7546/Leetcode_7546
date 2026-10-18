class Solution {
    public int findNumbers(int[] nums) {
        int last=0;
        for(int i=0;i<nums.length;i++){
            int first=0;
            int n=nums[i];
            while(n>0){
                n=n/10;
                first++;
            }
            if(first%2==0){
                last++;
            }
        }
        return last;
    }
}