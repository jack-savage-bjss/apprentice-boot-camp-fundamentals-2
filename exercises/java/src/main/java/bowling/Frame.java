package bowling;

public class Frame {
    private int roll1;
    private int roll2;
    private int frameTotal;

    public Frame(int roll1, int roll2) {
        this.roll1 = roll1;
        this.roll2 = roll2;
    }

    public void setFrameTotal(int frameTotal) {
        this.frameTotal = frameTotal;
    }
}
