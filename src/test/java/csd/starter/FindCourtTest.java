package csd.starter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by CK on 2017/3/5.
 */
public class FindCourtTest {

    @Test
    public void testFind() {
        assertEquals(1, CourtFinder.findCourt(100, 50));
    }
}