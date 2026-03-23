package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY_INDEX = -1;
    public static final int NO_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return NO_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NO_VALUE;
        return numbers[total--];
    }

}
