package string;

public class leetcode680 {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return helper(s,start+1,end)||helper(s,start,end-1);
            }
        }
        return true;
    }
    public boolean helper(String str,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
