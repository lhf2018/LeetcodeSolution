package bit;

public class leetcode67 {
    public String addBinary(String a, String b) {
        int pointera=a.length()-1;
        int pointerb=b.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(pointera>=0&&pointerb>=0){
            char c1=a.charAt(pointera--);
            char c2=b.charAt(pointerb--);
            int temp=(c1-'0')+(c2-'0')+carry;
            if(temp==3){
                carry=1;
                sb.append('1');
            }else if(temp==2){
                carry=1;
                sb.append('0');
            }else{
                carry=0;
                sb.append((char)(temp+'0'));
            }
        }
        while(pointera>=0){
            char c1=a.charAt(pointera--);
            int temp=(c1-'0')+carry;
            if(temp==2){
                carry=1;
                sb.append('0');
            }else{
                carry=0;
                sb.append((char)(temp+'0'));
            }
        }
        while(pointerb>=0){
            char c2=b.charAt(pointerb--);
            int temp=(c2-'0')+carry;
            if(temp==2){
                carry=1;
                sb.append('0');
            }else{
                carry=0;
                sb.append((char)(temp+'0'));
            }
        }
        if(carry==1)sb.append('1');
        return sb.reverse().toString();
    }
}
