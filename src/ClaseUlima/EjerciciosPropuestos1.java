package ClaseUlima;

import java.net.SecureCacheResponse;
import java.util.HashSet;
import java.util.Scanner;

public class EjerciciosPropuestos1 {
    public static void main(String[] args) {
        /*Escribir un programa que lea por teclado un número en pies y lo convierta en metros y
        muestre el resultado. Un pie es de 0.305 metros */
        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba un numero a convertir en pies: ");
        double n = scn.nextDouble();


        var resultado = n * 0.305;
        System.out.println("El numero convertido a pies es " + resultado);

        /*2. Escribir un programa donde el usuario ingrese un subtotal y la tasa de gratuidad. Calcule
        la gratuidad, el total y lo muestre en pantalla. Por ejemplo, si el usuario ingresa S/. 10 cómo
        subtotal y 15% para la tasa de gratuidad, el programa debe mostrar S/. 1.5 cómo gratuidad
        y S/. 11.5 como total*/
        System.out.println("Ingrese un subtotal y la tasa(%) de gratituidad");
        double subtotal = scn.nextDouble();
        double tasa = scn.nextDouble();

        double gratituidad = subtotal * (tasa)/100;
        double total = gratituidad + subtotal;
        System.out.println("La gratituidad es de: " + gratituidad + "%" + " " + "El total es: " + total);

        /*3. De la geometría: Escriba un programa de computadora que, dadas las longitudes de los
        dos lados de un triángulo rectángulo adyacente al ángulo recto, calcule la longitud de la
        hipotenusa del triángulo*/
        System.out.println("Escriba los dos catetos para hallar la longitud de la hipotenusa: ");
        double cateto1 = scn.nextDouble();
        double cateto2 = scn.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

        /*4. Escriba un programa en Java que solicite un valor entero al usuario. Si el valor está
        entre 1 y 100, imprima “OK” de lo contrario, escriba "Fuera de rango"*/
        System.out.println("Por favor escriba un valor ENTERO entre el 1 y 100");
        double entero = scn.nextDouble();
        if((entero * 10)%10!=0){
            System.out.println("El numero no es entero");
        } else if (1<= entero  && entero<=100) {
            System.out.println("OK");
        }else{
            System.out.println("Fuera de rango");
        }

    /*5. Escriba un programa en Java que solicite al usuario cinco valores enteros. Luego imprime
    los valores máximo y mínimo ingresados. Si el usuario ingresa los valores 3, 2, 5, 0 y 1, el
    programa indicaría que 5 es el máximo y 0 el mínimo. Su programa debe manejar los lazos
    correctamente; por ejemplo, si el usuario ingresa 2, 4, 2, 3 y 3, el programa debe informar 2
    como mínimo y 4 como máximo.*/
        System.out.println("Ingrese 5 valores: ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<5;i++){
            int valor = scn.nextInt();
            if (valor > max){
                max = valor;
            }
            if (valor < min){
                min = valor;
            }



        }
        System.out.println("El maximo valor es: " + max + " " + "El minimo valor es: " + " " + min);
        /*int i = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    System.out.println("Ingrese 5 valores: ");
    while (i < 5) {
        int valor = scn.nextInt();

        if (valor > max) {
            max = valor;
        }
        if (valor < min) {
            min = valor;
        }
        i++;*/

    /*6. Escriba un programa en Java que solicite al usuario cinco valores enteros. Luego imprime
    una de dos cosas: si alguno de los valores ingresados está duplicado, imprime
    "DUPLICADO"; de lo contrario, imprime "TODO ÚNICO"*/
        System.out.println("Por favor ingrese 5 valores: ");
        HashSet<Integer> numeros =new HashSet<>();
        boolean duplicado = false;
        for (int i = 0; i<5;i++){
            int valor = scn.nextInt();
            if(numeros.contains(valor)){
                duplicado = true;
            }else{
                numeros.add(valor);
            }
        }
        if (duplicado){
            System.out.println("DUPLICADO");
        }else{
            System.out.println("TODO UNICO");
        }

    /*7. Un centro de salud ofrece los siguientes servicios: Medicina General con 30 cupos,
    pediatría con 25 de cupos y Traumatología con 10 cupos. La atención cuesta S/. 10.00, S/.
    15.00 y S/. 20.00 respectivamente para cada especialidad. Escribir un programa que
    determine el importe total por servicio para un día de atención, además que indique en qué
    servicios hubieron más pacientes que los cupos establecidos*/
        System.out.println("Coloque en orden cuandos servicios de Medicina general, Pediatria y Traumatologia hubo en el dia");
        int mg = scn.nextInt();
        int ped = scn.nextInt();
        int trau = scn.nextInt();

        int Rmg = mg * 10;
        int Rped = ped * 15;
        int Rtrau = trau * 20;

        System.out.println("El importe de medicina general es: " + Rmg);
        System.out.println("El importe pediatria  es: " + Rped);
        System.out.println("El importe de traumatologia general es: " + Rtrau);
        if(mg > 30) {
            System.out.println("Hubo un sobrecupo en Medicina general");
        }
        if(ped > 25){
            System.out.println("Hubo un sobrecupo en pediatria");
        }
        if (trau > 10){
            System.out.println("Hubo un sobrecupo en traumatologia");
        }

    /*. Escriba un programa que muestre la siguiente tabla (tome en cuenta que 1
    kilogramo es 2.2 libras):
    Kilogramos Libras
    1 2.2
    3 6.6
    ...
    197 433.4
    199 437.8*/
        System.out.println("Hasta que kilo desea la tabla");
        int limite = scn.nextInt();

        System.out.println("Kilogramos    Libras");
        for(int kg = 1; kg<=limite ; kg++){
            double libras = kg*2.2;
            System.out.printf("%-12d %.1f\n",kg ,libras);
        }



    }
}
