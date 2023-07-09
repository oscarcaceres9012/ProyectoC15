package co.com.ps.c6;
packege java*;
public class Metrosapiesdistancia {
    import java.util.Scanner;
    public class ConversorUnidades {
        public static void convertir (int gradosc) {
            int fharenheit = ((gradosc * 9) / 5 + (32));
            System.out.println("Los grados Fahrenheit son : " + fharenheit);
        }
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 0;

            String opcion;
            do {
                System.out.println(" ** Bienvenido **");
                System.out.println();
                System.out.println(" ** Escriba la opción que desea **");
                System.out.println(" * Termica (Celcius a Fahrenheit) *");
                System.out.println(" * Distancia (Metros a Pies)*");
                opcion = scanner.nextLine();
                switch (opcion) {
                    case "Termica":
                        System.out.println(" ** Celcius a Fahrenheit **");
                        System.out.println(" * Ingrese los grados Celcius *");
                        int gradosC = scanner.nextInt();
                        convertir(gradosC);
                        break;
                    case "Distancia":
                        System.out.println(" ** Metros a Pies **");
                        System.out.println(" * Ingrese los metros *");
                }
                while (opcion == "Salir");
            }
        }
