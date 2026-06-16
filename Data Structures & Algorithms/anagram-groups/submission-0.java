class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        List<List<String>> ans = new ArrayList();
        for(String s: strs){
           char[] word= s.toCharArray();
           Arrays.sort(word);
           String key = new String(word);
           if(map.containsKey(key)){
              map.get(key).add(s);
           }
           else{
            List<String> l = new ArrayList();
            ans.add(l);
            l.add(s);
            map.put(key,l);
           }
        }
       return ans;
    }
}
