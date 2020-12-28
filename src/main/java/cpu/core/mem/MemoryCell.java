package cpu.core.mem;

import cpu.core.NonBinException;

public class MemoryCell {

    private short[] data;

    public MemoryCell(int width) {
        data = new short[width];
    }

    public void write(short... data) {
        if (data.length > this.data.length) throw new IllegalArgumentException();
        for (int i = 0; i < data.length; i++){
            if (data[i] == 0 || data[i] == 1){
                this.data[i] = data[i];
            }
            else throw new NonBinException();
        }
    }
}
