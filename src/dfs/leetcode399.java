package dfs;

import java.util.*;

/**
 * 参考博客：https://www.cnblogs.com/lightwindy/p/9750133.html
 */
public class leetcode399 {
    class Solution {
        Map<String, List<String>> maps=new HashMap<>();
        Map<String,List<Double>> mapd=new HashMap<>();
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            for(int i=0;i<equations.size();i++){
                List<String> list=equations.get(i);
                if(!maps.containsKey(list.get(0))){
                    maps.put(list.get(0),new ArrayList<>());
                    mapd.put(list.get(0),new ArrayList<>());
                }
                if(!maps.containsKey(list.get(1))){
                    maps.put(list.get(1),new ArrayList<>());
                    mapd.put(list.get(1),new ArrayList<>());
                }
                maps.get(list.get(0)).add(list.get(1));
                maps.get(list.get(1)).add(list.get(0));
                mapd.get(list.get(0)).add(values[i]);
                mapd.get(list.get(1)).add(1/values[i]);
            }
            double[] res=new double[queries.size()];
            for(int i=0;i<queries.size();i++){
                String a=queries.get(i).get(0);
                String b=queries.get(i).get(1);
                res[i]=-1.0;
                double temp=dfs(a,b,new HashSet<>(),1.0);
                if(temp==0.0){
                    res[i]=-1.0;
                }else{
                    res[i]=temp;
                }
            }
            return res;
        }
        private double dfs(String a,String b,HashSet<String> set,double value){
            if(set.contains(a))return 0.0;
            if (!maps.containsKey(a)) return 0.0;
            if (a.equals(b)) return value;
            set.add(a);
            double res=0;
            List<String> lists=maps.get(a);
            List<Double> listd=mapd.get(a);
            double temp=0.0;
            for(int i=0;i<lists.size();i++){
                temp=dfs(lists.get(i),b,set,value*listd.get(i));
                if(temp!=0.0)break;
            }
            set.remove(a);
            return temp;
        }
    }
}
