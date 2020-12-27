package cpu.core;

public class Counter {

    protected int state;
    protected int bits;
    protected long MAX_COUNT_VALUE;

    public Counter(int bits) {
        setBits(bits);
    }

    void setBits(int bits) {
        if (bits <= 0)
            throw new IllegalArgumentException("Zero or Negative bit count");
        this.bits = bits;
        this.MAX_COUNT_VALUE = (long) (Math.pow(2, bits) - 1);
    }

    public int getBits() {
        return bits;
    }

    public int getCount() {
        return state;
    }

    public void countUp() {
        state += 0b1;
        if (state > MAX_COUNT_VALUE) state = 0b0;
    }

    public long getMaxCount() {
        return MAX_COUNT_VALUE;
    }

    public void reset() {
        this.state = 0b0;
    }

    protected boolean isWithInLimit(long i) {
        if (i <= MAX_COUNT_VALUE && i >= 0) return true;
        return false;
    }
}
