package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {

        return Math.pow(value, 2);
    }

    public static Double[] squareRoots(Double... value) {
        ArrayList<Double> temp = new ArrayList<>();
        for(int i = 0; i < squareRoots().length; i++){
            squareRoots()[i] = Math.sqrt(squareRoots()[i]);
        }
        Double[] results = new Double[temp.size()];
        return results;
    }

    public static Double[] squares(Double... values) {
        int len = squares().length;
        Double[] results = new Double[len];
        for (int i = 0; i < squares().length; i++) {
            results[i] = Math.pow(squares()[i], 2);
        }
        return results;
    }

    public static Double add(Double value1, Double value2) {
        Double sum = value1 + value2;
        return sum;
    }

    public static Double subtract(Double value1, Double value2) {

        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {

        return divisor/dividend;
    }
}
