package org.xmdonate.xmdonatelibrary;

import org.xmdonate.xmdonatelibrary.structure.Methods;

public final class XMDonate {
    private RequestActor actor;
    private Methods methods;

    public XMDonate(RequestActor actor) {
        this.methods = new Methods(actor);
        this.actor = actor;
    }

    public Methods methods() {
        return methods;
    }
}