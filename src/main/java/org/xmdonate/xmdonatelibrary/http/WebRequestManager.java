package org.xmdonate.xmdonatelibrary.http;

import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebRequestManager {
    public static JSONObject sendRequest(String address, WebRequestMapBuilder map) {
        try {
            URL url = new URL(address + "?" + map.build());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStream in = connection.getInputStream();
            byte[] response = new byte[in.available()];
            in.read(response);

            return new JSONObject(new String(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}