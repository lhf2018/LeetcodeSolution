package array;

public class leetcode307 {
    /**
     * 因为有构造函数所以使用内部类
     */
    class NumArray {
        int[] num;
        //num[i+1]表示nums数组0到i的和
        public NumArray(int[] nums) {
            num=new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                num[i+1]=num[i]+nums[i];
            }
        }
        //数组要跟着更新，只需要每个都添加差值就行
        public void update(int i, int val) {
            int n=num[i+1]-num[i];
            int len=val-n;
            for(int k=i+1;k<num.length;k++){
                num[k]+=len;
            }
        }

        public int sumRange(int i, int j) {
            return num[j+1]-num[i];
        }
    }

}
