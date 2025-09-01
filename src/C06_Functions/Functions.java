package C06_Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args){
        sendEmailToUser("sebanodelano@gmail.com");

        //Funciones
        for (int index =0; index < 5; index++) {
            sendEmail();

        }

        //
        sendEmailToUser("sebanodelano@gmail.com" , "Sebas");
        sendEmail();
        sendEmailToUser(new ArrayList<>(Arrays.asList("Sebas" , "sebano" , "Sebastian")));
        var users = new ArrayList<>(Arrays.asList("Sebano" , "tian"));
        sendEmailToUser(users);

        var state = sendEmailWithState("Sebastian@gmail.com");
        System.out.println(state);
        sendEmailWithState("");
        System.out.println(sendEmailWithState(""));

    }
    // Sin parametros ni retorno
    public static void sendEmail(){
        System.out.println("Se envia el email");

    }
    //Funcion con Parámetros
    public static void sendEmailToUser(String email){
        System.out.println("Se envia el email a " + email);
    }
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envia el email a " + name + "(" + email + ")");
    }
    public static void sendEmailToUser(ArrayList<String> emails) {
        for(String email: emails) {
            sendEmailToUser(email);

        }
    }

    //Funcion con retorno
    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("Se envia el email a " + email);

        return true;



    }
}
