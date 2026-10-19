class Solution {
    public boolean isPalindrome(int x) {
        int value=0;
        int x1=x;
        if(x<0){
            return false;
        }else{
            while(x1>0){
                value=value*10 + x1%10;
                x1=x1/10;
        }
        if (value==x){
            return true;
        }else{
            return false;
        }
        }
    }
}