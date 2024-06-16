/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author taene
 */
public class DBSearch {
    
     Statement stmt;
    ResultSet rs;
    
    public ResultSet searchLoging(String ID){
    try{
        stmt = DBConnection.getStatementConnection();
        String username = ID;//Execute Quary
        rs = stmt.executeQuery("SELECT * FROM users WHERE username='"+username+"'");
    }
    catch (Exception e){
        e.printStackTrace();
    }return rs;
}
  /*  
    public ResultSet searchBill(String ID){
        try{
            stmt = DBConnection.getStatementConnection();

            rs = stmt.executeQuery("SELECT * FROM NewProduct WHERE User_ID='"+ID+"' ");
        }
        catch (Exception e){
            e.printStackTrace();
        }return rs;
    
    
    }
 /*   
    public ResultSet searchLatest(String ID){
        try{
            stmt = DBConnection.getStatementConnection();

            rs = stmt.executeQuery("SELECT * FROM bill WHERE User_ID='"+ID+"' ORDER BY Date DESC ");
        }
        catch (Exception e){
            e.printStackTrace();
        }return rs;
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
}
}
   

