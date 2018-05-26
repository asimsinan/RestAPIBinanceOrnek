/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author asimsinanyuksel
 */
public class KriptoParalar implements Serializable {
    private ArrayList<KriptoPara> data;

    /**
     * @return the data
     */
    public ArrayList<KriptoPara> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(ArrayList<KriptoPara> data) {
        this.data = data;
    }

}
