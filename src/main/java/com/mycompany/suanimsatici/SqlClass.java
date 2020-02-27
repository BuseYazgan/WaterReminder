/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suanimsatici;

import static com.mycompany.suanimsatici.Home.lblHedef;
import static com.mycompany.suanimsatici.Home.lblIcilenMiktar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class SqlClass {
    java.util.Date date;
java.sql.Date sqlDate;
 waterreminder wr=new waterreminder();
 public void Ekle(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
    }
    Connection baglanti=null;
    try{
        baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/waterreminder","root","1999");
    }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
        }
    try{
       
        java.util.Date d = new java.util.Date();
        java.sql.Date sd = new java.sql.Date(d.getTime());
        PreparedStatement uygula=baglanti.prepareStatement("INSERT INTO reminder(Tarih,IcilenMiktari,Hedef)VALUES(?,?,?)");
        wr.Tarih=sd;
        wr.IcilenMiktar=Integer.parseInt(lblIcilenMiktar.getText());
        wr.Hedef=Integer.parseInt(lblHedef.getText());
        uygula.setDate(1, wr.Tarih);
        uygula.setInt(2, wr.IcilenMiktar);
        uygula.setInt(3, wr.Hedef);
        int donut=uygula.executeUpdate();
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Hata:"+e.getMessage());
  
    }
}
    public void Sil(){
            try {
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
    }
    Connection baglanti=null;
    try{
        baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/waterreminder","root","1999");
    }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
        }
    try{
        java.util.Date d = new java.util.Date();
        java.sql.Date sd = new java.sql.Date(d.getTime());
        PreparedStatement uygula=baglanti.prepareStatement("DELETE FROM reminder WHERE Tarih=?");
        wr.Tarih=sd;
        uygula.setDate(1, wr.Tarih);
        int donut = uygula.executeUpdate();
    }
    catch( SQLException e){
        JOptionPane.showMessageDialog(null,"Hata:"+e.getMessage());
  
    }
    }
   public void Guncelle(){
            try {
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
    }
    Connection baglanti=null;
    try{
        baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/waterreminder","root","1999");
    }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Hata:" + e.getMessage());
        }
    try{
        java.util.Date d = new java.util.Date();
        java.sql.Date sd = new java.sql.Date(d.getTime());
        PreparedStatement uygula=baglanti.prepareStatement("UPDATE reminder set IcilenMiktari=?,Hedef=? where Tarih=? ");        
        wr.IcilenMiktar=Integer.parseInt(lblIcilenMiktar.getText());
        wr.Hedef=Integer.parseInt(lblHedef.getText());
        wr.Tarih=sd;
        uygula.setInt(1, wr.IcilenMiktar);
        uygula.setInt(2, wr.Hedef);
        uygula.setDate(3, wr.Tarih);        
        int executeUpdate = uygula.executeUpdate();
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Hata:"+e.getMessage());
    }
   }
}
    
