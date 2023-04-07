import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator sumCalculator;

    @BeforeEach
        public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrect() {
        //When
        int actual = sumCalculator.sum(5);

        //Then
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWithOneWorksCorrect() {
        //When
        int actual = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
