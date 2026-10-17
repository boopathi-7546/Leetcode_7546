class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";
        if (nums.length == 1)
            return String.valueOf(nums[0]);

        final int RADIX = 10; 
        int n = nums.length; 
        int maxLen = 0; 
        int secondMaxLen = 0; 
        String[] a = new String[n];
        String[] auxSorted = new String[n];

        for (int i=0; i<n; i++){
            a[i] = String.valueOf(nums[i]); 
            int curLen = a[i].length(); 
            if (curLen > maxLen){
                secondMaxLen = maxLen; 
                maxLen = curLen; 
            }
            else if (curLen > secondMaxLen){
                secondMaxLen = curLen; 
            }            
        }

        int len = maxLen + secondMaxLen - 1; 
        for (int d=len-1; d >=0; d--){
            // count frequencies
            // compute cummulates
            // distribute data
            // copyBack

            int[] count = new int[RADIX + 1]; 
            for (int i=0; i<n; i++){
                int digit = getDigit(a[i], d); 
                count[digit+1]++; 
            }
            for (int r=0; r < RADIX; r++){
                count[r+1] += count[r]; 
            }

            for (int i=0; i<n; i++){
                int digit = getDigit(a[i], d); 
                int cummulateIndex = count[digit];
                auxSorted[cummulateIndex] = a[i]; 
                count[digit]++; 
            }

            for (int i=0; i<n; i++){
                a[i] = auxSorted[i]; 
            }
        }

        StringBuilder sb = new StringBuilder(); 
        for (int i=n-1; i>=0; i--){
            sb.append(a[i]);
        }
        return (sb.charAt(0) == '0') ? "0" : sb.toString(); 
    }

    public int getDigit(String s, int d){
        d = d%s.length(); 
        return Character.getNumericValue(s.charAt(d));
    }
}