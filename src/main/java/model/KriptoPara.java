/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.KriptoParaYonetici;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author asimsinanyuksel
 */
public class KriptoPara implements Serializable{
    private String symbol;
    private ImageIcon paraResmi;
    private String status;
    private String minQty;
    private String quoteAsset;
    private String lastAggTradeId;
    private String quoteAssetName;
    private String tradedMoney;
    private String baseAssetUnit;
    private String baseAssetName;
    private String baseAsset;
    private String tickSize;
    private String prevClose;
    private String activeBuy;
    private String high;
    private String low;
    private String matchingUnitType;
    private String productType;
    private String active;
    private String close;
    private String open;
    private String lowPrice;
    private String volume;
    private String minTrade;
    private String activeSell;
    private String withdrawFee;
    private String decimalPlaces;
    private String quoteAssetUnit;

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the minQty
     */
    public String getMinQty() {
        return minQty;
    }

    /**
     * @param minQty the minQty to set
     */
    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    /**
     * @return the quoteAsset
     */
    public String getQuoteAsset() {
        return quoteAsset;
    }

    /**
     * @param quoteAsset the quoteAsset to set
     */
    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    /**
     * @return the lastAggTradeId
     */
    public String getLastAggTradeId() {
        return lastAggTradeId;
    }

    /**
     * @param lastAggTradeId the lastAggTradeId to set
     */
    public void setLastAggTradeId(String lastAggTradeId) {
        this.lastAggTradeId = lastAggTradeId;
    }

    /**
     * @return the quoteAssetName
     */
    public String getQuoteAssetName() {
        return quoteAssetName;
    }

    /**
     * @param quoteAssetName the quoteAssetName to set
     */
    public void setQuoteAssetName(String quoteAssetName) {
        this.quoteAssetName = quoteAssetName;
    }

    /**
     * @return the tradedMoney
     */
    public String getTradedMoney() {
        return tradedMoney;
    }

    /**
     * @param tradedMoney the tradedMoney to set
     */
    public void setTradedMoney(String tradedMoney) {
        this.tradedMoney = tradedMoney;
    }

    /**
     * @return the baseAssetUnit
     */
    public String getBaseAssetUnit() {
        return baseAssetUnit;
    }

    /**
     * @param baseAssetUnit the baseAssetUnit to set
     */
    public void setBaseAssetUnit(String baseAssetUnit) {
        this.baseAssetUnit = baseAssetUnit;
    }

    /**
     * @return the baseAssetName
     */
    public String getBaseAssetName() {
        return baseAssetName;
    }

    /**
     * @param baseAssetName the baseAssetName to set
     */
    public void setBaseAssetName(String baseAssetName) {
        this.baseAssetName = baseAssetName;
    }

    /**
     * @return the baseAsset
     */
    public String getBaseAsset() {
        return baseAsset;
    }

    /**
     * @param baseAsset the baseAsset to set
     */
    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    /**
     * @return the tickSize
     */
    public String getTickSize() {
        return tickSize;
    }

    /**
     * @param tickSize the tickSize to set
     */
    public void setTickSize(String tickSize) {
        this.tickSize = tickSize;
    }

    /**
     * @return the prevClose
     */
    public String getPrevClose() {
        return prevClose;
    }

    /**
     * @param prevClose the prevClose to set
     */
    public void setPrevClose(String prevClose) {
        this.prevClose = prevClose;
    }

    /**
     * @return the activeBuy
     */
    public String getActiveBuy() {
        return activeBuy;
    }

    /**
     * @param activeBuy the activeBuy to set
     */
    public void setActiveBuy(String activeBuy) {
        this.activeBuy = activeBuy;
    }

    /**
     * @return the high
     */
    public String getHigh() {
        return high;
    }

    /**
     * @param high the high to set
     */
    public void setHigh(String high) {
        this.high = high;
    }

    /**
     * @return the low
     */
    public String getLow() {
        return low;
    }

    /**
     * @param low the low to set
     */
    public void setLow(String low) {
        this.low = low;
    }

    /**
     * @return the matchingUnitType
     */
    public String getMatchingUnitType() {
        return matchingUnitType;
    }

    /**
     * @param matchingUnitType the matchingUnitType to set
     */
    public void setMatchingUnitType(String matchingUnitType) {
        this.matchingUnitType = matchingUnitType;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return the active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return the close
     */
    public String getClose() {
        return close;
    }

    /**
     * @param close the close to set
     */
    public void setClose(String close) {
        this.close = close;
    }

    /**
     * @return the open
     */
    public String getOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(String open) {
        this.open = open;
    }

    /**
     * @return the lowPrice
     */
    public String getLowPrice() {
        return lowPrice;
    }

    /**
     * @param lowPrice the lowPrice to set
     */
    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * @return the minTrade
     */
    public String getMinTrade() {
        return minTrade;
    }

    /**
     * @param minTrade the minTrade to set
     */
    public void setMinTrade(String minTrade) {
        this.minTrade = minTrade;
    }

    /**
     * @return the activeSell
     */
    public String getActiveSell() {
        return activeSell;
    }

    /**
     * @param activeSell the activeSell to set
     */
    public void setActiveSell(String activeSell) {
        this.activeSell = activeSell;
    }

    /**
     * @return the withdrawFee
     */
    public String getWithdrawFee() {
        return withdrawFee;
    }

    /**
     * @param withdrawFee the withdrawFee to set
     */
    public void setWithdrawFee(String withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    /**
     * @return the decimalPlaces
     */
    public String getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * @param decimalPlaces the decimalPlaces to set
     */
    public void setDecimalPlaces(String decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    /**
     * @return the quoteAssetUnit
     */
    public String getQuoteAssetUnit() {
        return quoteAssetUnit;
    }

    /**
     * @param quoteAssetUnit the quoteAssetUnit to set
     */
    public void setQuoteAssetUnit(String quoteAssetUnit) {
        this.quoteAssetUnit = quoteAssetUnit;
    }

    @Override
    public String toString() {
        return getBaseAssetName(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the paraResmi
     */
    public ImageIcon getParaResmi() {
        return KriptoParaYonetici.resimOlustur(getBaseAsset());
    }    

}
