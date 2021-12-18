package plantas;

public class PlantaGirasol extends Plantas{
	

	public PlantaGirasol(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super("PlantaGirasol", 30, 3, 2, 5);
		
	}
	
	public String localizador() {
        return "PGI(" + super.getSalud()+")";
    }


	
	
	
	


}
