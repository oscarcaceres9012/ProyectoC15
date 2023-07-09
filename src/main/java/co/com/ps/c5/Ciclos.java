package co.com.ps.c5;

public class Ciclos {
    public static void main(String[] args) { args: []
        int[] numeros={1,2,3,4,5); numeros: [1, 2, 3, 4, 5]

        for (int i=0 ; i<numeros.length;i++){
            System.out.println(numeros[i]); numeros: [1, 2, 3, 4, 5]
        }

        int contador = 0; contador: 5
        while (contador < 5) {
            System.out.println("El contador es: " + contador);
            contador++;
        }

        contador=0;
        do {
            System.out.println("El contador es: " + contador);
            contador++;
        }  while (contador < 5); contador: 5

    }
    }
