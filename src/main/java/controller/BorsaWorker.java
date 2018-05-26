/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 *
 * @author asimsinanyuksel
 */
public class BorsaWorker extends SwingWorker<Void, Void> {
    private KriptoParaYonetici hdc;
    private ComboBoxYonetici cby;
    private MumGrafikYonetici mgy;
    private JLabel durum;
    public BorsaWorker(KriptoParaYonetici hdc,MumGrafikYonetici mgy,ComboBoxYonetici cby,JLabel durum){
    this.hdc=hdc;
    this.mgy=mgy;
    this.cby=cby;
    this.durum=durum;
    }
    @Override
    protected Void doInBackground() throws Exception {
        cby.setParalar(hdc.tumParalariGetir().getData());
        return null;
   
    }

    @Override
    protected void done() {
          cby.icerikOlustur();
          mgy.mumGrafikPanelEkle("BNBBTC");
          durum.setText("Borsa Yüklendi!");
   }
    
    

 
    
}
