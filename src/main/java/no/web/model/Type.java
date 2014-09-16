package no.web.model;

public enum Type {
    CREATIONAL(1, ".."),
    STRUCTURAL(2, ".."),
    BEHAVIORAL(3, "..");

    private final int code;
    private final String value;


    Type(final int code, final String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return this.value;
    }
}