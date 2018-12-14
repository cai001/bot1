import java.net.HttpURLConnection;
import java.net.URL;

public class Urlsel {
    public int status(String urlhp) throws Exception {
        String s;
        URL hp = new URL(urlhp);
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        return hpCon.getResponseCode();
    }
}
