package plantas;

import java.util.Random;

import unidades.Unidades;

public abstract class  Plantas extends Unidades {
	
	
	

	public Plantas(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super(nombre, salud, ataque, defensa);
		this.costeTrebol =  costeTrebol;
		
	}
	
	
    
	
	public void atacar(Unidades unidad) {
		
		//Ataque mínimo: 0, Maximo: según nivel de ataque
		 unidad.setSalud(unidad.getSalud() - (int) (Math.random()*this.ataque + 0));
	}
	
		
	public abstract void mover();
		
	}
	
	
		


