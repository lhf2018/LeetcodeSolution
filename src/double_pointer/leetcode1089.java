package double_pointer;

public class leetcode1089 {
    public void duplicateZeros(int[] arr) {
        int count=0;
        int num=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(i+num<arr.length){
                if(arr[i]==0){
                    num++;
                }
                count=i;
                if(i+num==arr.length){
                    flag=true;
                    break;
                }
            }
        }
        int index=arr.length-1;
        for(int i=count;i>=0;i--){
            if(arr[i]==0){
                if(i==count&&flag){
                    arr[index--]=arr[i];
                    continue;
                }
                arr[index--]=0;
            }
            arr[index--]=arr[i];
        }
    }
}
