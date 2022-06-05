    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andriawan.event_tix.repository;

import com.andriawan.event_tix.data.DBConn;
import com.andriawan.event_tix.models.Event;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author naufalfawwaz
 */
public class EventRepository extends DBConn {
    
    public List<Event> getListEvent() {
        try {
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("SELECT * FROM events");
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
            connection.close();
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public Event getEvent(int eventId) {
        try {
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("SELECT * FROM events WHERE events.id = " + eventId);
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
            connection.close();
            
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
}
