package array;

public class leetcode1160 {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] ch=new int[130];
            for(Character c:chars.toCharArray()){
                ch[c]++;
            }
            int sum=0;
            OUTER:
            for(String str:words){
                int[] c=new int[130];
                for(int j=0;j<str.length();j++){
                    c[str.charAt(j)]++;
                    if(c[str.charAt(j)]>ch[str.charAt(j)]){
                        continue OUTER;
                    }
                }
                sum+=str.length();
            }
            return sum;
        }
    }
}
