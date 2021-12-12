package test;

import plantas.FabricaPlantas;
import plantas.Plantas;
import tablero.ExcepcionAgregarPlanta;
import tablero.Tablero;

public class TESTFACU {
	
	public static void main(String[] args) {
		
		Tablero ta = new Tablero();
		
		Plantas p1 = FabricaPlantas.construir("PlantaNormal");
		Plantas p2 = FabricaPlantas.construir("PlantaCarnivora");
		
		try {
			
			ta.agregarUnidad(p1, 1, 1);
			ta.agregarUnidad(p2, 1, 1);
		} catch (ExcepcionAgregarPlanta e) {
			e.printStackTrace(System.out);
		}
	
		
	}
		
}


