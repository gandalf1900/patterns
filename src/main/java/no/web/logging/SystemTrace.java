package no.web.logging;

public class SystemTrace implements Trace {
    private boolean debug;
    public void setDebug( boolean debug ) {
        this.debug = debug;
    }
    public void debug( String message ) {
        if( debug ) {
            System.out.println( "DEBUG: " + message );
        }
    }
    public void error( String message ) {
        System.out.println( "ERROR: " + message );
    }
}