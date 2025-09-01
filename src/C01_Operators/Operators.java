package C01_Operators;

public class Operators {
    public static void main(String[] arg) {
    //asignación

        var a = 5;
        var b = 10;

        System.out.println(a * b);
        a = b;
        System.out.println(a);
        a = (b * 2) + 50*2;
        System.out.println(a);

        a += 1;
        System.out.println(a);

    //operadores de comparacion

        System.out.println(a==b);
        System.out.println(a==121);

        //operaciones logicos
        //y and
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);
        System.out.println(false&&true);

        System.out.println(2>3 || 5>10);
        System.out.println(5>3 && 1 >2);
    // " | | " se sa para OR ----- && dos para usar el Y O AND

    //negacion :´v NO O NOT
        System.out.println(!true);
        System.out.println(!(2>3 || 5>10));

    //Unarios

    }
}
