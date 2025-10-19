package ClaseUlima;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 4, 5, 6,},
                {2, 5, 6, 7,},


        };
        int suma = 0;
        for (int i = 0; i<matriz.length; i++){
            for( int j = 0 ; j<matriz[i].length;j++){
                suma += matriz[i][j];


            }
        }
        System.out.println("Suma total: " + suma);
        int producto = 1;
        for(int i =0; i<matriz.length;i++){
            for(int j = 0 ; j<matriz[i].length; j++){
                producto = producto * matriz[i][j];
            }
        }
        System.out.println("producto total: " + producto);



        int pares = 0, impares = 0;
        for(int i =0; i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares += 1;
                } else {
                    impares += 1;
                }
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);


        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for(int i =0; i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > mayor) mayor = matriz[i][j];
                if(matriz[i][j] < mayor) mayor = matriz[i][j];

            }
        }
        System.out.println("Mayor: " + mayor + "  Menor: " + menor);

        for(int i =0; i<matriz.length;i++) {
            int sumaFila=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila+= matriz[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }

        for(int j =0; j<matriz[0].length;j++) {
            int sumaColum = 0;
            for (int i = 0; i < matriz.length; i++) {

                sumaColum+= matriz[i][j];
            }
            System.out.println("Suma columnas " + j + ": " + sumaColum );
        }








        for (int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();

        }


        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for(int i = 0 ; i < matriz.length ; i++){
            for( int j = 0 ; j < matriz[i].length ; j++){
                transpuesta[j][i] = matriz[i][j];

            }
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
