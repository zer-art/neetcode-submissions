class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();
        HashMap<List<Integer>,Integer > map = new HashMap<>();
        
        for ( int i = 0  ;i < strs.length ; i ++)  { 
            String currentWord = strs[i];

            List<Integer> count = new ArrayList<>(Collections.nCopies(26, 0));
            for (char c : currentWord.toCharArray()){ 
                int index = c - 'a';
                int currentCount = count.get(index);
                count.set(index, currentCount + 1);
            }

            if(map.containsKey(count)){ 
                int index = map.get(count);
                outer.get(index).add(currentWord);
            }
            else {
                List<String> inner = new ArrayList<>() ; 
                inner.add(currentWord) ; 
                outer.add(inner); 
                map.put(count , outer.size()-1) ; 
            } 
        } 
        return outer ; 
    }
}
