package org.xmdonate.xmdonatelibrary.structure;

import org.xmdonate.xmdonatelibrary.RequestActor;
import org.xmdonate.xmdonatelibrary.XMDonate;
import org.xmdonate.xmdonatelibrary.structure.methods.AnswerExecutor;
import org.xmdonate.xmdonatelibrary.structure.methods.BalanceExecutor;
import org.xmdonate.xmdonatelibrary.structure.methods.DonatesExecutor;
import org.xmdonate.xmdonatelibrary.structure.methods.HiddenExecutor;

public final class Methods {
    private RequestActor actor;

    public Methods(RequestActor actor) {
        this.actor = actor;
    }

    public BalanceExecutor balance() {
        return new BalanceExecutor(actor);
    }

    public DonatesExecutor donates() {
        return new DonatesExecutor(actor);
    }

    public HiddenExecutor hidden() {
        return new HiddenExecutor(actor);
    }

    public AnswerExecutor answer() {
        return new AnswerExecutor(actor);
    }
}