package array;

/**
 * 统计这三种颜色每一种的数量，然后对nums遍历一遍重新赋值
 */
public class leetcode75 {
    public void sortColors(int[] nums) {
        //数字0
        int num0=0;
        //数字1
        int num1=0;
        //数字2
        int num2=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0:num0++;
                    break;
                case 1:num1++;
                    break;
                case 2:num2++;
                    break;
            }
        }
        //重新赋值
        int index=0;
        for(int i=0;i<num0;i++){
            nums[index++]=0;
        }
        for(int i=0;i<num1;i++){
            nums[index++]=1;
        }
        for(int i=0;i<num2;i++){
            nums[index++]=2;
        }
    }

}
