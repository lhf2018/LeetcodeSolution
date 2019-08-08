package double_pointer;

/**
 * 使用双指针
 */
public class leetcode481 {
    public int magicalString(int n) {
        if(n==0)return 0;
        if(n<=3) return 1;
        int[] list=new int[n];
        list[0]=1;
        list[1]=2;
        list[2]=2;
        int index=2;//这个位置的指针查看此处是1还是2
        int p=3; //记录添加数字位置的指针
        int res=1;//记录1的数量
        while(p<n){
            //如果list[index]为1意味着应该添加一个数字
            if(list[index]==1){
                //如果前一个是1那么这里添加2
                if(list[p-1]==1){
                    list[p++]=2;
                }else{
                    list[p++]=1;
                    res++;
                }
            }else{//如果list[index]为2意味着应该添加两个数字
                if(list[p-1]==1){
                    list[p++]=2;
                    //如果到最后了跳出
                    if(p==n){
                        break;
                    }
                    list[p++]=2;
                }else{
                    list[p++]=1;
                    //如果到最后了跳出
                    if(p==n){
                        res++;
                        break;
                    }
                    list[p++]=1;
                    res+=2;
                }
            }
            index++;
        }
        return res;
    }
}
