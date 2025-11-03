import java.util.*;

// @leet imports end
// @leet start
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      
      for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
      }

      for (int i = 0; i < nums.length; i++) {
        int targetNum = target - nums[i];
        if (map.containsKey(targetNum) && map.get(targetNum) != i) {
          return new int[] {i, map.get(targetNum)};
        }
    }
       return new int[]{}; 
    }
}
// @leet end
