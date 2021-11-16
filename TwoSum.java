//Brute Force Approach
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target -  nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}

//Two-Pass Hash Table
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();        //creating empty HashMap called map
        for (int i = 0; i < nums.length; i++) {             //iterate through nums array
            map.put(nums[i], i);                            //places each number with index into map
        }

        for (int i = 0; i < nums.length; i++) {                                  //iterate though nums again
            int complement = target - nums[i];                                   //new varaible that holds the number we are looking for
            if (map.containsKey(complement) && map.get(complement) != i) {       //checks if complement is a key in the map and if the map is also not itself
                return new int[] { i, map.get(complement) };                     //in a new array, returns
            }
        }

        return null;
    }
}