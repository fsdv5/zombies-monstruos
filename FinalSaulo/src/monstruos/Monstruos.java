package monstruos;

import unidades.Unidades;

public abstract class Monstruos extends Unidades {
	

	public Monstruos(String nombre, int salud, int ataque, int defensa) {
		super(nombre, salud, ataque, defensa);
		
	}
	
	public void atacar(Unidades unidad) {
		unidad.setSalud(unidad.getSalud() - this.ataque);
	}


	

}
	
	

	
	


