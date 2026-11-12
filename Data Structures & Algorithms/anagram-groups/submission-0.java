class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> inp = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedkey = new String(chars);

            if(!inp.containsKey(sortedkey)){
                inp.put(sortedkey, new ArrayList<>());
            }
            inp.get(sortedkey).add(word);
        }
        return new ArrayList<>(inp.values());
    }
}
