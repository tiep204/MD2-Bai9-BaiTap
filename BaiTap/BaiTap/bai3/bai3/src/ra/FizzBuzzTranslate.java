package ra;

import java.util.Scanner;

public class FizzBuzzTranslate {

    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String traslate(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return FIZZBUZZ;
        } else if (x % 3 == 0) {
            return FIZZ;
        } else if (x % 5 == 0) {
            return BUZZ;
        } else
            return null;
    }
}
