package es.usc.citius.hipster.algorithm;


public class NegativeCycleException extends RuntimeException {
    private static final String message = "Existence of a negative cycle detected";

    public NegativeCycleException(String message) {
		super(message);
	}

	public NegativeCycleException() {
        super(message);
    }
}
