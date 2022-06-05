/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.andriawan.event_tix.pages;

import com.andriawan.event_tix.pages.fragments.home.HomePageAdmin;
import javax.swing.JComponent;
import com.andriawan.event_tix.pages.fragments.transactions.TransactionPage;
import com.andriawan.event_tix.pages.fragments.transactions.TransactionPageAdmin;
import com.andriawan.event_tix.utils.PreferenceUtil;

/**
 *
 * @author aryaputra
 */
public class MainAdmin extends javax.swing.JFrame {

    private HomePageAdmin homePageAdmin;

    /**
     * Creates new form Main
     */
    public MainAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        homePageAdmin = new HomePageAdmin(mainPanel);
        sidebarMenu.addEventMenuSelected((int index) -> {
            System.out.println("Selected " + index);
            switch (index) {
                case 0:
                    setForm(homePageAdmin);
                    break;
                case 1:
                    setForm(new TransactionPageAdmin(mainPanel));
                    break;
                case 2:
                    PreferenceUtil.saveUserData(0, "", "");
                    new SignIn().setVisible(true);
                    this.setVisible(false);
                    break;
                default:
                    setForm(homePageAdmin);
                    break;
            }
        });
        
        setForm(homePageAdmin);
    }
    
    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarMenu = new com.andriawan.event_tix.components.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sidebarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private com.andriawan.event_tix.components.Menu sidebarMenu;
    // End of variables declaration//GEN-END:variables
}
