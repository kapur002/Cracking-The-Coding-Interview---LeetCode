import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        //TEST CASE:
        //[2, 7, 11, 15]
        //TARGET = 9

        //We want two loops, we want to compare each position against a position
        //starting at 0th position. This way, we can increment 0th position once
        //we are positive that the combination of 0th position & each indice
        //of array cannot possibly equal the target.

//        for(int i = 0; i < nums.length; i++){
//            //now we want to loop with our second comparison point
//            //this comparison point will check to see if i is equal to comparison pt - target
//            //if it is, then those i and comparison point will equal target
//            //if not, we should throw an exception.
//            for(int j = i + 1; j < nums.length; j++){
//                if (nums[i] == target - nums[j]){
//                    return new int[] {i , j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No possible solution for target!");
//    }

        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }

        return null;
}
