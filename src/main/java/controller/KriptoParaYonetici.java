/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.swing.ImageIcon;
import model.KriptoParaBorsaBilgi;
import model.KriptoParalar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

/**
 *
 * @author asimsinanyuksel
 */
public class KriptoParaYonetici {

    private static final String BINANCE_SERVIS_URL = "https://www.binance.com/exchange/public/product";
    private static final String BINANCE_PARA_BILGI_URL = "https://api.binance.com/api/v1/ticker/24hr?symbol=";
    private ObjectMapper nesneMapper;
    private final OkHttpClient httpIstemci;
    private final Builder urlBuilder;
    private final  Request tumParaRequest;
    public KriptoParaYonetici() {
        nesneMapper = new ObjectMapper();
        httpIstemci = new OkHttpClient();
        urlBuilder = new Builder();
        tumParaRequest = urlBuilder.url(BINANCE_SERVIS_URL).get().build();
   }

    public KriptoParaBorsaBilgi kriptoParaBorsaBilgiGetir(String paraSembol) throws Exception {
        KriptoParaBorsaBilgi borsaParaBilgi = null;
        Request request = urlBuilder.url(BINANCE_PARA_BILGI_URL + paraSembol).get().build();
        try (Response response = httpIstemci.newCall(request).execute()) {
            borsaParaBilgi = nesneMapper.readValue(response.body().bytes(), KriptoParaBorsaBilgi.class);
        }
        return borsaParaBilgi;
    }

    public KriptoParalar tumParalariGetir() throws Exception {
        KriptoParalar kriptoParalar = null;
        try (Response response = httpIstemci.newCall(tumParaRequest).execute()) {
            nesneMapper = new ObjectMapper();
            kriptoParalar = nesneMapper.readValue(response.body().bytes(), KriptoParalar.class);
        }
        return kriptoParalar;
    }
 
    public static ImageIcon resimOlustur(String yol) {
        java.net.URL imgURL = KriptoParaYonetici.class.getResource("/resimler/" + yol + ".png");
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            return null;
        }
    }

}
