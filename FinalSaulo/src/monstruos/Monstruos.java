package monstruos;

import unidades.Unidades;

public abstract class Monstruos extends Unidades {
	
	/** Atributo que fija los avances del monstruo por cada turno de partida*/
	protected int velocidad;
	protected int ataquexsegundoZ;
	
	public Monstruos(String nombre, int salud, int ataque, int defensa,int contador) {
		super(nombre, salud, ataque, defensa,contador);
		
	}
	
	public void atacar(Unidades unidad) {
		unidad.setSalud(unidad.getSalud() - this.ataque);
	}

	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAtaquexsegundoZ() {
		return ataquexsegundoZ;
	}

	public void setAtaquexsegundoZ(int ataquexsegundoZ) {
		this.ataquexsegundoZ = ataquexsegundoZ;
	}
	

}
	
	

	
	


