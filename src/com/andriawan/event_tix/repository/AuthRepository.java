/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andriawan.event_tix.repository;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.andriawan.event_tix.data.DBConn;
import com.andriawan.event_tix.models.User;
import com.andriawan.event_tix.utils.PasswordUtil;
import com.andriawan.event_tix.utils.PreferenceUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author naufalfawwaz
 */
public class AuthRepository extends DBConn {
    
    public Boolean register(String nama, String email, String password) {

        try {
            stmt = (PreparedStatement) connection.prepareStatement("INSERT INTO users (name, email, password, password_salt) VALUE (?, ?, ?, ?)");
            ((PreparedStatement) stmt).setString(1, nama);
            ((PreparedStatement) stmt).setString(2, email);

            String passwordSalt = PasswordUtil.getSaltValue(30);
            String generatedPassword = PasswordUtil.generateSecurePassword(password, passwordSalt);
            ((PreparedStatement) stmt).setString(3, generatedPassword);
            ((PreparedStatement) stmt).setString(4, passwordSalt);

            ((PreparedStatement) stmt).execute();
            connection.close();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return false;
        }
    }
	
	public User login(String email, String password) {

        try {
            String query = "SELECT * FROM users WHERE email = '" + email + "'";
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            if (result.next()) {
                String hashedPass = result.getString("password");
                String saltPass = result.getString("password_salt");
                
                if (PasswordUtil.verifyUserPass(password, hashedPass, saltPass)) {
                    User user = new User(result.getInt("id"), result.getString("name"), result.getString("email"), result.getString("role"), result.getString("password"), result.getString("created_at"), result.getString("updated_at"));
                    PreferenceUtil.saveUserData(user.getId(), user.getName(), user.getRole());
                    connection.close();
                    return user;
                }
            }
            
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return null;
        }
    }
	
}
