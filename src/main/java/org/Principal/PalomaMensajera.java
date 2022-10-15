package org.Principal;

import javax.lang.model.element.ElementVisitor;

public class PalomaMensajera  extends  Ave implements EnviarDeMensaje {

    public void volarRapido(){
        System.out.println("Volando...");
    }

    @Override
    public void enviarMensaje(String mensaje){
        volarRapido();
        System.out.println("Lanzando un papelito que dice : " + mensaje);
    }


}
