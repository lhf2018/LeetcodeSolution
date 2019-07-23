package hashtable;

import java.util.HashSet;
import java.util.Set;

public class leetcode676 {
    Set<String> set;
    /** Initialize your data structure here. */
    /**
     * 自行修改为
     * public MagicDictionary() {
     *         set = new HashSet<String>();
     * }
     */
    public leetcode676() {
        set = new HashSet<String>();
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(int i = 0; i < dict.length; i++){
            set.add(dict[i]);
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        for(String s : set){
            if(diffIs1(word, s)) {
                return true;
            }
        }
        return false;
    }

    public boolean diffIs1(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return count == 1 ? true : false;
    }
}
