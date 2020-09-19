package math;

public class leetcode43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int m=num1.length();
        int n=num2.length();
        int[] nums=new int[m+n];
        for(int i=m-1;i>=0;i--){
            int x=num1.charAt(i)-'0';
            for(int j=n-1;j>=0;j--){
                int y=num2.charAt(j)-'0';
                nums[i+j+1]+=x*y;
            }
        }
        for(int i=m+n-1;i>=1;i--){
            nums[i-1]+=(nums[i]/10);
            nums[i]=nums[i]%10;
        }
        StringBuilder sb=new StringBuilder();
        int index=nums[0]==0?1:0;
        for(int i=index;i<nums.length;i++){
            sb.append(nums[i]);
        }
        return sb.toString();
    }
}
