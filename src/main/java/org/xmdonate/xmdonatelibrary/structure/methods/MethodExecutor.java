package org.xmdonate.xmdonatelibrary.structure.methods;

public abstract class MethodExecutor {
    private String address, method;

    public MethodExecutor(String address, String method) {
        this.address = address;
        this.method = method;
    }

    protected String getAddress() {
        return address;
    }

    protected String getMethod() {
        return method;
    }

    public abstract String execute();
}