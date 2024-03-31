package hard;

import java.util.*;

/*
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:

MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
Example 1:

Input
["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
[[], [1], [2], [], [3], []]
Output
[null, null, null, 1.5, null, 2.0]

Explanation
MedianFinder medianFinder = new MedianFinder();
medianFinder.addNum(1);    // arr = [1]
medianFinder.addNum(2);    // arr = [1, 2]
medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
medianFinder.addNum(3);    // arr[1, 2, 3]
medianFinder.findMedian(); // return 2.0
*/
public class FindMedian {

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */

    public static void main(String[] args) {
//        String[] str = {"MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"};
//        int[] arr = {-1, 1, 2, -1, 3, -1};

//        String[] str = {"MedianFinder","addNum","findMedian"};
//        int[] arr = {-1,1,-1};

        String[] str = {"MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"};
        int[] arr = {-1,1,-1,2,-1,3,-1,4,-1,5,-1};
        //output = [null,null,-1.00000,null,-1.50000,null,-3.00000,null,-2.50000,null,-5.00000]


        MedianFinder obj = new MedianFinder();
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case "MedianFinder":
                    obj = new MedianFinder();
                    break;
                case "addNum":
                    obj.addNum(arr[i]);
                    break;
                case "findMedian":
                    System.out.println(obj.findMedian());
                    break;

            }
        }


    }
}

class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>(Collections.reverseOrder()); // 1,2,3
        maxHeap = new PriorityQueue<>(); // 3,2,1
    }

    public void addNum(int num) {

        if(maxHeap.size()==minHeap.size()){
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        else{
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }

    }

    public double findMedian() {

        if (!maxHeap.isEmpty())
            System.out.println("maxHeap :" + maxHeap);
        if (!minHeap.isEmpty())
            System.out.println("minHeap :" + minHeap);

        int totalSize = maxHeap.size() + minHeap.size();
        if (totalSize == 0) {
            return 0;
        }

        if (minHeap.size() == maxHeap.size())
            return (minHeap.peek().intValue() + maxHeap.peek().intValue()) / 2.0;

        return maxHeap.peek().intValue()/1.0;

    }
}




