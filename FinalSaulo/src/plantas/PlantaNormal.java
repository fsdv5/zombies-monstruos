package plantas;

public class PlantaNormal extends Plantas {
	
	
	
	
	public PlantaNormal(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super("PlantaNormal", 30, 3, 10, 5);
		
	}


	public String localizador() {
        return "PN(" + super.getSalud()+")";
    }


	@Override
	public void mover() {} // no se mueve
	
	

}
