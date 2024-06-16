/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author taene
 */
public class AddRecord {
    Statement stmt;
    
    public void Add( String Category, String Quantity ,String Price){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO NewProduct VALUES('"+Category+"', '"+Quantity+"', '"+Price+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void Addemployee( String EmployeeID, String EmployeeName ,String Email,String Address, String MobileNumber){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO employee_details VALUES('"+EmployeeID+"', '"+EmployeeName+"', '"+Email+"','"+Address+"', '"+MobileNumber+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
}
    
}
