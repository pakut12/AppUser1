/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pg.lib.service;

import com.pg.lib.model.UserModel;
import com.pg.lib.utility.ConnectDB;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gus
 */
public class UserService {

    private static Connection conn;
    private static ResultSet rs;
    private static PreparedStatement ps;

    private static int getprimarykey() throws SQLException {
        int primarykey = 0;

        try {
            String sql = "SELECT max(user_id) FROM tb_user";
            conn = ConnectDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                primarykey = rs.getInt("max(user_id)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeResources(conn, ps, rs);
        }

        return primarykey;
    }

    public static List<UserModel> getuser() throws SQLException {
        List<UserModel> listuser = new ArrayList<UserModel>();

        try {
            String sql = "SELECT * FROM tb_user";
            conn = ConnectDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                UserModel user = new UserModel();
                user.setUser_id(rs.getString("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_user(rs.getString("user_user"));
                user.setUser_pass(rs.getString("user_pass"));
                listuser.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeResources(conn, ps, rs);
        }

        return listuser;
    }

    public static List<UserModel> getuserbyid(String id) throws SQLException {
        List<UserModel> listuser = new ArrayList<UserModel>();

        try {
            String sql = "SELECT * FROM tb_user where user_id like ?";
            conn = ConnectDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + id + "%"); // Set the placeholder value before executing the query

            rs = ps.executeQuery();

            while (rs.next()) {
                UserModel user = new UserModel();
                user.setUser_id(rs.getString("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_user(rs.getString("user_user"));
                user.setUser_pass(rs.getString("user_pass"));
                listuser.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeResources(conn, ps, rs);
        }

        return listuser;
    }

    public static boolean adduser(String user_user, String user_pass, String user_name) throws SQLException {
        boolean status = false;

        System.out.println("ADD");
        System.out.println(user_user);
        System.out.println(user_pass);
        System.out.println(user_name);
        try {
            int primarykey = getprimarykey() + 1;

            String sql = "INSERT INTO tb_user(user_id,user_user,user_pass,user_name) VALUES (?,?,?,?)";
            conn = ConnectDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, primarykey);
            ps.setString(2, user_user);
            ps.setString(3, user_pass);
            ps.setString(4, user_name);

            if (ps.executeUpdate() > 0) {
                status = true;
            } else {
                status = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeResources(conn, ps, rs);
        }

        return status;
    }

    public static boolean updateuser(String user_id, String user_user, String user_pass, String user_name) throws SQLException {
        boolean status = false;

        System.out.println("UPDATE");
        System.out.println(user_user);
        System.out.println(user_pass);
        System.out.println(user_name);
        try {

            String sql = "update tb_user set user_user=?,user_pass=?,user_name=? where user_id=? ";
            conn = ConnectDB.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, user_user);
            ps.setString(2, user_pass);
            ps.setString(3, user_name);
            ps.setString(4, user_id);

            if (ps.executeUpdate() > 0) {
                status = true;
            } else {
                status = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeResources(conn, ps, rs);
        }

        return status;
    }

    public static boolean deleteuser(String user_id) throws SQLException {
        boolean status = false;

        System.out.println("DEL");
        System.out.println(user_id);

        try {

            String sql = "delete from tb_user where user_id=? ";
            conn = ConnectDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user_id);

            if (ps.executeUpdate() > 0) {
                status = true;
            } else {
                status = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeResources(conn, ps, rs);
        }

        return status;
    }

    public static DefaultTableModel gettableuser(List<UserModel> listuser) throws SQLException {
        DefaultTableModel modeluser = new DefaultTableModel();
        modeluser.addColumn("User_ID");
        modeluser.addColumn("User_User");
        modeluser.addColumn("User_Pass");
        modeluser.addColumn("User_Name");

        try {
            List<UserModel> list = listuser;

            for (UserModel user : list) {
                modeluser.addRow(new Object[]{
                            user.getUser_id(),
                            user.getUser_user(),
                            user.getUser_pass(),
                            user.getUser_name()
                        });

                System.out.println("-------------------------------------");
                System.out.println(user.getUser_id());
                System.out.println(user.getUser_user());
                System.out.println(user.getUser_pass());
                System.out.println(user.getUser_name());
                System.out.println("-------------------------------------");

            }




        } catch (Exception e) {
            e.printStackTrace();
        }

        return modeluser;
    }
}
