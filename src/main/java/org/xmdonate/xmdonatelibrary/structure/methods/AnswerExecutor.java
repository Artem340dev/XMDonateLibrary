package org.xmdonate.xmdonatelibrary.structure.methods;

import org.xmdonate.xmdonatelibrary.RequestActor;
import org.xmdonate.xmdonatelibrary.http.WebRequestManager;
import org.xmdonate.xmdonatelibrary.http.WebRequestMapBuilder;

public class AnswerExecutor extends MethodExecutor {
    private RequestActor actor;
    private String answer, delete;

    public AnswerExecutor(RequestActor actor) {
        super("https://xmdonate.fun/api", "answer");
        this.actor = actor;
    }

    public AnswerExecutor answer(String answer) {
        this.answer = answer;
        return this;
    }

    public AnswerExecutor delete(String delete) {
        this.delete = delete;
        return this;
    }

    @Override
    public String execute() {
        return WebRequestManager
                .sendRequest(super.getAddress(), WebRequestMapBuilder
                        .create()
                        .add("method", super.getMethod())
                        .add("token", actor.getToken())
                        .add("group", actor.getGroup())
                        .add("answer", answer)
                        .add("delete", delete));
    }
}