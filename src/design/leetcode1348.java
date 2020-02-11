package design;

import java.util.*;

/**
 * 题目：推文计数
 */
public class leetcode1348 {
    class TweetCounts {
        private Map<String, List<Integer>> map;
        public TweetCounts() {
            map = new HashMap<>();
        }

        public void recordTweet(String tweetName, int time) {
            if(!map.containsKey(tweetName)){
                map.put(tweetName,new ArrayList<>());
            }
            map.get(tweetName).add(time);
        }

        public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
            if (!map.containsKey(tweetName)) return new ArrayList<>();
            int tt=0;
            if(freq.equals("minute")){
                tt=60;
            }else if(freq.equals("hour")){
                tt=3600;
            }else{
                tt=24*3600;
            }
            List<Integer> list=map.get(tweetName);
            if(list.size()==0||list==null)return null;
            // System.out.println(list.get(0));
            List<Integer> res=new ArrayList<>();
            Collections.sort(list);
            map.put(tweetName,list);
            while(startTime<=endTime){

                int num=0;
                for(int i=0;i<list.size();i++){
                    if(list.get(i)>=startTime&&list.get(i)<Math.min(startTime+tt,endTime+1)){
                        num++;
                    }
                }
                startTime+=tt;
                res.add(num);
            }
            // System.out.println(res);
            return res;

        }
    }
}
