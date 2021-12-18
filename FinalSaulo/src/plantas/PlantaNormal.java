package plantas;

public class PlantaNormal extends Plantas {
	
	
	
	
<<<<<<< HEAD
	public PlantaNormal(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super(nombre, salud, costeTrebol, ataque, defensa);
		this.nombre = "PlantaNormal";
		this.salud = 30;
		this.costeTrebol = 3;
		this.ataque = 10;
		this.defensa = 5;
=======
	public PlantaNormal(String nombre, int salud, int costeTrebol, int ataque, int defensa, int contador) {
		super("PlantaNormal", 30, 3, 10, 5,0);
		super.setAtaquexsegundo(1);
>>>>>>> branch 'NuevasPruebas' of https://gitlab.com/sadfacundo/finalsaulo.git
		
	}


	public String localizador() {
        return "PN(" + super.getSalud()+")";
    }


}
