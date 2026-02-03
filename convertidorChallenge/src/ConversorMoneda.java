import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoneda {
    public String monedaInicial;
    public String monedaFinal;
    public double monto;

    public Moneda convertirMoneda(String monedaInicial, String monedaFinal, double monto) throws IOException, InterruptedException {
        var direccion= "https://v6.exchangerate-api.com/v6/fd92332e0875dbb8b762fc27/pair/"+monedaInicial+"/"+monedaFinal+"/"+monto+"";
        HttpClient client =HttpClient.newHttpClient();
        HttpRequest request =HttpRequest.newBuilder().uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(),Moneda.class);
    }
    public boolean validacion(String lectura){
        if (lectura.equalsIgnoreCase("ARS")||lectura.equalsIgnoreCase("BOB")||lectura.equalsIgnoreCase("BRL")
        ||lectura.equalsIgnoreCase("CLP")||lectura.equalsIgnoreCase("COP")||lectura.equalsIgnoreCase("USD")||lectura.equalsIgnoreCase("MXN")){
           return true;
        }else{
            return false;
        }
    }

}
