package string;

public class leetcode1763 {
    public String maximumTime(String time) {
        char a=time.charAt(0);
        char b=time.charAt(1);
        char c=time.charAt(3);
        char d=time.charAt(4);
        if(a=='?'){
            if(b!='?'&&b>'3'){
                a='1';
            }else if(b < '4'){
                a='2';
            }else{
                a='2';
                b='3';
            }
        }
        if(b=='?'){
            if(a < '2'){
                b='9';
            }else if(a == '2'){
                b='3';
            }
        }
        if(c=='?'){
            c='5';
        }
        if(d=='?'){
            d='9';
        }
        StringBuilder sb=new StringBuilder();
        sb.append(a).append(b).append(':').append(c).append(d);
        return sb.toString();
    }
}
