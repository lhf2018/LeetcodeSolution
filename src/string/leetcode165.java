package string;

public class leetcode165 {
    public int compareVersion(String version1, String version2) {
        String[] strs1=version1.split("\\.");
        String[] strs2=version2.split("\\.");
        int len=Math.max(strs1.length,strs2.length);
        for(int i=0;i<len;i++){
            int t1=i>strs1.length-1?0:Integer.parseInt(strs1[i]);
            int t2=i>strs2.length-1?0:Integer.parseInt(strs2[i]);
            if(t1>t2){
                return 1;
            }else if(t2>t1){
                return -1;
            }
        }

        return 0;
    }
}
