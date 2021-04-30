/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype_Company;

import java.sql.*;
import java.util.ArrayList;

public class DbDriver {
    
   public DbDriver() throws Exception {
        
}
   public void LoginForm(String login, String password, String creds){
   }
   
   public void EditRow(String name, int id,  ArrayList columns, ArrayList values) throws Exception{
       try{
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
           if (columns.size() == 1 && values.size() == 1){
            
               String sql = "UPDATE " + name + "\n"
                   + "SET " + columns.get(0)  + " = "+ values.get(0) + "\n"
                   + "WHERE ID = " + id;
               stmt.executeUpdate(sql);
           }
          
           else if (columns.size() > 1 && values.size() > 1 && values.size() == columns.size()){
               //create SET statement;
               String set = "SET ";
               for (int i = 0; i < columns.size() ; i++) {
           
                   if (i == columns.size() - 1){
                   set += columns.get(i) + " = " + values.get(i);
               }
                 
                   else  set += columns.get(i) + " = " + values.get(i) + ", ";
               }
              
               
               String sql = "UPDATE " + name + "\n"
                   + set + "\n"
                   + "WHERE ID = " + id; 
           
               stmt.executeUpdate(sql);
           }
           
           else if (columns.size() > 1 && values.size() == 1){
               //CREATE SET STATEMENT
               String set = "SET ";
               for (int i = 0; i < columns.size(); i++) {
                   
                   if(i == columns.size() - 1){
                       set += columns.get(i) + " = " + values.get(1);
                   }
                   
                   else set += columns.get(i) + " = " + values.get(1) + ", ";
               }
                   String sql = "UPDATE " + name + "\n"
                   + "SET " + columns.get(0)  + " = "+ values.get(0) + "\n"
                   + "WHERE ID = " + id;
                   
                   stmt.executeUpdate(sql);
           }
           
           conn.close();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
   }
   
   public void GetByID(String name, int id) throws Exception{
       try{
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt =  conn.createStatement();
       
           String sql = "SELECT * FROM " + name + "WHERE ID = " + id;
       
           stmt.executeUpdate(sql);
           conn.close();
           
       }
       catch(SQLException e){
           System.out.println(e.getMessage());
       }
   
   }
   
   
   public void removeRow(String name, int id) throws Exception{
       try{
       
           
        Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
        Statement stmt = conn.createStatement();
        String sql = "DELETE FROM " + name + " WHERE ID = " + id;
       
        stmt.executeUpdate(sql);
        conn.close();
       }
   
       catch(SQLException e ){
           System.out.println(e.getMessage());
       }
   }
   
   
   public void insertIntoTable(String name, ArrayList values ) throws Exception{
       try{
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
           String sql = "INSERT INTO " + name + " VALUES (";
           for (int i = 0; i < values.size(); i++) {
               if(i == values.size() - 1){
                   
                   if(values.get(i) instanceof String){
                sql += "'" + values.get(i) + "'" + ", ";
               
                   }
                else sql +=  values.get(i) +  ")";
                   break;
               }
               
               if(values.get(i) instanceof String){
                sql += "'" + values.get(i) + "'" + ", ";
               }
             else  sql += values.get(i) + ", ";
           }
           
           System.out.println(sql);
           stmt.executeUpdate(sql);
           conn.close();
       }
       
       catch (SQLException e){
           System.out.println(e.getMessage());
       }
       
   }
   
   public void removeTable(String name) throws Exception{
       try{
           Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
           Statement stmt = conn.createStatement();
           String query = "DROP TABLE IF EXISTS" + name;
           
           stmt.executeUpdate(query);
           System.out.println("Table removed");
           conn.close();
       }
       catch (SQLException e){
           System.out.println(e.getMessage());
       }
   }
   
   
   
   public void addTable(String name) throws Exception{
       try{
            Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS" + name;
            stmt.executeUpdate(sql);
            System.out.println("Table Created");
            conn.close();
            
            
   
       }
        catch(SQLException e){
            System.out.println(e.getMessage());
                    }
   }
   
   
   
   
   
   public void testconnection() throws Exception {
       try{
            Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS REGISTRATION "
                    + "(id INTEGER auto_increment, "
                    + " first VARCHAR(255), "
                    + " last VARCHAR(255), "
                    + " age INTEGER, "
                    + " PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Table Created");
            conn.close();
       }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
   }

   public void removetest() throws Exception {
     try{
          Connection conn = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database" , "root" , "Pokemon123");
          Statement stmt = conn.createStatement();
          String sql = "DROP TABLE IF EXISTS REGISTRATION";
          stmt.execute(sql);
          System.out.println("Table Removed");
          conn.close();
            
     }
     
     catch (SQLException e){
            System.err.println(e.getMessage());
        }
}   

}
