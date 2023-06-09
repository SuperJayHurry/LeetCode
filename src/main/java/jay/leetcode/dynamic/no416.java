package jay.leetcode.dynamic;

public class no416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int[] dp = new int[target+1];
        for(int i = 0 ; i < nums.length ;++i){
            for(int j = target; j >=0 ; j--){
                if(j >= nums[i])
                    dp[j] = Math.max(dp[j], dp[j-nums[i]] + nums[i]);
            }
            if(dp[target]==target)
                return true;
        }
        return false;
    }
}
