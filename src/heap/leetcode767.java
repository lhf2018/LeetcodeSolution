package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode767 {
    public String reorganizeString(String S) {
        int mid=(S.length()+1)/2;
        int[] chs=new int[26];
        for(char s:S.toCharArray()){
            chs[s-'a']++;
        }
        for(int i:chs){
            if(i>mid){
                return "";
            }
        }
        PriorityQueue<Node> queue=new PriorityQueue<>(new Comparator<Node>(){
            @Override
            public int compare(Node o1, Node o2){
                return o2.count-o1.count;
            }
        });
        for(int i=0;i<chs.length;i++){
            if(chs[i]>0){
                queue.offer(new Node((char)(i+'a'),chs[i]));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(queue.size()>1){
            Node n1=queue.poll();
            Node n2=queue.poll();
            sb.append(n1.letter);
            sb.append(n2.letter);
            if (--n1.count > 0) queue.add(n1);
            if (--n2.count > 0) queue.add(n2);
        }
        if(queue.size()>0){
            sb.append(queue.poll().letter);
        }
        return sb.toString();
    }
    class Node{
        int count;
        char letter;
        Node(char letter,int count){
            this.letter=letter;
            this.count=count;
        }
    }
}
