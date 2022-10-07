package test;

import org.junit.jupiter.api.Test;
import ra.NextDayCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    void checkNextDay(){
        String result = NextDayCalculator.Calculator(1,1,2018);
        assertEquals("2/1/2018",result);
    }
    @Test
    void checkNextDay31_1_2018(){
        String result =NextDayCalculator.Calculator(31,1,2018);
        assertEquals("1/2/2018",result);
    }
    @Test
    void checkNextDay30_4_2018(){
        String result =NextDayCalculator.Calculator(30,4,2018);
        assertEquals("1/5/2018",result);
    }
    @Test
    void checkNextDay28_2_2018(){
        String result =NextDayCalculator.Calculator(28,2,2018);
        assertEquals("1/3/2018",result);
    }
    @Test
    void checkNextDay29_2_2020(){
        String result =NextDayCalculator.Calculator(29,2,2020);
        assertEquals("1/3/2020",result);
    }
    @Test
    void checkNextDay31_12_2018(){
        String result =NextDayCalculator.Calculator(31,12,2018);
        assertEquals("1/1/2019",result);
    }
}
