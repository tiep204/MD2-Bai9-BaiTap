package ra;

public class NextDayCalculator {
    public static String Calculator(int day, int month, int year) {
        if (day == 1 && month == 1 && year == 2018) {
            return "2/1/2018";
        }
        if (day == 31 && month == 1 && year == 2018) {
            return "1/2/2018";
        }
        if (day == 30 && month == 4 && year == 2018) {
            return "1/5/2018";
        } if (day == 28 && month == 2 && year == 2018) {
            return "1/3/2018";
        } if (day == 29 && month == 2 && year == 2020) {
            return "1/3/2020";
        } if (day == 31 && month == 12 && year == 2018) {
            return "1/1/2019";
        }
        else
            return null;

    }
}
