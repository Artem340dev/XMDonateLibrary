package org.xmdonate.xmdonatelibrary.structure.methods;

import org.json.JSONObject;
import org.xmdonate.xmdonatelibrary.RequestActor;
import org.xmdonate.xmdonatelibrary.http.WebRequestManager;
import org.xmdonate.xmdonatelibrary.http.WebRequestMapBuilder;

public class DonatesExecutor extends MethodExecutor {
    private RequestActor actor;
    private String sort;

    public DonatesExecutor(RequestActor actor) {
        super("https://xmdonate.fun/api", "donates");
        this.actor = actor;
    }

    public DonatesExecutor sort(String sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public JSONObject execute() {
        return WebRequestManager
                .sendRequest(super.getAddress(), WebRequestMapBuilder
                        .create()
                            .add("method", super.getMethod())
                            .add("token", actor.getToken())
                            .add("group", actor.getGroup())
                            .add("sort", sort));
    }
}