package com.adithyasairam.tba4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Adi on 7/20/2015.
 */
public class DataRequest {
    public static String getData(HttpURLConnection con) {
        try {
            con.setRequestMethod("GET");
            con.addRequestProperty("User-Agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        }
        catch(Exception e) { e.printStackTrace(); }
        return null;
    }

    public static String getDataFromURL(String URLText) {
        try {
            URL url = new URL(URLText);
            return getData((HttpURLConnection) url.openConnection());
        }
        catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    public static String getDataFromTBA(String URLText) {
        try {
            URL url = new URL(URLText);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.addRequestProperty(Constants.TBA_Header_NAME, Constants.TBA_Header_VALUE);
            return getData(con);
        }
        catch (Exception e) { e.printStackTrace(); }
        return null;
    }
}
