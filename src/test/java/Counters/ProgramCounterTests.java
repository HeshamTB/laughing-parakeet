package Counters;

import cpu.core.ProgramCounter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramCounterTests {

    ProgramCounter counter;

    @Before
    public void SetUp() {
        counter = new ProgramCounter(8);
    }

    @Test
    public void CountDown() {
        assertEquals(0, counter.getCount());
        counter.countUp();
        assertEquals(1, counter.getCount());
        counter.countDown();
        assertEquals(0, counter.getCount());

    }

    @Test
    public void LowerLimitTest() {
        assertEquals(0, counter.getCount());
        counter.countDown();
        assertEquals(counter.getMaxCount(), counter.getCount());
    }

    @Test
    public void SetCount() {
        assertEquals(0, counter.getCount());
        counter.countUp();
        counter.countUp();
        long half = counter.getMaxCount()/2;
        counter.setCount(half);
        assertEquals(half, counter.getCount());

        counter.setCount(counter.getMaxCount());
        assertEquals(counter.getMaxCount(), counter.getCount());
    }
}
