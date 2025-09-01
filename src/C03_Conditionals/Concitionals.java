package C03_Conditionals;

public class Concitionals {
    public static void main(String[] args){
        // Condicionales

        // "IF"
        var age = 18;
        System.out.println(age >=18);

        if (age > 18){
            System.out.println("El usuario es mayor de edad");

        } else if (age ==18) {
            System.out.println("El usuario acaba de cumplir 18");
        }else
            System.out.println("El usuario no es mayor de edad");


        // switch NO ES TRUE O FALSE
        var day = 4;
        switch (day){
            case 1:
               System.out.println("Lunes");
               break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");



        }
    }
}
