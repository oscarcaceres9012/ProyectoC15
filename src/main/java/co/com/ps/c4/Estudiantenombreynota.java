package co.com.ps.c4;
import java.util.Random;
import java.util.Scanner;

public class Estudiantenombreynota {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        System.out.println("Por favor ingrese la nota del estudiante");
       // Scanner scanners;
        int nota = scanners.nextInt();
        if (nota > 3) {
            System.out.println("El estudiante gano la materia");
        } else if (nota < 3) {
            System.out.println("El estudiante perdió la materia");
        }
       /*
         Object elsef;
        elsef{
          System.out.println("Nota Nó Valida");}
        */
    }

}
