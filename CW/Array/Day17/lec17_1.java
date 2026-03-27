// 26th February 2026
package CW.Array.Day17;

public class lec17_1 {

    public static int gasStation(int[] gas, int[] cost) {
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
        int result = gasStation(gas, cost);
        System.out.println(result);
    }
}
