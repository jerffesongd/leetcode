class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();        
        boolean r = false;

        for (int i = 0; i < nums.length; i++) {
            
            int complemnto = target - nums[i];

            if (map.containsKey(complemnto)) {
                return new int[] {map.get(complemnto), i};
            }

            map.put(nums[i], i);

        };


        return null;

    }
}
