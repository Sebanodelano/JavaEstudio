package ClaseUlima;

import java.util.Random;

public class problema2Sucursal {
    private int [][] ventas;
    private int filas = 4;
    private int columnas = 6;

    public problema2Sucursal(){
        ventas = new int [filas][columnas];
        llenarMatriz();

    }
    private void llenarMatriz(){
        Random r = new Random();
        for (int i = 0 ; i<filas; i++){
            for(int j = 0 ; j < columnas ; j++){
                ventas[i][j] = r.nextInt(51) + 30;

            }
        }
    }
    public void mostrarMatriz(){
        System.out.println("ventas por sucursal y tipo de impresora : ");
        for(int i = 0 ; i < filas ; i++){
            for(int j = 0 ; j < columnas ; j++){
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public void totalSucursal(){
        System.out.println("El total de ventas por sucursal es: ");
        for(int i = 0 ; i < filas ; i++){
            int sumafila = 0;
            for(int j = 0 ; j < columnas ; j++){
                sumafila += ventas[i][j];
            }
            System.out.println("La suma de la sucursal " + (i+1) + " es de: " + sumafila);
        }

    }
    public void totalImpresora(){ //creo que es suma de columnas xd
        for(int j = 0 ; j < columnas ; j++){
            int sumaColumna = 0;
            for(int i = 0 ; i < filas ; i++){
                sumaColumna += ventas[i][j];

            }
            System.out.println("La suma por impresora " + (j+1) + " es de: " + sumaColumna);

        }

    }
}
