package org.xmdonate.xmdonatelibrary.structure.methods;

import org.json.JSONObject;
import org.xmdonate.xmdonatelibrary.RequestActor;
import org.xmdonate.xmdonatelibrary.http.WebRequestManager;
import org.xmdonate.xmdonatelibrary.http.WebRequestMapBuilder;

public class BalanceExecutor extends MethodExecutor {
    private RequestActor actor;

    public BalanceExecutor(RequestActor actor) {
        super("https://xmdonate.fun/api", "balance");
        this.actor = actor;
    }

    @Override
    public JSONObject execute() {
        return WebRequestManager
                .sendRequest(super.getAddress(), WebRequestMapBuilder
                        .create()
                            .add("method", super.getMethod())
                            .add("token", actor.getToken())
                            .add("group", actor.getGroup()));
    }
}