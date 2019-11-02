package biweeklycontest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 5097. 力扣排行榜
 */
public class No5097 {
    class Leaderboard {
        Map<Integer,Integer> map=new HashMap<>();

        public Leaderboard() {

        }

        public void addScore(int playerId, int score) {
            map.put(playerId,map.getOrDefault(playerId,0)+score);
        }

        public int top(int K) {
            int[] temp=new int[map.size()];
            int num=0;
            for(Integer i:map.keySet()){
                temp[num++]=map.get(i);
            }
            Arrays.sort(temp);
            int res=0;
            for(int i=temp.length-1;i>temp.length-1-K;i--){
                res+=temp[i];
            }
            return res;
        }

        public void reset(int playerId) {
            map.put(playerId,0);
        }
    }

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */
}
