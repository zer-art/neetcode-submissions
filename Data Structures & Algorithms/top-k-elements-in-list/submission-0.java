class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>() ;
        List<Integer>[] buckets = new  List[nums.length+1] ;
        for( int i = 0 ; i < nums.length ; i ++ ){ 
            if (map.containsKey(nums[i])){ 
                map.put(nums[i] , map.get(nums[i])+1) ; 
            }else { 
                map.put(nums[i] , 1) ; 
            }
        }
        for(Integer num : map.keySet()){ 
            int idx = map.get(num) ; 
            List<Integer> inner = new ArrayList<>(); 
            inner.add(num); 
            if (buckets[idx]!= null){ 
                buckets[idx].add(num);
            }
            else { 
                buckets[idx] = inner ;      
            }
            
        }
        int[] topK = new int [k]; 
        int i = nums.length;
        int j = 0 ; 
        while (j < k) { 
            if (buckets[i] != null ){ 
                int m = 0 ; 
                while (m < buckets[i].size() && j < k){ 
                    topK[j] = buckets[i].get(m) ; 
                    m++ ; 
                    j++ ; 
                }
            }
            i-- ; 
        }
        return topK ;  
    }
}
