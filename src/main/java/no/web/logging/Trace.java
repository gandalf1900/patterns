package no.web.logging;

public interface Trace {
    public void setDebug( boolean debug );
    public void debug( String message );
    public void error( String message );
}
