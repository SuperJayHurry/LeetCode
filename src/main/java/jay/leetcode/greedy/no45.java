package jay.leetcode.greedy;

public class no45 {
    public int jump(int[] nums) {
        int nowCoverRange = 0;
        int tempCoverRange = 0;
        int step = 0;
        for(int i = 0; nowCoverRange < nums.length - 1;++i){
            tempCoverRange = Math.max(tempCoverRange , i + nums[i]);
            if(i == nowCoverRange){
                nowCoverRange = tempCoverRange;
                step++;
            }
        }
        return step;
    }
}
