import java.net.HttpURLConnection;
import java.net.URL;

class statusqueryok {
    public static void main(String args[]) throws Exception {
        String s;
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        System.out.println(hpCon.getResponseCode());
    }
}
