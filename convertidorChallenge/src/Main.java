import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();
        List<Moneda> monedas = new ArrayList<>();
        Historial historial = new Historial();
        while(true){
            try{
                System.out.println("Bienvenido: \nARS->Peso Argentino\nBOB->Peso Boliviano\nBRL->Real brasileño\nCLP->Peso chileno\nCOP->Peso colombiano\nUSD->Dólar estadounidense\nMXN->Peso mexicano\nEXIT->Salir");
                System.out.println("Por favor, ingresa la moneda base que deseas convertir:");
                var monedaBase = scanner.nextLine();
                if(monedaBase.equalsIgnoreCase("exit")){
                    break;
                }
                if (!conversor.validacion(monedaBase)){
                    throw new RuntimeException("Moneda no reconocida");
                }
                System.out.println("Ahora ingresa la moneda a la que deseas convertir: ");
                var monedaConvertir = scanner.nextLine();
                if (!conversor.validacion(monedaConvertir)){
                    throw  new RuntimeException("Moneda no reconocida");
                }
                System.out.println("Ahora ingresa el monto que deseas convertir");
                var monto = scanner.nextDouble();

                var resultado = conversor.convertirMoneda(monedaBase,monedaConvertir,monto);
                System.out.println(resultado);
                monedas.add(resultado);
                historial.crearHistorial(monedas);
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }

        }



    }
}