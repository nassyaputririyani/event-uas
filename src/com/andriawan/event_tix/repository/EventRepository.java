    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andriawan.event_tix.repository;

import com.andriawan.event_tix.data.DBConn;
import com.andriawan.event_tix.models.Event;
import com.andriawan.event_tix.models.Transaction;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author naufalfawwaz
 */
public class EventRepository extends DBConn {
    
    public List<Event> getListEvent(String q) {
        try {
            stmt = connection.createStatement();
            if (q.isEmpty()) {
                resultSet = stmt.executeQuery("SELECT id, title, description, quota, status, type ,price, event_time FROM events");
            } else {
                resultSet = stmt.executeQuery("SELECT id, title, description, quota, status, type ,price, event_time FROM events WHERE events.title LIKE '%" + q + "%'");
            }
            List<Event> list = new ArrayList<>();
            
            while (resultSet.next()) {
                Event event = new Event(
                    resultSet.getInt(1), 
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getInt(7),
                    resultSet.getString(8)
                );
                
                list.add(event);
            }
            
            stmt.close();
            resultSet.close();
            
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public Event getEvent(int eventId) {
        try {
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("SELECT id, title, description, quota, status, type ,price, event_time FROM events WHERE events.id = " + eventId);
            List<Event> list = new ArrayList<>();
            
            while (resultSet.next()) {
                Event event = new Event(
                    resultSet.getInt(1), 
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getInt(7),
                    resultSet.getString(8)
                );
                
                list.add(event);
            }
            
            stmt.close();
            resultSet.close();
            
            if (!list.isEmpty()) {
                return list.get(0);
            } else {
                JOptionPane.showMessageDialog(null, "User not found");
                return null;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return null;
        }
    }
    
    public Boolean addEvent(String title, String description, int quota, String type, int price, String event_time) {
        try {
            stmt = (PreparedStatement) connection.prepareStatement("INSERT INTO events (id, title, description, quota, type, price, event_time) VALUE (NULL, ?, ?, ?, ?, ?, ?)");
            ((PreparedStatement) stmt).setString(1, title);
            ((PreparedStatement) stmt).setString(2, description);
            ((PreparedStatement) stmt).setInt(3, quota);
            ((PreparedStatement) stmt).setString(4, type);
            ((PreparedStatement) stmt).setInt(5, price);
            ((PreparedStatement) stmt).setString(6, event_time);

            ((PreparedStatement) stmt).execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return false;
        }
    }
    
    public Boolean updateEvent(int id, String title, String description, int quota, String type, int price, String event_time) {
        try {
            stmt = (PreparedStatement) connection.prepareStatement("UPDATE events SET title = ?, description = ?, quota = ?, type = ?, price = ?, event_time = ? WHERE id = ?");
            ((PreparedStatement) stmt).setString(1, title);
            ((PreparedStatement) stmt).setString(2, description);
            ((PreparedStatement) stmt).setInt(3, quota);
            ((PreparedStatement) stmt).setString(4, type);
            ((PreparedStatement) stmt).setInt(5, price);
            ((PreparedStatement) stmt).setString(6, event_time);
            ((PreparedStatement) stmt).setInt(7, id);

            ((PreparedStatement) stmt).execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return false;
        }
    }
    
    public Boolean isAvailable(int userId, int eventId) {
        try {
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("SELECT * FROM transactions WHERE events_id = " + eventId + " AND users_id = " + userId);
            
            while (resultSet.next()) {
                return false;
            }
            
            stmt.close();
            resultSet.close();
            
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return true;
        }
    }
    
    public Boolean insertTransaction(int eventId, int userId, int amount) {
         try {
            stmt = (PreparedStatement) connection.prepareStatement("INSERT INTO transactions (id, events_id, users_id, amount, deadline) VALUE (NULL, ?, ?, ?, ?)");
            ((PreparedStatement) stmt).setInt(1, eventId);
            ((PreparedStatement) stmt).setInt(2, userId);
            ((PreparedStatement) stmt).setInt(3, amount);
            
            String dateTime = LocalDateTime.now().plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.getDefault()));
            ((PreparedStatement) stmt).setString(4, dateTime);

            ((PreparedStatement) stmt).execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return false;
        }
    }
    
    public Boolean deleteEvent(int eventId) {
        try {
            stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM events WHERE events.id = ?");
            ((PreparedStatement) stmt).setInt(1, eventId);

            ((PreparedStatement) stmt).execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return false;
        }
    }
}
