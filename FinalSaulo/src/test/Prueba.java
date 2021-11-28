package test;


import plantas.FabricaPlantas;
import plantas.Plantas;
import tablero.TableroJuego;

public class Prueba {

	
	public static void main(String[] args) {
		
		TableroJuego t = TableroJuego.getTablero();
		
		t.dibujarTablero();
		
		
		
		
		Plantas p = FabricaPlantas.construir("PlantaCarnivora");
		Plantas p2 = FabricaPlantas.construir("PlantaCarnivora");
		
		System.out.println(p2.getSalud());
		
		p.atacar(p2);
		
		System.out.println(p2.getSalud());
	}
	
}
