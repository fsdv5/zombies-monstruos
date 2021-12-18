package plantas;

public class PlantaNormal extends Plantas {
	
	
	
	
	public PlantaNormal(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super(nombre, salud, costeTrebol, ataque, defensa);
		this.nombre = "PlantaNormal";
		this.salud = 30;
		this.costeTrebol = 3;
		this.ataque = 10;
		this.defensa = 5;
		
	}


	public String localizador() {
        return "PN(" + super.getSalud()+")";
    }


}
