package jay.leetcode.greedy;

public class no860 {
    public boolean lemonadeChange(int[] bills) {
        int[] left = new int[2];
        for(int i = 0; i < bills.length; ++i){
            if(bills[i]==5)
                left[0] += 1;
            else if(bills[i]==10){
                left[1] += 1;
                left[0] -= 1;
                if(left[0] < 0)
                    return false;
            }
            else {
                if(left[1] > 0){
                    left[1] -= 1;
                    left[0] -= 1;
                }
                else
                    left[0] -= 3;
                if(left[0] < 0)
                    return false;
            }
        }
        return true;
    }
}
