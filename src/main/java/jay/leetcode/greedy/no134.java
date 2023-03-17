package jay.leetcode.greedy;

public class no134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int debt = 0;
        int temp = 0;
        int index = 0;
        int[] restFuel = new int[gas.length];
        int gasSum = 0;
        for (int i = 0; i < gas.length; ++i){
            restFuel[i] = gas[i] - cost[i];
            gasSum += restFuel[i];
        }
        if(gasSum < 0)
            return -1;
        for(int i = 0; i < gas.length ;++i){
            debt += restFuel[i];
            if((debt < 0 && temp == 0) || (temp < 0 && debt < temp)){
                index = i+1;
                temp = debt;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        no134 no134 = new no134();
        int[] gas = {6,1,4,3,5};
        int[] cost = {3,8,2,4,2};
        no134.canCompleteCircuit(gas, cost);
    }
}
