package Memory;

import cpu.core.mem.RandomAccessMemory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemTests {

    RandomAccessMemory memory;

    @Before
    public void SetUp() {
        memory = new RandomAccessMemory(8, 8);
    }

    @Test
    public void BasicValues() {
        assertEquals(8, memory.getAdressBits());
        assertEquals(8, memory.getDataBits());
    }
}
