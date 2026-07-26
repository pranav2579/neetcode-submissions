class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        int[] first = new int[26];
        int[] second = new int[26];

        for (int i = 0; i< s.length();  i++){
            first[s.charAt(i) - 97 ]++;
            second[t.charAt(i) - 97]++;
        }

        for (int j = 0; j< 26;  j++){
            if(first[j] != second[j]){
                return false;
            }

        }

        return true;
    }
}
