package cpu.core;

public class Counter {

    int state;
    int bits;
    long MAX_COUNT_VALUE;

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
    }

    public long getMaxCount() {
        return MAX_COUNT_VALUE;
    }
}
