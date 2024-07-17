class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagram_groups = new ArrayList<>();
        HashMap<Double,Integer> map = new HashMap<>();
        for(String str : strs){
            double string_value = calculate_value(str);
            if(map.containsKey(string_value)){
                anagram_groups.get(map.get(string_value)).add(str);
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(str);
            map.put(string_value,anagram_groups.size());
            anagram_groups.add(list);
           
        }
        return anagram_groups;
    }

    public double calculate_value(String str){
        int[] prime_number = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double str_value = 1;
        int index;
        for(char c : str.toCharArray()){
            index = c - 'a';
            str_value *= prime_number[index];
        }
        return str_value;

    }
}