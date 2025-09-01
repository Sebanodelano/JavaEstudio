package ClaseUlima;

import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
    }
    public static void Ejercicio1(){
        //Determinar el mayor de N numeros
        Scanner scn = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a evaluar: ");
        int n = scn.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <n; i++){
            System.out.println("Ingresa un numero: ");
            int x = scn.nextInt();
            if(x > max){
                max = x;
            }
        }
        System.out.println("El numero mayor es "+ max);
    }

    public static void Ejercicio2(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese un lado: ");
        int a = scr.nextInt();

        System.out.println("Ingrese el otro lado: ");
        int b = scr.nextInt();
        double d = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(d);
        System.out.println("La hipotenusa es: " + c);



    }

}
