
package Prototype_Company;
import Prototype_Company.GUI.TitleScreen;
 import java.sql.*; 
import java.util.ArrayList;

public class Main {
    // JDBC driver name and database URL 
   
    
   
        
    public static void main(String[] args) throws InterruptedException {
        //DATABASE CREATION
             
//        Class.forName("org.h2.Driver").newInstance();
//        Connection con = DriverManager.getConnection("jdbc:h2:C:\\Users\\kneiv\\ArtTranssc_database", "root", "Pokemon123");
//        System.out.println("Database Created");
        
        //DATABASE CONNECTION AND QUERY EXECUTION TEST
//        DbDriver con = new DbDriver();
//        con.testconnection();
//        ArrayList values = new ArrayList();
//        values.add(1);
//        values.add("Hubert");
//        values.add("Sienicki");
//        values.add(18);
//        System.out.println(values);
//        
//        con.insertIntoTable("REGISTRATION", values);
        
//        con.removetest();
        
        //SQL QUERY TESTS
            //1
//        String name =   "REGISTRATION";
//        String column = "Address";
//        Object value = 1;
//        int id = 3;
//        String sql = "UPDATE " + name + "\n"
//                   + "SET " + column  + " = "+ value + "\n"
//                   + "WHERE ID = " + id;
//        System.out.println(sql);

        
         TitleScreen ts = new TitleScreen();
         ts.setVisible(true);
         ts.setTitle("ArtTranssc Delivery Manager");
         
             
        
        

    }
    
}
