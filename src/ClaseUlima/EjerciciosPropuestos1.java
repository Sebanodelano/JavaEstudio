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

    /*8. Escriba un programa que muestre la siguiente tabla (tome en cuenta que 1
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

    /*9. En un Centro Educativo Inicial se tienen n alumnos de 5 años. Para cada alumno se toma
    los siguientes datos: Sexo (M, F), talla y peso.
    Escribir un programa que determine:
    ● El Promedio de tallas de niñas
    ● El promedio de tallas de niños.
    ● El promedio de pesos de niñas.
    ● El promedio de pesos de niños*/
        System.out.println("Ingrese la cantidad de niños: ");
        int x = scn.nextInt();
        double sumaTallasF = 0;
        double sumaTallasM = 0;
        double sumaPesosF = 0;
        double sumaPesosM = 0;

        // Contadores
        int contadorNiñas = 0;
        int contadorNiños = 0;

        // Leer datos de cada alumno
        for (int i = 0; i <= n; i++) {
            System.out.println("Ingrese sexo (M/F), talla y peso del alumno " + (i+1) + ":");
            String sexo = scn.next();
            double talla = scn.nextDouble();
            double peso = scn.nextDouble();

            if (sexo.equalsIgnoreCase("F")) {
                sumaTallasF += talla;
                sumaPesosF += peso;
                contadorNiñas++;
            } else if (sexo.equalsIgnoreCase("M")) {
                sumaTallasM += talla;
                sumaPesosM += peso;
                contadorNiños++;
            } else {
                System.out.println("Sexo no válido, use M o F");
            }
        }

        // Calcular promedios
        double promedioTallasNiñas = (contadorNiñas > 0) ? sumaTallasF / contadorNiñas : 0;
        double promedioTallasNiños = (contadorNiños > 0) ? sumaTallasM / contadorNiños : 0;
        double promedioPesosNiñas = (contadorNiñas > 0) ? sumaPesosF / contadorNiñas : 0;
        double promedioPesosNiños = (contadorNiños > 0) ? sumaPesosM / contadorNiños : 0;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Promedio de tallas de niñas: " + promedioTallasNiñas);
        System.out.println("Promedio de tallas de niños: " + promedioTallasNiños);
        System.out.println("Promedio de pesos de niñas: " + promedioPesosNiñas);
        System.out.println("Promedio de pesos de niños: " + promedioPesosNiños);


    /*10. Implementar una función que permita validar un valor entero, leído desde el teclado,
    comprendido entre dos límites que introduciremos como parámetro. (Ejm: Dia entre 1..31,
    Mes entre 1..12)*/

    System.out.println("Escriba un rango de los numeros(minimo y maximo): ");
    int primerdato = scn.nextInt();
    int segudnodato = scn.nextInt();
    int medio;
        while(true) {
            System.out.println("Valor no invalido intentelo de nuevo");
            medio = scn.nextInt();
            if (medio < primerdato || medio >= segudnodato) {
                System.out.println("Valor inválido, intente de nuevo.");

            } else {
                System.out.println("Valor aceptado: " + medio);
                break;
            }
        }

    /*11. Escriba un programa en Java que permita al usuario ingresar cualquier número de
    valores de punto flotante de doble precisión no negativos. El usuario finaliza la lista de
    entrada con cualquier valor negativo. Luego, el programa imprime la suma, el promedio
    (media aritmética), el máximo y el mínimo de los valores ingresados. El valor negativo final
    no se utiliza en los cálculos. Si el primer número que proporciona el usuario es negativo, el
    programa simplemente imprime el texto NO SE PROPORCIONAN NÚMEROS.*/
        Float num = 0.0F;
        Float acu = 0.0F;
        Integer cant = 0;
        Float maxx = 0.0F;
        Float minx = 0.0F;

        while (true) {
            System.out.println("Ingresa un numero decimal: ");
            num = scn.nextFloat();

            if (num < 0.0F) {
                break;
            }
            if (num > maxx || cant == 0) {
                maxx = num;
            }
            if (num < minx || cant == 0) {
                minx = num;
            }
            acu+=num;
            cant++;
        }
        System.out.println("La media es " + acu/cant);
        System.out.println("La cantidad de numeros es " + cant);
        System.out.println("El numero mayor es " + maxx);
        System.out.println("El numero menor es " + minx);
    /*12. Escribir una función Salario que calcule el salario de un trabajador para un número dado
    de horas trabajadas y un salario por hora. Las horas que superen las 40 horas semanales
    se pagarán como extras con un salario por hora de 1.5 veces el salario ordinario*/

    }
}
