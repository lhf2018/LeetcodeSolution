package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 思路:
 * 个人思路是利用一个队列来存放所有钥匙，使用一个boolean型数组来计算这个房间是否被访问过，如果访问过这个房间，就进入房间把所有的钥匙放入这个队列里，如果没访问过这个房间，就不再进入这个房间存放钥匙。
 * 最后遍历数组，如果有没访问过的数组，就return false
 */
public class leetcode841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] room=new boolean[rooms.size()];
        Queue<Integer> key=new LinkedList<>();
        room[0]=true;
        int num=rooms.get(0).size();
        for(int i=0;i<num;i++){
            key.offer(rooms.get(0).get(i));
        }
        while(!key.isEmpty()){
            int temp=key.poll();
            int len=rooms.get(temp).size();
            for(int i=0;i<len;i++){
                if(room[temp]){
                    break;
                }
                key.offer(rooms.get(temp).get(i));

            }
            room[temp]=true;
        }
        for(int i=0;i<room.length;i++){
            if(!room[i]){
                // System.out.println(i);
                return false;
            }
        }
        return true;

    }
}
