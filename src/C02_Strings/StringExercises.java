package C02_Strings;

public class StringExercises {
    public static void main(String[] args) {
    //1 Concatena dos cadenas de texto.
    var name = "SEBASTIAN";
    var apellidos= "Barrueto Nolasco";
    System.out.println(name + " " + apellidos);
    //2 Muestra la longitud de una cadena de texto.
    var nombreC = name + " " + apellidos;
    System.out.println(nombreC.length());
    // 3. Muestra el primer y último carácter de un string.
    System.out.println(nombreC.charAt(0)+" " +nombreC.charAt(25));
    System.out.println(name.toLowerCase());
    System.out.println(nombreC.toUpperCase());
    System.out.println(nombreC.equals("SEBASTIAN"));
    System.out.println(nombreC.contains("SEBASTIAN"));
    var age = 23;
    System.out.println(String.format("Hola, %s.Tengo %d años", name ,age));
    var esp = "   sebastian   ";
    System.out.println(esp.trim());
    System.out.println(esp.replace(" ","-"));
    System.out.println(esp.equals("sebastian"));
    System.out.println(esp.length() == name.length());
    }
}
