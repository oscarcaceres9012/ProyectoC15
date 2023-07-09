package co.com.ps.c3;

import java.io.*;

public class Archivo {
    public static void main(String[] args) {
        try {
             /* Escribir en un archivo
            FileWriter archivo = new FileWriter("datos.txt");
            archivo.write( "Hola, esto es un ejemplo.");
            archivo.close();

            // Leer desde un archivo
            FileReader archivoLectura = new FileReader( "datos.txt");
            BufferedReader lector= new BufferedReader(archivoLectura);
            //Strings s =

            /*String Linea;
            while ((linea = Lector.readLine()) != null) {
                System.out.println(linea);
            }

            Lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
