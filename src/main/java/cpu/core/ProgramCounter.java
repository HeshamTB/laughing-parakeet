package cpu.core;

public class ProgramCounter extends Counter {

    public ProgramCounter(int bits) {
        super(bits);
    }

    public void countDown() {
        state -= 0b1;
        if (state < 0) state = (int) MAX_COUNT_VALUE;
    }

    public void setCount(long count) {
        if (isWithInLimit(count))
            this.state = (int) count;
        else throw new IllegalArgumentException("Can not set Cointer Value out of bounds");
    }
}
