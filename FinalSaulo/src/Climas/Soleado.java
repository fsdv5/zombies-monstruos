package Climas;

import plantas.Plantas;
import unidades.Unidades;
import recursos.Recursos;

public class Soleado {


    public void BajarDefensa(Unidades unidad){


        System.out.println("Jugaras con un clima soleado! Preparate! Disminuira la defensa de tus plantas");

        if (unidad instanceof Plantas) {

        unidad.setDefensa(unidad.getDefensa() - 2);



    }

    }


}