class Solution {

    public String encode(List<String> strs) {
     StringBuilder estring = new StringBuilder();
     for(String str : strs){
       estring.append(str.length()).append("*").append(str); 
     }
     return estring.toString();
    }

    public List<String> decode(String str) {
      List<String> dstring = new ArrayList<>();
      int i=0;
      while(i<str.length()){
        int j=i;
        while(str.charAt(j) != '*'){
            j++;
        } 
        int len = Integer.parseInt(str.substring(i,j));
        String word = str.substring(j+1,j+1+len);
        dstring.add(word);
        i=j+1+len;
      }
      return dstring;
    }
}
