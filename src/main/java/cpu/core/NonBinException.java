package cpu.core;

public class NonBinException extends RuntimeException {
    public NonBinException(){
        super("Not a value of 1 or 0");
    }
}
