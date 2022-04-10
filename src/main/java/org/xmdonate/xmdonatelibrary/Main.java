package org.xmdonate.xmdonatelibrary;

public class Main {
    public static void main(String[] args) {
        XMDonateLibrary donate = new XMDonateLibrary(new RequestActor("212137030", "d7b074e4f79dbbba5c351dd4eaa059b5"));
        System.out.println(donate.methods().balance().execute());
    }
}