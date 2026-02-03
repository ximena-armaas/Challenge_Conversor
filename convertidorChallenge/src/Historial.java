import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Historial {
    public void crearHistorial(List<Moneda> monedas) throws IOException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        FileWriter writer = new FileWriter("conversiones.json");
        writer.write(gson.toJson(monedas));
        writer.close();

    }
}
