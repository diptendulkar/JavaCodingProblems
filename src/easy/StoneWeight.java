package easy;

import java.util.*;

public class StoneWeight {
    //Game with stones weights
   /*You are given an array of integers stones where stones[i] is the weight of the ith stone.
    We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
     Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
*/
    public static void main(String[] args) {
        int[] weight = {2,7,4,1,8,1};


        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : weight){
            pq.add(num);
        }

        while(pq.size() > 1) {
            int s1 = pq.remove(), s2 = pq.remove();
            int diff = s1 - s2;
            if(diff > 0) pq.add(diff);
        }

        System.out.println(pq.isEmpty()?12:pq.remove());

    }
}
