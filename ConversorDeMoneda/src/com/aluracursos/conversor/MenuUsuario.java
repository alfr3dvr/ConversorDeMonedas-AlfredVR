package com.aluracursos.conversor;


public class MenuUsuario {

     public void menuUsuario() {
        System.out.println("Bienvenido al sistema de conversión de moneda, a continuación escoja la opción deseada");
        System.out.println("""
                
                1 - Iniciar Conversión
                2 - Salir
                """);
    }

    public void catalogoDeMonedas() {
        System.out.println("""
                
                1. COP - Peso colombiano
                2. ARS - Peso argentino
                3. BOB - Boliviano boliviano
                4. BRL - Real brasileño
                5. CLP - Peso chileno
                6. USD - Dólar estadounidense
                7. EUR - Euro 
                """);
    }

}
