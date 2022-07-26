package cd.get.ready.algorithms;

import java.util.HashMap;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        HashMap<String,Integer> hashy = new HashMap<String, Integer>();
        int count =0;
        for(int i=0; i < input.length;i++){
            hashy.put(input[i],1);
            if(hashy.get(input[i]) > 1){
                count++;
            }
        }
        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        return null;
    }
}
