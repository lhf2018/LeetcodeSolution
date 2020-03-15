package z_need_upgrade;

import java.util.ArrayList;
import java.util.List;

public class No5357 {
    class CustomStack {
        List<Integer> list;
        int maxSize;
        public CustomStack(int maxSize) {
            list=new ArrayList<>();
            this.maxSize=maxSize;
        }

        public void push(int x) {
            if(list.size()<maxSize){
                list.add(x);
            }
            // System.out.println("hello");
        }

        public int pop() {
            // System.out.println("hello");
            return list.size()==0?-1:list.remove(list.size()-1);
        }

        public void increment(int k, int val) {
            for(int i=0;i<k;i++){
                if(i>list.size()-1)break;
                list.set(i,list.get(i)+val);
                // int temp=list.remove(list.size()-i-1);
                // temp+=val;
                // list.add(list.size()-i-1,temp);
            }
        }
    }
}
