import com.aluracursos.conversor.APIService;
import com.aluracursos.conversor.MenuUsuario;
import com.aluracursos.conversor.TiposDeMoneda;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        MenuUsuario Menu = new MenuUsuario();
        TiposDeMoneda monedas = new TiposDeMoneda();
        
        int condicionalCiclo = 1;

while (condicionalCiclo==1){

    Menu.menuUsuario();
    int opcionUsuario = scanner.nextInt();

        if (opcionUsuario == 1) {

            System.out.println("Escoja la moneda que desea convertir: ");
            Menu.catalogoDeMonedas();

            opcionUsuario = scanner.nextInt();

            switch (opcionUsuario){
            case 1:

                monedas.setMonedaEntrada("COP");

                break;

            case 2:

                monedas.setMonedaEntrada("ARS");

                break;

            case 3:

                monedas.setMonedaEntrada("BOB");

                break;

            case 4:

                monedas.setMonedaEntrada("BRL");

                break;

            case 5:

                monedas.setMonedaEntrada("CLP");

                break;

            case 6:

                monedas.setMonedaEntrada("USD");

                break;

            case 7:

                monedas.setMonedaEntrada("EUR");

                break;}

            System.out.println("¿A que moneda la quiere convertir?: ");
            Menu.catalogoDeMonedas();
            opcionUsuario = scanner.nextInt();

            switch (opcionUsuario){
                case 1:

                    monedas.setMonedaSalida("COP");

                    break;

                case 2:

                    monedas.setMonedaSalida("ARS");

                    break;

                case 3:

                    monedas.setMonedaSalida("BOB");

                    break;

                case 4:

                    monedas.setMonedaSalida("BRL");

                    break;

                case 5:

                    monedas.setMonedaSalida("CLP");

                    break;

                case 6:

                    monedas.setMonedaSalida("USD");

                    break;

                case 7:

                    monedas.setMonedaSalida("EUR");

                    break;}

            System.out.println("Se hara la conversión de: " + monedas.getMonedaEntrada() +" a "+ monedas.getMonedaSalida());

            APIService service = new APIService();
            service.obtenerInformacionApi(monedas.getMonedaEntrada(), monedas.getMonedaSalida());

            System.out.println("¿Cuanto desea convertir?");
            var valorAconvertir = scanner.nextDouble();
            double conversion = valorAconvertir ;

            System.out.println(valorAconvertir +" "+ monedas.getMonedaEntrada() + ", Corresponden a " +
                    monedas.getMonedaSalida()+ " " +conversion * service.tasaApi);

            System.out.println("""
        ¿Desea terminar?
        1 - Si
        2 - No
        """);

            opcionUsuario = scanner.nextInt();

            if     (opcionUsuario==2) {
            condicionalCiclo=1;

            } else if (opcionUsuario==1){condicionalCiclo=2;
                System.out.println("Gracias por confiar en nosotros");
            }else  {condicionalCiclo=1;
                System.out.println("""
                    Opción invalida
                    """);
            }


        } else if (opcionUsuario==2) {condicionalCiclo=2;
            System.out.println("Gracias por confiar en nosotros");
        } else  {condicionalCiclo=1;
            System.out.println("""
                    Opción invalida
                    """);
        }


    }
    }}
