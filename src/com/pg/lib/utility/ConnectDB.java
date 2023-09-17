/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pg.lib.utility;

import java.sql.*;
import javax.naming.NamingException;

/**
 *
 * @author Gus
 */
public class ConnectDB {

    public static Connection getConnection() throws ClassNotFoundException, SQLException, NamingException {
        Connection con = null;
        try {

            // DB Orcacle
            String path = new java.io.File("test.sqlite").getAbsolutePath();
            Class.forName("org.sqlite.JDBC");
            String database = "jdbc:sqlite:" + path;
            con = DriverManager.getConnection(database);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeResources(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
