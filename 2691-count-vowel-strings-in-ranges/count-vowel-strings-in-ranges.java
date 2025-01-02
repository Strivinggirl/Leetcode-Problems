class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            if (isVowelString(words[i])) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefix[r + 1] - prefix[l];
        }
        
        return result;
    }
    
    private boolean isVowelString(String word) {
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        return isVowel(first) && isVowel(last);
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}