package ClaseUlima;

import java.util.Scanner;

public class Examen2Pregunta1 {
    private int [][] produccion;
    private int filas;
    private int columnas;


    public void crearMatriz(){


        Scanner scn = new Scanner(System.in);
        System.out.println("ingrese la cantidad de fábricas");
        filas = scn.nextInt();
        System.out.println("ingrese la cantidad de meses: ");
        columnas = scn.nextInt();

        produccion = new int[filas][columnas];

        for(int i = 0; i<filas ; i++){
            for (int j = 0; j<columnas;j++){
                System.out.println("Produccion de la fabrica " + (i+1) + " en el mes de " + (j+1));
                produccion[i][j] = scn.nextInt();
            }
        }






    }
    public void mostrarMatriz() {
        System.out.println("\n--- MATRIZ DE PRODUCCIÓN ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(produccion[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
