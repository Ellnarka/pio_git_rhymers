package edu.kis.vh.nursery;

/**
 * Implementation of a counting-out rhymer that follows
 * the FIFO (First In First Out) principle.
 * Elements are returned in the same order
 * in which they were inserted.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Temporary storage used during FIFO operations.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Removes and returns the oldest element stored in the rhymer.
     * The method rearranges elements using a temporary rhymer
     * to achieve FIFO behavior.
     *
     * @return the first inserted element
     */
    @Override
    public int countOut() {
        // TODO: Consider extracting FIFO transfer logic into separate methods
       // to improve readability and maintainability

        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    /**
     * Returns the temporary rhymer used internally
     * for FIFO operations.
     *
     * @return temporary DefaultCountingOutRhymer instance
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}