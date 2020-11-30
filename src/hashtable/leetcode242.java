package hashtable;

public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        int[] chs=new int[26];
        for(char c:s.toCharArray()){
            chs[c-'a']++;
        }
        for(char c:t.toCharArray()){
            chs[c-'a']--;
            if(chs[c-'a']<0){
                return false;
            }
        }
        for(int i:chs){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
