
package Prototype_Company.GUI;

import Prototype_Company.GUI.MainPage_Logged_in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MainPage extends javax.swing.JFrame {

    
    public MainPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title_1 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Username = new javax.swing.JTextPane();
        LoginText = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        PasswordText = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title_1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Title_1.setText("ArtTranssc Delivery Manager");

        jScrollPane1.setViewportView(Username);

        LoginText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginText.setText("Nazwa");

        PasswordText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PasswordText.setText("Haslo");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Title_1)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(LoginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordText)
                .addGap(1, 1, 1)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkLogin(){
         int count = 0;
        
            
        try{
            //create connection
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
           
           //setters for username and password
         String un = Username.getText().trim();
         String pw = Password.getText().trim();
        
        String sql = "SELECT USERNAME, PASSWORD FROM CREDENTIALS WHERE USERNAME='"+un+"'AND PASSWORD='"+pw+"'";
        
           //debug
        System.out.println(sql);
           //debug
           
           ResultSet execute = stmt.executeQuery(sql);
           
           // taking care of three possible situations : no data, good data and wrongly written data
           if(un.isEmpty()||pw.isEmpty()){
               JOptionPane.showMessageDialog(null, "Dane nie zostaly wpisane, sprobuj ponownie");
               return;
           }
            
           while(execute.next()){
               count ++;
               System.out.println(count);
           }
           
           
           if(count==1){
               JOptionPane.showMessageDialog(null,"Znaleziono uzytkownika, zalogowano");
               //page creaton when being logged in
        MainPage_Logged_in x = new MainPage_Logged_in();
       x.setVisible(true);
       x.setTitle("ArtTranssc Delivery Manager");
        dispose();
           }
           else JOptionPane.showMessageDialog(null, "Bledne dane, spróbuj ponownie");
           return;
            
           
        }

        //error management
catch (Exception e){
    System.out.println(e);
}
    }
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        checkLogin();
       
    }//GEN-LAST:event_LoginButtonActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginText;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel Title_1;
    private javax.swing.JTextPane Username;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
