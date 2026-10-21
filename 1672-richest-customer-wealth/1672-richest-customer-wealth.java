class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] max=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                max[i]=sum;
            }
        }
        int rich=0;
        for(int i=0;i<max.length;i++){
                if(max[i]>rich){
                    rich=max[i];
                }
            }
        return rich;
    }   
}