import java.sql.*;

public class Dbcon {
    public String url(String date) throws Exception{
        String urls = "";

        String urldb = "jdbc:mysql://localhost:3306/urllist",
                login = "mysql",
                password = "mysql",
                query = "SELECT * FROM urllist.urllistg WHERE date < '" + date + "' or date is null";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(urldb, login, password);
             Statement st = con.createStatement()) {
            ResultSet rs = st.executeQuery(query);
            urls += rs.getType() + "\n";
            urls += rs.getConcurrency() + "\n";
            Urlsel urlsel = new Urlsel();
            int stat;
            int id;
            String url;
            while (rs.next()) {
                stat = urlsel.status(rs.getString("url"));
                id = rs.getInt("id");
                url = rs.getString("url");
                urls += id + ", " + url + ", " + stat + "\n";
                Statement st2 = con.createStatement();
                st2.executeUpdate("UPDATE urllistg SET date = '20181215', status = " + stat + " WHERE id = " + id);
                st2.close();
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return urls;
    }
}
