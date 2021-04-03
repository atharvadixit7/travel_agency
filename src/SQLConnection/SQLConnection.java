/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ATHARVA
 */
public class SQLConnection {

    static Connection con = null;

    public static Connection connect() {
        String databaseName = "travel";
        String username = "root";
        String password = "root";
        // get db, user, pass from settings file
        return getConnection(databaseName, username, password);
    }

    private static Connection getConnection(String db_name, String user_name, String password) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=" + user_name + "&password=" + password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
        createTables(con);
        return con;
    }

    private static void createTables(Connection conn) {
        try {
            Statement stmt = conn.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            String login = "CREATE TABLE IF NOT EXISTS login(username varchar(50) NOT NULL DEFAULT 'agent' PRIMARY KEY,password varchar(50) NOT NULL DEFAULT 'defaultpassword',accesstype enum('agent','admin') NOT NULL DEFAULT 'agent')";
            String agent = "CREATE TABLE IF NOT EXISTS agent()";
            String travelincharge;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        try {
//            connect();
//            if (con != null) {
//                System.out.println("Connected! " + con);
//                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//                ResultSet rs = stmt.executeQuery("select * from travelincharge");
//                rs.last();
//                System.out.println("Rows are " + rs.getRow());
////                ResultSet rs = stmt.executeQuery("show tables");
////                if (rs.first()) {
////                    do {
////                        System.out.println("" + rs.getString("Tables_in_travel"));
////                    } while (rs.next());
////
////                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
