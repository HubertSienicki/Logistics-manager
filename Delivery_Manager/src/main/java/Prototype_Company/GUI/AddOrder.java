/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype_Company.GUI;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import javax.swing.JOptionPane;

public class AddOrder extends javax.swing.JFrame {

    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
        initComponents();
        
        
        
        
        
        try{
           
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
        String products = "SELECT NAME FROM PRODUCT;";
        String customer = "SELECT FIRSTNAME, LASTNAME FROM CUSTOMER;";
        String deliverer = "SELECT FIRSTNAME, LASTNAME FROM EMPLOYEE"
                + " JOIN DELIVERER ON (DELIVERER.DELIVERERID = EMPLOYEE.EMPLOYEEID); ";
       
        ResultSet execute = stmt.executeQuery(products);
        
        while(execute.next()){
           
         System.out.println(execute);
            Products.addItem(execute.getString("Name"));

          }
        
        execute = stmt.executeQuery(customer);
       
        
        while(execute.next()){
            Clients.addItem(execute.getString("Firstname") + " " + execute.getString("Lastname"));
        
        }
       
        execute = stmt.executeQuery(deliverer);
        
        while(execute.next()){
            Deliverers.addItem(execute.getString("Firstname") + " " + execute.getString("Lastname"));
        }
        
        }
       
        
        
        
        catch(Exception e){
           System.out.println(e);
       }
         
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Products = new javax.swing.JComboBox<>();
        Product_indicator = new javax.swing.JLabel();
        Client_indicator = new javax.swing.JLabel();
        Clients = new javax.swing.JComboBox<>();
        Deliverers = new javax.swing.JComboBox<>();
        Deliver_indicator = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        AddOrderButton = new javax.swing.JButton();
        days = new javax.swing.JTextField();
        Title_order = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });

        Product_indicator.setText("Produkt");

        Client_indicator.setText("Klient");

        Clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientsActionPerformed(evt);
            }
        });

        Deliver_indicator.setText("Dostawca");

        amount.setText("Ilosc");
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        AddOrderButton.setText("Dodaj Zamówienie");
        AddOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderButtonActionPerformed(evt);
            }
        });

        days.setText("Dni do konca");
        days.setToolTipText("");
        days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysActionPerformed(evt);
            }
        });

        Title_order.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Title_order.setText("Dodaj Zamowienie");

        BackButton.setText("Powrot");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(amount))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Products, 0, 83, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Product_indicator)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(224, 224, 224))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Deliverers, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clients, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Deliver_indicator))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Client_indicator)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddOrderButton)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Title_order)
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_order)
                .addGap(63, 63, 63)
                .addComponent(Product_indicator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Client_indicator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(Deliver_indicator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Deliverers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddOrderButton)
                    .addComponent(BackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
      
    }//GEN-LAST:event_ProductsActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysActionPerformed

    private void ClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientsActionPerformed
private void insertOrder(){
    int tempOrder = 0;
        int tempCustomer = 0;
        int tempProduct = 0;
        int tempDeliverer = 0;
        String tempNameC;
        String tempNameP;
        String tempNameD;
        
        try{
           
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
        String tempsql1 = "SELECT orderid FROM orders";
        String tempsql2 = "select productid from product where name = ";
        String tempsql3 = "select customerid from customer where firstname =  ";
        String tempsql4 ="select delivererid from deliverer join employee on (deliverer.delivererid = employee.employeeid) where employee.firstname = ";
        //last id in orders
        ResultSet execute = stmt.executeQuery(tempsql1);
            System.out.println(execute);
            //Retrieving last known id from orders
            while(execute.next()){
              tempOrder = execute.getInt("orderid");
              //debug
                System.out.println("Last id in order " + tempOrder);
            }
            tempOrder ++;        
            System.out.println(tempOrder);
        
        //retrieve id of chosen customer
        tempNameC = String.valueOf("'" + Clients.getSelectedItem() + "'");;
            String split1[] = tempNameC.split(" ");
            for (int i = 0; i < split1.length; i++) {
                //debug
                System.out.println(split1[i]);
            }
            tempsql3 = tempsql3 + split1[0] + "'" + " and lastname = " + "'" + split1[1].substring(0, split1[1].length()) ;
            //debug
            System.out.println(tempsql3);
        execute = stmt.executeQuery(tempsql3);
        while(execute.next()){
            tempCustomer = execute.getInt("customerid");
        }
            //debug
        System.out.println(tempCustomer);
        
        //retrieve id of chosen product
        tempNameP = String.valueOf("'" + Products.getSelectedItem() + "'");
        //debug
            System.out.println(tempNameP);
            tempsql2 = tempsql2 + tempNameP;
            //debug
            System.out.println(tempsql2);
        execute = stmt.executeQuery(tempsql2);
        while(execute.next()){
            tempProduct = execute.getInt("productid");
        }
        //debug   
        System.out.println(tempProduct);
            
        //retrieve id of chosen deliverer
        tempNameD = String.valueOf("'" + Deliverers.getSelectedItem() + "'");
            String split2[] = tempNameD.split(" ");
            for (int i = 0; i < split2.length; i++) {
                //debug
                System.out.println(split2[i]);
            }
            tempsql4 = tempsql4 + split2[0] + "'" + " and lastname = " + "'" + split2[1].substring(0, split2[1].length());
            //debug
            System.out.println(tempsql4);
        execute = stmt.executeQuery(tempsql4);
        while(execute.next()){
            tempDeliverer = execute.getInt("delivererid");
        }
        //debug
            System.out.println(tempDeliverer);   
           
           
        }
        
      
               
        catch(Exception e){
            System.out.println(e);
        }
        ArrayList Query = new ArrayList();
        //todays date formatter
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
        LocalDateTime now = LocalDateTime.now();
        String today = dtf1.format(now);
        //added days day formatter
        int daysAdded = Integer.parseInt(days.getText());     
        LocalDateTime end = LocalDateTime.now().plusDays(daysAdded);
        String endDate = dtf2.format(end);
        //debug
        System.out.println(end);
        int Amount = Integer.parseInt(amount.getText());
        
        if (Amount >= 30){
            JOptionPane.showMessageDialog(null, "Ilosc zamówienia jest zbyt wysoka\n"
                                                +"Aktualna pojemosc ciezarowek wynosi od 10 do 30 Ton");
            return;
        }
        if (Amount <= 10){
            JOptionPane.showMessageDialog(null, "Ilosc zamówienia jest zbyt niska.\n"  
                                                +"Aktualna pojemosc ciezarowek wynosi od 10 do 30 Ton");
            return;
        }
      
                
        Query.add(tempOrder);
        Query.add(tempCustomer);
        Query.add(tempDeliverer);
        Query.add(tempProduct);
        Query.add(today);
        Query.add(end);
        Query.add(Amount);
       
        //debug
        System.out.println(Query);
        
        //CREATE A QUERY
        String sql = "Insert into orders values ( ";
        for (int i = 0; i < Query.size(); i++) {
            if(i == Query.size()-1){
                sql = sql + Query.get(i) + ")";
                break;
            }
            if(i == 4 || i == 5){
            sql = sql + "'" + Query.get(i) + "'" + ",";
            
        }
           
        else sql = sql + Query.get(i) + ",";
        }
        //debug
        System.out.println(sql);
        
        
       try{
           
          Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
        
        stmt.execute(sql);
        JOptionPane.showMessageDialog(null, "Zamowienie dodane pomyslnie");
        conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Blad przy dodawaniu zamówienia, sprawdz log");
            System.out.println(e);
        }
}
    private void AddOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderButtonActionPerformed
        insertOrder();
    }//GEN-LAST:event_AddOrderButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        MainPage_Logged_in x = new MainPage_Logged_in();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrderButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Client_indicator;
    private javax.swing.JComboBox<String> Clients;
    private javax.swing.JLabel Deliver_indicator;
    private javax.swing.JComboBox<String> Deliverers;
    private javax.swing.JLabel Product_indicator;
    private javax.swing.JComboBox<String> Products;
    private javax.swing.JLabel Title_order;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField days;
    // End of variables declaration//GEN-END:variables
}
