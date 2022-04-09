package org.xmdonate.xmdonatelibrary.http;

import org.xmdonate.xmdonatelibrary.RequestActor;
import org.xmdonate.xmdonatelibrary.XMDonate;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebRequestManager {
    public static String sendRequest(String address, WebRequestMapBuilder map) {
        try {
            URL url = new URL(address + "?" + map.build());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            return connection.getResponseMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}