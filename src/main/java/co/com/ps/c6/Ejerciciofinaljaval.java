package co.com.ps.c6;
import java.util.Scanner;

public class Ejerciciofinaljaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador;
        do {
            System.out.println(" * Bienvenido *");
            System.out.println();
            System.out.println(" * Escriba la opción que desea *");
            System.out.println("1:Termica (Celcius a Fahrenheit)");
            System.out.println("2:Distancia (Metros a Pies)");
            System.out.println("3:Salir");
            contador = scanner.nextInt();
            switch (contador) {
                case 1:
                    System.out.println(" * Celcius a Fahrenheit *");
                    System.out.println(" * Ingrese los grados Celcius *");
                    int gradosC = scanner.nextInt();
                    convertir(gradosC);
                    break;
                case 2:
                    System.out.println("Metros a Pies");
                    System.out.println("Ingrese la distancia en metros");
                    double metro = scanner.nextDouble();
                    double convertir = metro * 3.28084;
                    System.out.println(convertir + "pies");
                    break;
            }
        } while (contador != 3);
    }

    //public class ConversorUnidades {
    public static void convertir(int gradosc) {
        int fharenheit = ((gradosc * 9) / 5 + (32));
        System.out.println("Los grados Fahrenheit son : " + fharenheit);
    }
}
