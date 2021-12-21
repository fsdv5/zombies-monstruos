package Climas;
import monstruos.*;
import tablero.*;

public class Nublado {

    Monstruos m1 = FabricaMonstruos.construir("MonstruoDistancia");
    Monstruos m2 = FabricaMonstruos.construir("MonstruoCuerpo");

    Tablero ta = new Tablero();

    public void DosMxTurno(){

        System.out.println("Jugaras con un clima nublado! Preparate! Caeran dos monstruos por turno");



    }
}