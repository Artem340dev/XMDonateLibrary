package org.xmdonate.xmdonatelibrary;

import org.xmdonate.xmdonatelibrary.structure.Methods;

public final class XMDonateLibrary {
    private RequestActor actor;
    private Methods methods;

    public XMDonateLibrary(RequestActor actor) {
        this.methods = new Methods(actor);
        this.actor = actor;
    }

    public Methods methods() {
        return methods;
    }
}