package monstruos;

import unidades.Unidades;

public abstract class Monstruos extends Unidades {
	
	

	public Monstruos(String nombre, int salud, int ataque, int defensa) {
		super(nombre, salud, ataque, defensa);
		
	}

	@Override
	public abstract void mover();
		
	}
	
	


