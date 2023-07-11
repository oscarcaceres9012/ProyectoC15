package co.com.ps.c6;
packege java*;
import java.util.Scanner;
public class Metrosapiesdistancia {
    public class ConversorUnidades {
        public static void convertir (int gradosc) {
            int fharenheit = ((gradosc * 9) / 5 + (32));
            System.out.println("Los grados Fahrenheit son : " + fharenheit);
        }
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 0;

            char (op);
            do {
                System.out.println(" ** Bienvenido **");
                System.out.println();
                System.out.println(" ** Escriba la opción que desea **");
                System.out.println(" * Termica (Celcius a Fahrenheit) *");
                System.out.println(" * Distancia (Metros a Pies)*");
                op = scanner.nextLine();
                switch (op) {
                    case "Termica":
                        System.out.println(" ** Celcius a Fahrenheit **");
                        System.out.println(" * Ingrese los grados Celcius *");
                        int gradosC = scanner.nextInt();
                        convertir(gradosC);
                        break;
                    case "Distancia":
                        System.out.println(source:"Metros a Pies");
                        double metro = source.nextDouble();
                        double convertir = metro * 3.28084;
                        System.out.println(convertir + "pies");
                        break;
                }
                } while (op == "Salir");
            }
        }
