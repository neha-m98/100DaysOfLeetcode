class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //first create a map with key as strings and value as a list of anagrams
        //loop through each string in an array and conver to array and sort it
        //put it back as string
        //check is map already has that key,if yes add the original string to the map
        //else create a new key-value pair 
        //return the map values
        
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(hm.containsKey(key)){
                hm.get(key).add(s);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                hm.put(key,list);
            }
        }
        return new ArrayList<>(hm.values());
    }
}