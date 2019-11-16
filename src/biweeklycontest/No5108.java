package biweeklycontest;

public class No5108 {
    class Solution {
        public String encode(int num) {
            if(num==0)return "";
            int temp=1;
            int all=(int)(Math.pow(2,temp));
            while(num>all){
                temp++;
                all+=(int)(Math.pow(2,temp));
            }
            int start=num-(int)(Math.pow(2,temp))+1;
            String a=Integer.toBinaryString(start);
            // System.out.println(a);
            // System.out.println(temp);
            int len=a.length();
            for(int i=0;i<temp-len;i++){
                a="0"+a;
            }
            return a;
        }
    }
}
