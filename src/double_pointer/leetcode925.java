package double_pointer;

public class leetcode925 {
    public boolean isLongPressedName(String name, String typed) {
        int start1=0;
        int start2=0;
        while(start1<name.length()&&start2<typed.length()){
            if(name.charAt(start1++)!=typed.charAt(start2++)){
                return false;
            }
            int count1=0;
            while(start1<name.length()&&name.charAt(start1)==name.charAt(start1-1)){
                start1++;
                count1++;
            }
            int count2=0;
            while(start2<typed.length()&&typed.charAt(start2)==typed.charAt(start2-1)){
                start2++;
                count2++;
            }
            if(count1>count2){
                return false;
            }
        }

        return start1==name.length()&&start2==typed.length();
    }
}
