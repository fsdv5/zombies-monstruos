package unidades;

public abstract class Unidades implements IUnidades {

	protected String nombre;
	protected int salud;
	protected int costeTrebol;
	protected int ataque;
	protected int posX;
	protected int posY;
	protected int defensa;
	
	
	

	
	
	public Unidades(String nombre, int salud, int ataque, int defensa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	

	public abstract String localizador();
	

	public abstract void mover();
	
	@Override
	public void atacar(Unidades unidad) {
		unidad.setSalud(unidad.getSalud() - this.ataque);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getCosteTrebol() {
		return costeTrebol;
	}

	public void setCosteTrebol(int costeTrebol) {
		this.costeTrebol = costeTrebol;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}



}
