package cpu.core.mem;

public class RandomAccessMemory {

    private int[] data;
    private int adressBits;
    private int dataLines;

    public RandomAccessMemory(int AddressBits, int dataLines) {

    }

    public int getAdressBits() {
        return adressBits;
    }

    public int getDataBits() {
        return dataLines;
    }

    protected void setAdressBits(int adressBits){
        if (adressBits <= 0) throw new IllegalArgumentException();
        this.adressBits = adressBits;
    }

    protected void setDataLines(int dataLines) {
        if (adressBits <= 0) throw new IllegalArgumentException();
        this.dataLines = dataLines;
    }
}
