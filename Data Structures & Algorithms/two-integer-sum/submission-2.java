class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int remain = 0 ; 
        for(int i = 0 ; i  < nums.length ; i ++){ 
            remain = target - nums[i] ; 
            if (map.containsKey(remain)){ 
                return new int[]{map.get(remain) , i} ;
            }
            map.put(nums[i] , i ) ; 
        }
        return new int[]{-1 , -1 } ;
    }
}
