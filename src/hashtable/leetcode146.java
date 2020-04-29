package hashtable;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * linkedhashmap是有序的，需要重写其中的方法removeEldestEntry
 */
public class leetcode146 {
    class LRUCache {
        int limit;
        Map<Integer,Integer> map;
        public LRUCache(int capacity) {
            limit=capacity;
            map=new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return map.size()>capacity;
                }
            };
        }

        public int get(int key) {
            if(map.containsKey(key)){
                return map.get(key);
            }else{
                return -1;
            }
        }

        public void put(int key, int value) {
            map.put(key,value);
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
