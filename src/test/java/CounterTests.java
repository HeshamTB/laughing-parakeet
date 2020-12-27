import cpu.core.Counter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTests {

    Counter c;

    @Before
    public void setUp() {
        c = new Counter(8);
    }

    @Test
    public void CorrectBitCount() {
        assertEquals(8, c.getBits());
    }

    @Test
    public void CountUpCorrectly() {
        assertEquals(0b0, c.getCount());
        c.countUp();
        assertEquals(0b1, c.getCount());
        c.countUp();
        assertEquals(0b10, c.getCount());
    }

    @Test
    public void MaxValueCalculation() {
        //For 8 bit, max 255
        assertEquals(255, c.getMaxCount());

        //For 16 bit, max
        Counter c2 = new Counter(16);
        assertEquals(65535, c2.getMaxCount());
    }
}
