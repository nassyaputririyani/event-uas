/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriawan.event_tix.pages;

import com.andriawan.event_tix.repository.AuthRepository;
import com.andriawan.event_tix.utils.Util;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    
    AuthRepository repository;

    public SignUp() {
        initComponents();
        repository = new AuthRepository();
        
        //center form
        this.setLocationRelativeTo(null);
        
        jLabel7.setIcon(
            new ImageIcon(
                this.getClass().getResource("/com/andriawan/event_tix/icons/img_sign_up.png")
            )
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        buttonSignUp = new com.k33ptoo.components.KButton();
        errorName = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel2.setkEndColor(new java.awt.Color(42, 119, 191));
        kGradientPanel2.setkGradientFocus(300);
        kGradientPanel2.setkStartColor(new java.awt.Color(2, 54, 102));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(910, 610));
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        inputName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputName.setForeground(new java.awt.Color(178, 177, 185));
        inputName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(42, 119, 191)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 78, 86));
        jLabel4.setText("Name");

        inputEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(178, 177, 185));
        inputEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(42, 119, 191)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 78, 86));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 78, 86));
        jLabel6.setText("Password");

        inputPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(70, 78, 86));
        inputPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 120, 215)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(143, 144, 166));
        jLabel8.setText("Already have an account?");

        btnSignIn.setBackground(new java.awt.Color(255, 255, 255));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(2, 54, 102));
        btnSignIn.setText("Sign In");
        btnSignIn.setBorder(null);
        btnSignIn.setBorderPainted(false);
        btnSignIn.setContentAreaFilled(false);
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignInMouseClicked(evt);
            }
        });

        buttonSignUp.setText("SignUp");
        buttonSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSignUp.setkBackGroundColor(new java.awt.Color(42, 119, 191));
        buttonSignUp.setkBorderRadius(25);
        buttonSignUp.setkEndColor(new java.awt.Color(2, 54, 102));
        buttonSignUp.setkHoverEndColor(new java.awt.Color(32, 103, 169));
        buttonSignUp.setkHoverForeGround(new java.awt.Color(204, 204, 255));
        buttonSignUp.setkHoverStartColor(new java.awt.Color(42, 119, 191));
        buttonSignUp.setkSelectedColor(new java.awt.Color(42, 119, 191));
        buttonSignUp.setkStartColor(new java.awt.Color(32, 103, 169));
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });

        errorName.setForeground(new java.awt.Color(153, 0, 0));

        errorEmail.setForeground(new java.awt.Color(153, 0, 0));

        errorPassword.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSignIn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorName)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(inputName)
                                .addComponent(inputEmail)
                                .addComponent(jLabel6)
                                .addComponent(inputPassword)
                                .addComponent(buttonSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(errorEmail)
                            .addComponent(errorPassword))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorName)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(errorEmail)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPassword)
                .addGap(19, 19, 19)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnSignIn))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ease Vent");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> Welcome, please fill the blank input to sign up</html>");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseClicked
        SignIn login = new SignIn();
            login.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnSignInMouseClicked

    private boolean validateInput() {
        String name = inputName.getText().trim();
        String email = inputEmail.getText().trim();
        String password = new String(inputPassword.getPassword()).trim();

        boolean valid = true;

        if (name.isEmpty()) {
            errorName.setText("Silahkan isi nama");
            valid = false;
        } else {
            errorName.setText("");
        }

        if (email.isEmpty()) {
            errorEmail.setText("Silahkan isi email");
            valid = false;
        } else if (!Util.isValidEmailAddress(email)) {
            errorEmail.setText("Email tidak valid");
            valid = false;
        } else {
            errorEmail.setText("");
        }

        if (password.isEmpty()) {
            errorPassword.setText("Silahkan isi password");
            valid = false;
        } else if (password.length() < 8 || password.length() > 16) {
            errorPassword.setText("Panjang password 8-16 karakter");
            valid = false;
        } else {
            errorPassword.setText("");
        }

        return valid;
    }

    private void kGradientPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseEntered
        btnSignIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonSignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_kGradientPanel2MouseEntered

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        if (validateInput()) {
            String name = inputName.getText().trim();
            String email = inputEmail.getText().trim();
            String password = new String(inputPassword.getPassword()).trim();
            
            if (repository.register(name, email, password)) {
                JOptionPane.showMessageDialog(null, "Berhasil melakukan registrasi");
                inputEmail.setText("");
                inputName.setText("");
                inputPassword.setText("");
            }
        }
    }//GEN-LAST:event_buttonSignUpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private com.k33ptoo.components.KButton buttonSignUp;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorName;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
