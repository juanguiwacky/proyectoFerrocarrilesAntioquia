package FerroCarrilesAntioquia;

import java.util.Scanner;

public class ValidadorDeTipo {

    //
    private static Scanner scanner = new Scanner(System.in);

    // Método para validar que el usuario ingrese un número entero correctamente
    public static int ValidarEnteros() {
        while (true) {
            try {
                // Intentamos leer el número entero
                String entrada = scanner.nextLine();
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                // Si el usuario escribe una letra o deja vacío, muestra este mensaje y vuelve a pedirlo
                System.out.print("ingresar un número entero válido. Inténtalo de nuevo: ");
            }
        }
    }

    // Método para validar cadenas de texto (Strings) asegurando que no queden vacías
    public static String ValidarString() {
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada != null && !entrada.trim().isEmpty()) {
                return entrada.trim();
            }
            System.out.print("El texto no puede estar vacío. Inténtalo de nuevo: ");
        }
    }

}