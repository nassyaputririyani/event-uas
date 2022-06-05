package com.andriawan.event_tix.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.andriawan.event_tix.data.DBConn;
import com.andriawan.event_tix.models.Event;
import com.andriawan.event_tix.models.Transaction;
import com.andriawan.event_tix.models.User;

public class TransactionRepository extends DBConn {
    
    public List<Transaction> getListTransactions(String q, int userId) {
        try {
            stmt = connection.createStatement();
            if (!q.isEmpty()) {
                resultSet = stmt.executeQuery("SELECT events.id, events.title, events.description, events.quota, events.status, events.type, events.price, events.event_time, users.id, users.name, users.email, users.role, users.password, users.created_at, users.updated_at, transactions.id, transactions.status, transactions.deadline, transactions.amount FROM transactions INNER JOIN events ON events.id = transactions.events_id INNER JOIN users ON users.id = transactions.users_id WHERE events.title LIKE '%" + q + "%'" + " AND users.id = " + userId);
            } else {
                resultSet = stmt.executeQuery("SELECT events.id, events.title, events.description, events.quota, events.status, events.type, events.price, events.event_time, users.id, users.name, users.email, users.role, users.password, users.created_at, users.updated_at, transactions.id, transactions.status, transactions.deadline, transactions.amount FROM transactions INNER JOIN events ON events.id = transactions.events_id INNER JOIN users ON users.id = transactions.users_id WHERE users.id = " + userId);
            }
            List<Transaction> list = new ArrayList<>();
            
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

                User user = new User(
                    resultSet.getInt(9), 
                    resultSet.getString(10), 
                    resultSet.getString(11), 
                    resultSet.getString(12), 
                    resultSet.getString(13), 
                    resultSet.getString(14), 
                    resultSet.getString(15)
                );

                Transaction transaction = new Transaction(
                    resultSet.getInt(16), 
                    event, 
                    user, 
                    resultSet.getString(17), 
                    resultSet.getString(18), 
                    resultSet.getInt(19)
                );

                list.add(transaction);
            }

            stmt.close();
            resultSet.close();

            return list;
        } catch (SQLException e) {  
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public Transaction getTransaction(int transactionId) {
        try {
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("SELECT events.id, events.title, events.description, events.quota, events.status, events.type, events.price, events.event_time, users.id, users.name, users.email, users.role, users.password, users.created_at, users.updated_at, transactions.id, transactions.status, transactions.deadline, transactions.amount FROM transactions INNER JOIN events ON events.id = transactions.events_id INNER JOIN users ON users.id = transactions.users_id WHERE transactions.id = " + transactionId);
            List<Transaction> list = new ArrayList<>();
            
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

                User user = new User(
                    resultSet.getInt(9), 
                    resultSet.getString(10), 
                    resultSet.getString(11), 
                    resultSet.getString(12), 
                    resultSet.getString(13), 
                    resultSet.getString(14),
                    resultSet.getString(15)
                );

                Transaction transaction = new Transaction(
                    resultSet.getInt(16), 
                    event, 
                    user, 
                    resultSet.getString(17), 
                    resultSet.getString(18), 
                    resultSet.getInt(19)
                );

                list.add(transaction);
            }

            stmt.close();
            resultSet.close();

            if (!list.isEmpty()) {
                return list.get(0);
            } else {
             JOptionPane.showMessageDialog(null, "Transaksi tidak ditemukan");
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return null;
        }
    }
    
    public boolean cancelTransaction(int transactionId) {
        try {
            stmt = (PreparedStatement) connection.prepareStatement("UPDATE transactions SET transactions.status = 'cancelled' WHERE transactions.id = ?");
            ((PreparedStatement) stmt).setInt(1, transactionId);

            ((PreparedStatement) stmt).execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.getMessage());
            return false;
        }
    }
}
