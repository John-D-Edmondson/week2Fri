package UniqueSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueSum {
    public int sumThreeVals(Integer[] inputs){
        HashMap<Integer, Integer> uniqueInputs = new HashMap<>();
        for(int val: inputs){
            uniqueInputs.put(val, uniqueInputs.getOrDefault(val, 0) +1);
        }
        int sum =0;
        for (HashMap.Entry<Integer, Integer> entry : uniqueInputs.entrySet()) {
            if (entry.getValue() == 1){
                sum += entry.getKey();
            }

        }
        return sum;

    }

    public String stringOutput(Integer[] inputs){
        int sum = sumThreeVals(inputs);
        StringBuilder valsInInputs = new StringBuilder();

        for (int val: inputs){
            valsInInputs.append(val);
            valsInInputs.append(",");
        }



        return String.format("The sum of the uniques in: %s \n The unique sum is %d" ,valsInInputs, sum);
    }
}
