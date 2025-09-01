package C03_Conditionals;

public class EjerciciosConditionals {
    public static void main(String[] args){
// 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 19;
        if (age >18){
            System.out.println("El usuario puede votar");
        } else if (age ==18){
            System.out.println("El usario tiene la edad de 18 y puede votar");
        }else{
            System.out.println("no puede votar");
        }

// 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var a = 1244;
        var b = 1234;
        if(a>b){
            System.out.println("El numero mayor es a=1244");
        } else if (a == b){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("El numero b es mayor = 1234");
        }
// 3. Dado un número, verifica si es positivo, negativo o cero.

        var x = -233;
        if(x>0){
            System.out.println("El numero es positivo");
        } else if (x ==0){
            System.out.println("El numero es 0");
        }else{
            System.out.println("El numero es negativo");
        }
// 4. Crea un programa que diga si un número es par o impar.

        var y = 23;
        if (y % 2 == 0){
            System.out.println("El numero es par");
        } else if ((y+1)%2 == 0){ // tambien sirve if (y % 2 != 0)
            System.out.println("El numero es impar");
        }else{
            System.out.println("El numero es primo");
        }
// 5. Verifica si un número está en el rango de 1 a 100.
        var n = 101;
        if (n>=1 && n <=100){
            System.out.println("El numero esta en el rango de 1 a 100");
        }else{
            System.out.println("El numero no esta en el rango establecido");
        }
// 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        var day = 5;
        switch (day){
            case 1:
                System.out.println("El dia es lunes");
                break;
            case 2:
                System.out.println("El dia es martes");
                break;
            case 3:
                System.out.println("El dia es miercoles");
                break;
            case 4:
                System.out.println("El dia es jueves");
                break;
            case 5:
                System.out.println("El dia es viernes");
                break;
            case 6:
                System.out.println("El dia es sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");
                break;

        }
// 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100)
        var nota = 51;
        if(nota >= 85){
            System.out.println("sobresaliente");
        } else if (nota >= 50 && nota <=84){
            System.out.println("aprobado");
        }else{
            System.out.println("Suspendido");
        }


// 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var age2 = 17;
        boolean acompañado = true;
        if(age2 >= 15 || acompañado ) {
            System.out.println("puedes entrar al cine");
        }else{
            System.out.println("Debes ir acompañado");
        }

// 9. Crea un programa que diga si una letra es vocal o consonante.

        var letra = "u";
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("es una vocal");
        }else{
            System.out.println("Es una consonante");
        }
// 10. Usa tres variables o, p, q y muestra cuál es el mayor de las tres.
        var o = 10;
        var p = 12;
        var q = 14;
        if (o > p && o > q){
            System.out.println(("El numero mayor es" + " " + o));
        } else if (p >o && p>q){
            System.out.println("El numero mayor es"+ " "+ p );
        } else if (q > p && q>o){
            System.out.println("El numero mayor es" + " " + q);
        }else{
            System.out.println("hay dos numeros iguales");
        }
    }
}
