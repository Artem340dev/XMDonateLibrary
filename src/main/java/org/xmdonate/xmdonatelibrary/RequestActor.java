package org.xmdonate.xmdonatelibrary;

public final class RequestActor {
    private String group, token;

    public RequestActor(String group, String token) {
        this.group = group;
        this.token = token;
    }

    public String getGroup() {
        return group;
    }

    public String getToken() {
        return token;
    }
}