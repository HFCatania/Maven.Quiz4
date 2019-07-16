package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        String results = "";
        int val = values.length % 2;
        int midElement = values.length/2;
        int evenMidElement = midElement - 1;
        if(val == 0){
            results += values[evenMidElement];
        } else{
            results += values[midElement];
        }
        return results;
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(values));
        temp.remove(values.length/2);
        String[] results = new String[temp.size()];
        results = temp.toArray(results);
        return results;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String [] results = Arrays.copyOf(values, values.length-1);
        return results;
    }
}
