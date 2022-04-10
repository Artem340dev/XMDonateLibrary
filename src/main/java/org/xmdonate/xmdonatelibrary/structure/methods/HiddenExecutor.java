package org.xmdonate.xmdonatelibrary.structure.methods;

import org.json.JSONObject;
import org.xmdonate.xmdonatelibrary.RequestActor;
import org.xmdonate.xmdonatelibrary.http.WebRequestManager;
import org.xmdonate.xmdonatelibrary.http.WebRequestMapBuilder;

public class HiddenExecutor extends MethodExecutor {
    private RequestActor actor;
    private String id;

    public HiddenExecutor(RequestActor actor) {
        super("https://xmdonate.fun/api", "hidden");
        this.actor = actor;
    }

    public HiddenExecutor id(String id) {
        this.id = id;
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
                            .add("id", id));
    }
}