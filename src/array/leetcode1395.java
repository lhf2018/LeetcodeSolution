package array;

public class leetcode1395 {
    public int numTeams(int[] rating) {
        int res=0;
        for(int i=0;i<rating.length;i++){
            int left_up=0;
            int right_up=0;
            int left_down=0;
            int right_down=0;
            for(int j=0;j<i;j++){
                if(rating[i]>rating[j]){
                    left_down++;
                }else if(rating[i]<rating[j]){
                    left_up++;
                }
            }
            for(int j=i+1;j<rating.length;j++){
                if(rating[i]>rating[j]){
                    right_down++;
                }else if(rating[i]<rating[j]){
                    right_up++;
                }
            }
            res+=(left_down*right_up+left_up*right_down);
        }
        return res;
    }
}
