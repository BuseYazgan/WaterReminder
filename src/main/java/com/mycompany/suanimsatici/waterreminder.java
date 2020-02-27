/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suanimsatici;

import java.sql.Date;

/**
 *
 * @author pc
 */
public class waterreminder {
    public int waterID;
    public Date Tarih;
    public int IcilenMiktar;
    public int Hedef;
    
    public void Tarih(Date tarih){
        Tarih=tarih;
    }
    public Date getTarih(){
        return Tarih;
    }
    public void IcilenMiktar(int miktar){
        IcilenMiktar=miktar;
    }
    public int getMiktar(){
        return IcilenMiktar;
    }
    public void Hedef(int hedef ){
        Hedef=hedef;
    }
    public int getHedef(){
        return Hedef;
    }
}
