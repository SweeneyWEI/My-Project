package org.util;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import org.pojo.User;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wx on 17-4-29.
 */
public class JDBCUtils {
    public static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://172.16.176.128:3306/mytest";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static int insert(User student) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into user (u_id,u_name,u_password) values(?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(student.getU_id()));
            pstmt.setString(2, student.getU_name());
            pstmt.setString(3, student.getU_password());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public static int update(User student) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update students set u_name='" + student.getU_name() + "' where u_id='" + student.getU_id() + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);

            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public static Integer getSingle(User student) {
        Connection conn = getConn();
        String sql = "select * from user where u_name=? and u_password=?";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1, student.getU_name());
            pstmt.setString(2, student.getU_password());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;

    }
    public static void main(String[] args) {
        User u=new User();
        u.setU_id(2);
        u.setU_name("dong");
        u.setU_password("123");
        insert(u);
    }
}
