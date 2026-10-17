class Solution {
    public int subtractProductAndSum(int n) {
        int a=1;
        int b=0;
        while(n>0){
            int n1=n%10;
            n=n/10;
            a=a*n1;
            b=b+n1;
        }
        return a-b;
    }
}