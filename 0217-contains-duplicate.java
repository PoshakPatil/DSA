import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet();
        for ( int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
      }
    }
        
//         for ( int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) return true;
//             }
//         }
//        return false;
//     }