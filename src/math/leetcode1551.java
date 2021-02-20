package math;

public class leetcode1551 {
    public int minOperations(int n) {
        return (n-1+(n+1)%2)*((n+1)/2)/2;
    }
}
