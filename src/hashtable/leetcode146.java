package hashtable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class leetcode146 {
    /**
     * 实现一:linkedhashmap是有序的，需要重写其中的方法removeEldestEntry
     */
    class LRUCache1 {
        int limit;
        Map<Integer,Integer> map;
        public LRUCache1(int capacity) {
            limit=capacity;
            map=new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
                @Override
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
     * 实现二
     */
    class LRUCache2 {
        private Map<Integer,Node> map=new HashMap<>();
        int size;
        int capacity;
        private Node head,tail;

        public LRUCache2(int capacity) {
            this.size=0;
            this.capacity=capacity;
            head=new Node();
            tail=new Node();
            head.next=tail;
            tail.pre=head;
        }

        public int get(int key) {
            Node node=map.get(key);
            if(node==null){
                return -1;
            }
            moveToHead(node);
            return node.val;

        }
        private void addToHead(Node node) {
            node.pre = head;
            node.next = head.next;
            head.next.pre = node;
            head.next = node;
        }

        private void removeNode(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        private void moveToHead(Node node) {
            removeNode(node);
            addToHead(node);
        }
        private Node removeTail() {
            Node res = tail.pre;
            removeNode(res);
            return res;
        }

        public void put(int key, int value) {
            Node node=map.get(key);
            if(node==null){
                Node new_node=new Node(key,value);
                map.put(key,new_node);
                addToHead(new_node);
                size++;
                if(size>capacity){
                    Node temp_tail=removeTail();
                    map.remove(temp_tail.key);
                    size--;
                }
            }else{
                node.val=value;
                moveToHead(node);
            }
        }
    }
}
class Node{
    int key;
    int val;
    Node pre;
    Node next;
    public Node(){
    }
    public Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
