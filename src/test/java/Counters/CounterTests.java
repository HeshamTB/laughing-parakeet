package Counters;

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
    public void StartAtZero() {
        assertEquals(0, c.getCount());
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

    @Test
    public void UpperLimitTest() {
        int bits = c.getBits();
        long limit = (long) Math.pow(2, bits)-1;
        for (int i = 0; i < limit; i++) {
            assertEquals(i, c.getCount());
            c.countUp();
        }
        assertEquals(limit, c.getCount());
        c.countUp();
        assertEquals(0, c.getCount());
    }

    @Test
    public void ResetProperly() {
        c.reset();
        assertEquals(0, c.getCount());
    }
}
