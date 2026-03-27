// 134. Gas Station
package Leetcode.Medium;

public class Leet_134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            totalTank = totalTank + diff;
            currentTank = currentTank + diff;

            if(currentTank < 0){
                start = i + 1;
                currentTank = 0;
            }
        }
        return totalTank >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        Leet_134 obj = new Leet_134();
        System.out.println(obj.canCompleteCircuit(gas, cost));
    }
}
