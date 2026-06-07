package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FIFORhymerTest {

    @Test
    public void shouldReturnElementsInFIFOOrder() {
        FIFORhymer fifo = new FIFORhymer();

        fifo.countIn(1);
        fifo.countIn(2);
        fifo.countIn(3);

        assertEquals(1, fifo.countOut());
        assertEquals(2, fifo.countOut());
        assertEquals(3, fifo.countOut());
    }

    @Test
    public void shouldBeEmptyAfterRemovingAllElements() {
        FIFORhymer fifo = new FIFORhymer();

        fifo.countIn(10);
        fifo.countIn(20);

        fifo.countOut();
        fifo.countOut();

        assertTrue(fifo.callCheck());
    }

    @Test
    public void shouldHandleSingleElement() {
        FIFORhymer fifo = new FIFORhymer();

        fifo.countIn(42);

        assertEquals(42, fifo.countOut());
        assertTrue(fifo.callCheck());
    }
}