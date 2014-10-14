package no.web.logging;

import org.junit.Test;

public class TraceTest {

    SystemTrace log = new SystemTrace();

    @Test
    public void testSystemTrace() {

        log.debug("entering log");

    }

    @Test
    public void testSystemTrace2() {
        Trace log = TraceFactory.getTrace();

        log.error("entering  system trace log");
    }
}
