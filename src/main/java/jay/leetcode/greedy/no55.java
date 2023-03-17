package jay.leetcode.greedy;

public class no55 {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
            return true;
        int coverRange = 0;
        for(int i = 0; i <= coverRange; ++i){
            if(coverRange>= nums.length-1)
                return true;
            coverRange = Math.max(coverRange,i + nums[i]);
        }
        return false;
    }
}
