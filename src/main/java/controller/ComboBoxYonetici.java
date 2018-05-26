/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import model.KriptoPara;

/**
 *
 * @author asimsinanyuksel
 */
public class ComboBoxYonetici {
    private ArrayList<KriptoPara> paralar;
    
    private JComboBox paralarListe;
   
    public ComboBoxYonetici(JComboBox paralarListe){
    this.paralarListe=paralarListe;
   
    }
    
    public void icerikOlustur(){
                for(int i=0;i<getParalar().size();i++) {
                   KriptoPara para=getParalar().get(i);
                   if(para.getSymbol().endsWith("BTC")) 
                   paralarListe.addItem(para);
                }           
    } 

    /**
     * @return the paralar
     */
    public ArrayList<KriptoPara> getParalar() {
        return paralar;
    }

    /**
     * @param paralar the paralar to set
     */
    public void setParalar(ArrayList<KriptoPara> paralar) {
        this.paralar = paralar;
    }
   
    
}
