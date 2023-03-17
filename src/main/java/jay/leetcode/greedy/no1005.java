package jay.leetcode.greedy;

import java.util.Arrays;

public class no1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int index = 0;
        while(k!=0){
            if(nums[index] < 0 )
                nums[index] = -nums[index];
            else if(nums[index]==0)
                break;
            else {
                int judge = k % 2;
                if(index > 0 && nums[index] > nums[index-1]){
                    if(judge==1)
                        nums[index-1] = -nums[index-1];
                }
                else {
                    if(judge==1)
                        nums[index] = -nums[index];
                }
                break;
            }
            k--;
            if(index < nums.length -1)
                index++;
        }
        for(int i = 0; i < nums.length; ++i)
            sum += nums[i];
        return sum;
    }

    public static void main(String[] args) {
        no1005 no1005 = new no1005();
        int[] nums = {-2,9,9,8,4};
        no1005.largestSumAfterKNegations(nums, 5);
    }
}
