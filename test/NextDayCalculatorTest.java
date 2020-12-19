import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class NextDayCalculatorTest {

    private int[] day;
    private int[] nextDay;

    public NextDayCalculatorTest(int[] day, int[] nextDay) {
        this.day = day;
        this.nextDay = nextDay;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{new int[]{1, 1, 2018}, new int[]{2, 1, 2018}},
                {new int[]{31, 1, 2018}, new int[]{1, 2, 2018}},
                {new int[]{30, 4, 2018}, new int[]{1, 5, 2018}},
                {new int[]{28, 2, 2018}, new int[]{1, 3, 2018}},
                {new int[]{29, 2, 2020}, new int[]{1, 3, 2020}},
                {new int[]{31, 12, 2018}, new int[]{1, 1, 2019}}
        });
    }

    @Test
    public void test() {
        assertTrue(Arrays.equals(NextDayCalculator.nextDayCalculator(day), nextDay));
    }
}