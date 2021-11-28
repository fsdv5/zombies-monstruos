package plantas;

import unidades.Unidades;

public abstract class  Plantas extends Unidades {
	
	
	

	public Plantas(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super(nombre, salud, ataque, defensa);
		this.costeTrebol =  costeTrebol;
		
	}
	
		
	public abstract void mover();
		
	}
	
	
		


