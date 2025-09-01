package C02_Strings;

public class Strings {
    public static void main(String[] arg) {

        String name = "Sebano";
        var username = "delano";
        System.out.println(name + username);
        System.out.println(name + " " + username);
        //longitud
        System.out.println(name.length());

        //optener caracter
        System.out.println(name.charAt(name.length()-1));

        //Obtener una subcadena o sea mas de 1 caracter

        System.out.println(name.substring(2));
        System.out.println(name.substring(3,5));

        //Mayusculas y minisculas

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si contiene algo

        System.out.println("hola,java.".contains("Brais"));
        System.out.println(name.contains("Sebano"));

        //Comparación
        System.out.println(name.equals("Sebano"));
        System.out.println(name.equalsIgnoreCase("SEBANO"));

        // == VS equals

        var a = "sebas";
        var b = "sebas";
        var c = new String("sebas");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //  Trim- no espacios
        System.out.println(" Hola, me llamo sebastian ".trim());
        //replace-reempkazar
        System.out.println(" Hola, me llamo sebastian ".replace(" ",""));
        System.out.println(" Hola, me llamo sebastian ".replace("Hola","PINGA").trim());

        //format
        var age = 23;
        System.out.println(String.format("Hola, %s. Tengo %d", name, age));

    }
}
