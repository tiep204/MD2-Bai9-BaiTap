package test;

import org.junit.jupiter.api.Test;
import ra.TriangleClassifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void check222() {
        String result = TriangleClassifier.check(2, 2, 2);
        assertEquals("TamGiacDeu", result);
    }

    @Test
    void check223() {
        String result = TriangleClassifier.check(2, 2, 3);
        assertEquals("TamGiacCan", result);
    }

    @Test
    void check345() {
        String result = TriangleClassifier.check(3, 4, 5);
        assertEquals("TamGiacThuong", result);
    }

    @Test
    void check823() {
        String result = TriangleClassifier.check(8, 2, 3);
        assertEquals("KhongPhaiLa1TamGiac", result);
    }

    @Test
    void checkAm121() {
        String result = TriangleClassifier.check(-1, 2, 1);
        assertEquals("KhongPhaiLa1TamGiac",result);
    }
    @Test
    void check011(){
        String result = TriangleClassifier.check(0,1,1);
        assertEquals("KhongPhaiLa1TamGiac",result);
    }
}