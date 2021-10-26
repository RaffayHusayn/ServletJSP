package com.fclass.dao;

import java.sql.*;

public class LoginDAO {

    public boolean authenticate(String uname, String pass){
        String url = "jdbc:mysql://localhost:3306/student";
        String mySQLuser="root";
        String mySQLpassword = "password";
        String query = "Select * from login where username = ? , password = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, mySQLuser, mySQLpassword);
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
