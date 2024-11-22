class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int s1count[]=new int[26];
        int s2count[]=new int[26];
        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
            
        }
        int matches=0;
        for(int i=0;i<26;i++){
           if(s1count[i]==s2count[i]) matches++;
        }
        int l=0;
        for(int r=s1.length();r<s2.length();r++){
            if(matches==26) return true;
            //since we have added r
            int index=s2.charAt(r)-'a';
            s2count[index]++;
            if(s1count[index]==s2count[index]) matches++;
            else if(s1count[index]+1==s2count[index]) matches--;
            
            //now we need to remove from l side
            index=s2.charAt(l)-'a';
            s2count[index]--;
            if(s1count[index]==s2count[index]) matches++;
            else if(s1count[index]==s2count[index]+1)matches--;
            
            l++;
        }
        return matches==26;
        
    }
}