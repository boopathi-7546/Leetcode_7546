class Solution {
    public boolean containsDuplicate(int[] nums) {
        System.gc();
        // List<Integer> visited = new List<>();
        // HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer>  s = new HashSet<>();
        int len = nums.length;
        for(int i=0;i<len;++i){
        // for (int num : nums){
            // if(!visited.add(num))
            //     return true;
            s.add(nums[i]);
        }
        if(len!=s.size()){
            return true;
        }
        else{
            return false;
        }
    }
}