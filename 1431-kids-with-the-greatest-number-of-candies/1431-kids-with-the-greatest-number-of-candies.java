import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        boolean result;

        for (int i = 0; i < candies.length; i++) {
            result = true;

            for (int j = 0; j < candies.length; j++) {
                if (i == j) {
                    continue;
                }

                if (candies[i] + extraCandies < candies[j]) {
                    result = false;
                    break;
                }
            }

            if (result) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }

        return arr;
    }
}