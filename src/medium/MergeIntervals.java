package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
* */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new LinkedList<>();
        int size = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < size; i++) {
            if (end >= intervals[i][0]) {
                if (end < intervals[i][1]) {
                    end = intervals[i][1];
                }

                continue;
            }

            list.add(new int[]{start, end});
            start = intervals[i][0];
            end = intervals[i][1];
        }

        list.add(new int[]{start, end});

        // int[][] ans = new int[list.size()][2];
        // int j = 0;

        // for (int[] i : list) {
        //     ans[j][0] = i[0];
        //     ans[j][1] = i[1];
        //     j++;
        // }

        return list.toArray(new int[0][0]);
    }
}
