/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.Candlestick;
import com.binance.api.client.domain.market.CandlestickInterval;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.xy.AbstractXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataset;

public class MumGrafikYonetici{
     private BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("API-KEY", "SECRET");
     private BinanceApiRestClient client = factory.newRestClient();
     private JFreeChart chart; 
     private JPanel panel;
     private ChartPanel chartPanel;
     public MumGrafikYonetici(JPanel panel){
         this.panel=panel;
     }
     public void mumGrafikPanelEkle(String stockSymbol) {
     DateAxis domainAxis= new DateAxis("Tarih");
     NumberAxis rangeAxis= new NumberAxis("Fiyat");
     CandlestickRenderer renderer = new CandlestickRenderer();
        XYDataset   dataset= getDataSet(stockSymbol);
        XYPlot mainPlot = new XYPlot(dataset, domainAxis, rangeAxis, renderer);
        renderer.setSeriesPaint(0, Color.BLACK);
        renderer.setDrawVolume(true);
        rangeAxis.setAutoRangeIncludesZero(false);
        domainAxis.setTimeline( SegmentedTimeline.newMondayThroughFridayTimeline() );
        chart = new JFreeChart(stockSymbol, null, mainPlot, false);
        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(panel.getPreferredSize());
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(chartPanel);
        panel.validate();
    }
    
    public void mumGuncelle(String sembol){
      chart.getXYPlot().setDataset(null);
      XYDataset   dataset= getDataSet(sembol);
      chart.setTitle(sembol);
      chart.getXYPlot().setDataset(dataset);
    }
    
    protected OHLCDataItem[] getData(String sembol) {
        List<OHLCDataItem> dataItems = new ArrayList<OHLCDataItem>();
        List<Candlestick> candlesticks = client.getCandlestickBars(sembol, CandlestickInterval.FIVE_MINUTES);
        try {
            for (int i = 0; i < candlesticks.size(); i++) {
                Candlestick veri=candlesticks.get(i);
                Date date       = new Date(veri.getOpenTime());
                double open     = Double.parseDouble(veri.getOpen());
                double high     = Double.parseDouble(veri.getHigh() );
                double low      = Double.parseDouble(veri.getLow() );
                double close    = Double.parseDouble(veri.getClose() );
                double volume   = Double.parseDouble(veri.getVolume() );
                
                OHLCDataItem item = new OHLCDataItem(date, open, high, low, close, volume);
                dataItems.add(item);
            }
       
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //Convert the list into an array
        OHLCDataItem[] data = dataItems.toArray(new OHLCDataItem[dataItems.size()]);

        return data;
    }
    protected AbstractXYDataset getDataSet(String stockSymbol) {
        //This is the dataset we are going to create
        DefaultOHLCDataset result = null;
        //This is the data needed for the dataset
        OHLCDataItem[] data;

        //This is where we go get the data, replace with your own data source
        data = getData(stockSymbol);

        //Create a dataset, an Open, High, Low, Close dataset
        result = new DefaultOHLCDataset(stockSymbol, data);

        return result;
    }
}