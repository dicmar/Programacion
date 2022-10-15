package org.Principal;

public class Main {
    public static void main(String[] args) {

        PartidoDelBuenCodigo partidoDelBuenCodigo = new PartidoDelBuenCodigo();

        partidoDelBuenCodigo.agregarMensaje(new PalomaMensajera());
        partidoDelBuenCodigo.agregarMensaje(new TelefonoMovil());
        partidoDelBuenCodigo.agregarMensaje(new PalomaMensajera());
        partidoDelBuenCodigo.agregarMensaje(new TelefonoMovil());
        partidoDelBuenCodigo.agregarMensaje(new Persona());
        partidoDelBuenCodigo.agregarMensaje(new PalomaMensajera());

        partidoDelBuenCodigo.hacerCampania();


    }
}