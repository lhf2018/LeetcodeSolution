package string;

/**
 * 时间：1ms
 * 击败 98%
 * 遍历一遍就能计算
 */
public class leetcode1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        int len=address.length();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
