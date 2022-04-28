package org.seasar.sastruts.omikuji.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getConnection() {
        String server = "jdbc:postgresql://localhost:5432/omikuji";
        String user_name = "root";
        String password = "1005";

        Connection conn = null;


        try {
            //No suitable driverエラーのために追加
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(server, user_name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
