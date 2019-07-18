package string;

/**
 * 遍历字符串，在abc中的ab中插入abc（aabcb），在bc中插入abc（babcc），在a前面插入abc（abca）
 * 可知，a的前面可以为abc，b的前面只能为ac，c的前面只能为bc
 * 遍历字符串，碰到a，flag+1，碰到c，flag-1，如果flag<0，证明c和a的位置出现了颠倒，则返回false
 */
public class leetcode1003 {
    public boolean isValid(String S) {
        int flag=0;
        //存放前面的字符
        char pre='1';
        for(char ch:S.toCharArray()){
            switch(ch){
                case 'a':
                    flag++;
                    break;
                case 'b':
                    if(pre=='b'){
                        return false;
                    }
                    break;
                case 'c':
                    if(pre=='a'){
                        return false;
                    }
                    flag--;
                    if(flag<0)return false;
                    break;
            }
            pre=ch;
        }
        return flag==0;
    }
}
