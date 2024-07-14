package medium;
/*
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be uniqu
* */
public class GasStationCircuit {

    public static void main(String[] args) {

      int[]  gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        for (int c : cost) {
            sumCost += c;
        }
        int sumGas = 0;
        for (int g : gas) {
            sumGas += g;
        }
        // Check if it is possible to complete the journey
        if (sumCost > sumGas) {
            return -1;
        }

        int currentGas = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                startingIndex = i + 1;
            }
        }
        return startingIndex;
    }
}
