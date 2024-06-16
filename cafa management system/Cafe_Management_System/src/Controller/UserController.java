/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author taene
 */
public class UserController {
    public static void Add(String Category, String Quantity ,String Price) {
        
            new Model.AddRecord().Add(Category, Quantity , Price);
            JOptionPane.showMessageDialog(null, "New Product has been inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void Addemployee(String EmployeeID, String EmployeeName ,String Email, String Address ,String MobileNumber) {
        
            new Model.AddRecord().Addemployee(EmployeeID, EmployeeName , Email, Address , MobileNumber);
            JOptionPane.showMessageDialog(null, "New Employee Detail has been inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
}
}
