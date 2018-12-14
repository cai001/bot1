import java.net.*;
import java.io.*;
import java.util.Date;

class statusquery {
    public static void main(String args[]) throws Exception {
        String s;
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println(hpCon.getResponseCode());
    }
}
