package jay.leetcode.dynamic;

public class no343 {
    public int integerBreak(int n) {
        int temp = 0;
        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i = 2; i <= n; ++i){
            for(int j = 1; j < i; ++j){
               temp = Math.max(j*(i-j), j * dp[i-j]);
               dp[i] = Math.max(dp[i], temp);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        no343 no343 = new no343();
        System.out.println(no343.integerBreak(10));
    }
}
