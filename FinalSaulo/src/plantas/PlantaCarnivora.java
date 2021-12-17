package plantas;

import unidades.Unidades;

public class PlantaCarnivora extends Plantas {
	

	public PlantaCarnivora(String nombre, int salud, int costeTrebol, int ataque, int defensa,int contador) {
		super("PlantaCarnivora", 50, 6, ataque, 9,0);
		super.setAtaquexsegundo(4);
		
	}

	public String localizador() {
        return "PC(" + super.getSalud()+")";
    }
	
	//Contador turnos
	

	
	@Override
	public void mover() {} // no se mueve
	
	

}



