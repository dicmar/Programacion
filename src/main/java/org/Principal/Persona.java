package org.Principal;

public class Persona  implements  EnviarDeMensaje{

    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Yendo casa por casa a tocar el tiembre para decir" + mensaje);
    }

}
