package plantas;

import unidades.Unidades;

public class PlantaCarnivora extends Plantas {
	

	public PlantaCarnivora(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super("PlantaCarnivora", 50, 6, ataque, 9);
		
	}

	
	
	//Contador turnos
	

	
	@Override
	public void mover() {} // no se mueve
	
	

}



