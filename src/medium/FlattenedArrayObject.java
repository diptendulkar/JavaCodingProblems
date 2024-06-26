package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenedArrayObject {
    public static void main(String[] args) throws Exception {
        Object[] array = { 1, 2, new Object[]{3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
    }
    public static Integer[] flatten(Object[] inputArray) throws Exception {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<inputArray.length;i++ ){

            if(inputArray[i] instanceof Object[]){
                //   Integer[] temp = flatten( (Object[]) inputArray[i]);

                list.addAll(Arrays.asList(flatten( (Object[]) inputArray[i])));
            }
            else{
                list.add((Integer) inputArray[i]);
            }
        }

        return  list.toArray(new Integer[0]);


    }
}
