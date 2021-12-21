package Climas;

import plantas.FabricaPlantas;
import plantas.Plantas;
import unidades.Unidades;
import recursos.Recursos;



public class Lluvioso {





    public void AgregarAguayPoder(Unidades unidad) {

        System.out.println("Jugaras con un clima lluvioso! Preparate! Tendras dos unidades más de agua");



        if (unidad instanceof Plantas) {

        unidad.setSalud(unidad.getSalud() - ((int) (Math.random()*unidad.getAtaque() + 0) * 2 / 100));


        }

        }
    }