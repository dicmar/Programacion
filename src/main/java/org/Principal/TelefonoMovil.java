package org.Principal;

public class TelefonoMovil extends Dispositivo implements  EnviarDeMensaje {

    public void llamar(){
        System.out.println("Llamando....");
    }

    @Override
    public void enviarMensaje(String mensaje){
        enceder();
        System.out.println("Conectando con la API de Wastapp para enciar un mensaje que dice : " + mensaje);
    }


}
