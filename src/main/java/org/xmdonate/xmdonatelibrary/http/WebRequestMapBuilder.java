package org.xmdonate.xmdonatelibrary.http;

import java.util.HashMap;
import java.util.StringJoiner;
import java.util.function.BiConsumer;

public class WebRequestMapBuilder {
    private HashMap<String, String> params;

    public WebRequestMapBuilder() {
        this.params = new HashMap<>();
    }

    public WebRequestMapBuilder add(String key, String value) {
        params.put(key, value);
        return this;
    }

    public String build() {
        StringJoiner text = new StringJoiner("&");
        params.forEach((key, value) -> text.add(key + "=" + value));

        return text.toString();
    }

    public static WebRequestMapBuilder create() {
        return new WebRequestMapBuilder();
    }
}