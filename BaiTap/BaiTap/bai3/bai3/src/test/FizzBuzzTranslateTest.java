package test;

import org.junit.jupiter.api.Test;
import ra.FizzBuzzTranslate;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    void  CheckFizz(){
        String result = FizzBuzzTranslate.traslate(3);
        assertEquals("Fizz",result);
    }
    @Test
    void  CheckBuzz(){
        String result = FizzBuzzTranslate.traslate(5);
        assertEquals("Buzz",result);
    }
    @Test
    void  CheckFizzBuzz(){
        String result = FizzBuzzTranslate.traslate(15);
        assertEquals("FizzBuzz",result);
    }
}
