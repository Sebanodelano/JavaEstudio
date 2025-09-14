package ClaseUlima;

import java.util.Scanner;

public class EjerPropuestos2 {
    public static void main(String[] args) {
        /*1. Escriba un programa que lea por teclado 2 valores: la temperatura (Celsius o
    Fahrenheit) y un valor numérico. Si se ingresa la temperatura en Celsius, se deberá
    mostrar el equivalente en Fahrenheit. Si se ingresa la temperatura en Fahrenheit,
    como resultado se deberá mostrar el resultado en Celsius. Se deberá considerar
    casos en los que el usuario integre valores incorrectos en escala de temperatura.
    (2pts)
    i. Fórmula para transformar de F a C: (°F − 32) × 5/9 = °C
    ii. Fórmula para transformar de C a F: (°C × 9/5) + 32 = °F*/

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese (C/F) para reconocer el sistema y su valor: ");
        String grado = scn.next();
        double valor = scn.nextDouble();
        double cel = (valor - 32) * (5.0/9);
        double far = (valor * 9.0/5) + 32;
        if(grado.equalsIgnoreCase("C")){
            System.out.println("El resultado de " + valor + " °C en Fahrenheit es: " + far);
        } else if (grado.equalsIgnoreCase("F")) {
            System.out.println("El resultado de " + valor + " °F en Celsius es: " + cel);
        }else {
            System.out.println("EEscala de temperatura no válida. Use C o F.");
        }

    /*2. Escriba un programa que pueda recibir por teclado un usuario y una contraseña. Si
    el usuario o contraseña no coincide con los indicados en el código, se deberá
    mostrar un mensaje de error (“Usuario o Contraseña Incorrectos”) y se deberá pedir
    nuevamente el ingreso de los datos, hasta un máximo de 3 veces. Si ambos
    coinciden, se deberá mostrar un mensaje que diga “Acceso Correcto”. (2pts)*/
        System.out.println("El codigo es Ulima2024:");
        System.out.println("Escriba el usario: ");
        String usuario = scn.next();
        System.out.println("Escriba la contraseña: ");
        String contrasena = scn.next();
        boolean acceso = true;
        for(int i = 0; i <=3 ;i++){
            if(contrasena.equalsIgnoreCase("Ulima2024")){
                System.out.println("Acceso correcto");
                break;
            }else {
                System.out.println("Usuario o contraseña incorrecta por favor poner de nuevo (3)");
            }
        }

    /*3. Escriba un programa que imprima solo números enteros impares del 100 al 200. Imprima
    también el promedio de esos números (2pts)*/
        int sumaimp = 0;
        for(int i = 101; i<=200;i = i+2){
            System.out.println(i);
            sumaimp = sumaimp + i;
        }
        System.out.println(sumaimp);

    /*4. Escriba un programa que indique cuántos vasos de agua al día debería tomar una
    persona: Si tiene de 0 a 12 años, son 4. Si la persona tiene entre 13 y 35 años, deberá ser
    6. De 36 años a más, deberán ser 7. (2Pts)*/

                //es webeo esto xd


    /*En una universidad se cuenta con n profesores y se desea calcular el bono que le
    corresponde a cada profesor en base a su Categoría y su Tipo. Las categorías dan bonos
    en base a su sueldo: Ordinario 5% del sueldo, Asociado 7% del sueldo, Principal 10% del
    sueldo. Por los tipos Regular, Administrativo o Investigador se entregan bonos de 100,
    200 y 300 soles respectivamente. Escriba un programa que permita realizar el cálculo
    para n profesores, recibiendo los datos por teclado: Categoría, Tipo y sueldo base. Se
    debe imprimir el Sueldo Final (Sueldo Base + Bono por Categoría + Bono Tipo). (3pts)*/
        System.out.println("Escriba la cantidad de profesores: ");
        int profes = scn.nextInt();
        for (int i = 1; i <= profes; i++) {
            System.out.println("\nProfesor " + i);

            System.out.println("Ingrese el sueldo base: ");
            double sueldo = scn.nextDouble();
            // regular = 100; administrativo = 200 ; investigador = 300 R - D -I
            //  ordinario = 5% ; asociado = 7% y principal = 10% CATEGORIA = O - A - P
            System.out.println("ingrese su Categoría(O/A/P) y tipo(R/D/I) en orden: ");
            String categoria = scn.next();
            String tipo = scn.next();

            double total = sueldo;

            if (categoria.equalsIgnoreCase("O")) {
                total = sueldo + (sueldo * (5.0 / 100));
            } else if (categoria.equalsIgnoreCase("A")) {
                total = sueldo + (sueldo * (7.0 / 100));
            } else if (categoria.equalsIgnoreCase("P")) {
                total = sueldo + (sueldo * (10.0 / 100));
            }

            if (tipo.equalsIgnoreCase("R")) {
                total = total + 100;
            } else if (tipo.equalsIgnoreCase("D")) {
                total = total + 200;
            } else if (tipo.equalsIgnoreCase("I")) {
                total = total + 300;
            }
            System.out.println("El sueldo final del profesor " + i + " es: " + total);
        }

    }
}
