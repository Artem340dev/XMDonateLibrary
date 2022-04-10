package org.xmdonate.xmdonatelibrary.structure.methods;

import org.json.JSONObject;

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

    public abstract JSONObject execute();
}