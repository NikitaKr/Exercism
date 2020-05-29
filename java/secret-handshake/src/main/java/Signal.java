enum Signal  {

    WINK(0b00001), 
    DOUBLE_BLINK(0b00010), 
    CLOSE_YOUR_EYES(0b00100), 
    JUMP(0b01000),
    REVERSE(0b10000);


    private final int binaryCode;

    Signal(final int binaryCode) {
        this.binaryCode = binaryCode;
    }

    public int getBinary() {
        return binaryCode;
    }


}


