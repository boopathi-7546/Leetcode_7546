class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i : nums){
            if(getCount(i)){
                result++;
            }
        }
        return result;
    }
    public boolean getCount(int num){
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }
}
