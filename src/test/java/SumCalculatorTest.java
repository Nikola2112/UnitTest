import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
   public void setUp(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testSumForWorkPositiveNumbers(){
        int result = sumCalculator.sum(3);
        assertEquals(6,result);
    }
    @Test
    public void testSumForWorkNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(-3);
        });
    }
    @Test
    public void testSumForZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}
