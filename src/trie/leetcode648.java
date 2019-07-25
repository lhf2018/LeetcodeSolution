package trie;

import java.util.List;

/**
 * 使用前缀树来进行查找
 */
public class leetcode648 {
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode root = new TrieNode();
        // 构建 Trie 树
        TrieNode cur;
        for (String tmp : dict) {
            cur = root;
            for (char c : tmp.toCharArray()) {
                if (cur.children[c - 'a'] == null) cur.children[c - 'a'] = new TrieNode();
                cur = cur.children[c - 'a'];
            }
            cur.word = tmp;
        }

        // 在 Trie 树中搜索 sentence
        String[] words = sentence.split(" ");
        for (int i=0;i<words.length;i++) {
            cur = root;
            for (char c : words[i].toCharArray()) {
                if (cur.children[c - 'a'] == null || cur.word != null) break;
                cur = cur.children[c - 'a'];
            }
            if(cur.word != null){
                words[i]=cur.word;
            }
        }
        return String.join(" ",words);
    }
    static class TrieNode {
        String word;
        TrieNode[] children = new TrieNode[26];

        TrieNode() {
        }
    }
}
