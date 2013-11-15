package tln.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created with IntelliJ IDEA.
 * User: tmtxt
 * Date: 11/15/13
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class DrugConnection {
    public static Connection connection;

    static {
        try {
            String userName = "root";
            String password = "123456";
            String url = "jdbc:mysql://localhost:3306/test_linh";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            connection = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
