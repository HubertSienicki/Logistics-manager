/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype_Company.GUI;

import java.io.File;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kneiv
 */
public class MainPage_Logged_in extends javax.swing.JFrame {
    
    public static void Weather(){
        
    }
    public MainPage_Logged_in() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title_1 = new javax.swing.JLabel();
        separator_1 = new javax.swing.JSeparator();
        AddOrder = new javax.swing.JButton();
        AddDriver = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        CurrentOrdersB = new javax.swing.JButton();
        AddCustomer = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title_1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Title_1.setText("ArtTranssc Delivery Manager");

        AddOrder.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        AddOrder.setText("Dodaj Zamówienie");
        AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderActionPerformed(evt);
            }
        });

        AddDriver.setText("Dodaj Kierowce");
        AddDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDriverActionPerformed(evt);
            }
        });

        BackButton.setText("Wyloguj");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CurrentOrdersB.setText("Aktualne zamówienia");
        CurrentOrdersB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentOrdersBActionPerformed(evt);
            }
        });

        AddCustomer.setText("Dodal Klienta");
        AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator_1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Title_1)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CurrentOrdersB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(AddOrder)
                .addGap(18, 18, 18)
                .addComponent(AddDriver)
                .addGap(18, 18, 18)
                .addComponent(AddCustomer)
                .addGap(18, 18, 18)
                .addComponent(CurrentOrdersB)
                .addGap(86, 86, 86)
                .addComponent(BackButton)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderActionPerformed
        AddOrder x = new AddOrder();
        x.setVisible(true);
        x.setTitle("ArtTranssc Delivery Manager");
        dispose();
    }//GEN-LAST:event_AddOrderActionPerformed

    private void AddDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDriverActionPerformed
        // TODO add your handling code here:
        AddDeliverer x = new AddDeliverer();
        x.setVisible(true);
        x.setTitle("ArtTranssc Delivery Manager");
        dispose();
    }//GEN-LAST:event_AddDriverActionPerformed

    private void CurrentOrdersBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentOrdersBActionPerformed
        CurrentOrders cu = new CurrentOrders();
        cu.setVisible(true);
        cu.setTitle("ArtTranssc Delivery Manager");
    }//GEN-LAST:event_CurrentOrdersBActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Wylogowano pomyslnie");
        
        MainPage xd = new MainPage();
        xd.setVisible(rootPaneCheckingEnabled);
        xd.setTitle("ArtTranssc Delivery Manager");
                dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerActionPerformed
        AddClient x = new AddClient();
        x.setVisible(rootPaneCheckingEnabled);
        x.setTitle("ArtTranssc Delivery Manager");
        dispose();
    }//GEN-LAST:event_AddCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage_Logged_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage_Logged_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AddCustomer;
    private javax.swing.JButton AddDriver;
    private javax.swing.JButton AddOrder;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CurrentOrdersB;
    private javax.swing.JLabel Title_1;
    private javax.swing.JSeparator separator_1;
    // End of variables declaration//GEN-END:variables
}
