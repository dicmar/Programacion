package org.Principal;

import java.util.ArrayList;

public class PartidoDelBuenCodigo {

    //Declaracion de variables de instancia

    private ArrayList<EnviarDeMensaje> mensajeros;

    //Metodo constructor parametrizado
    public PartidoDelBuenCodigo(){ // Lista de parametros por defector

        // lista de campos
        this.mensajeros = new ArrayList<>();
    }

    // Comportamientos de los metodos

    public void agregarMensaje(EnviarDeMensaje mensajero){
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania(){
        for (EnviarDeMensaje mensajero : mensajeros){
            mensajero.enviarMensaje("Vote por el paritdo del buen codigo");
        }
    }

}
