package weeklycontest;

import java.util.ArrayList;
import java.util.List;

public class leetcode1249 {
    class Solution {
        public String minRemoveToMakeValid(String s) {
            List<Character> list1=new ArrayList<>();
            List<Character> list2=new ArrayList<>();
            int num=0;
            int temp=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='('){
                    temp++;
                }
                if(ch==')'){
                    if(temp==0){
                        continue;
                    }else{
                        temp--;
                    }
                }
                list1.add(ch);
            }
            // for(int i=0;i<list1.size();i++){
            //     System.out.println(list1.get(i));
            // }
            temp=0;
            for(int i=list1.size()-1;i>=0;i--){
                char ch=list1.get(i);
                if(ch==')'){
                    temp++;
                }
                if(ch=='('){
                    if(temp==0){
                        continue;
                    }else{
                        temp--;
                    }
                }
                list2.add(ch);
            }
            StringBuilder sb=new StringBuilder();
            for(int i=list2.size()-1;i>=0;i--){
                sb.append(list2.get(i));
            }

            return sb.toString();
        }
    }
}
