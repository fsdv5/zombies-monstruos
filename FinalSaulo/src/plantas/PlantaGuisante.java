package plantas;

public class PlantaGuisante extends Plantas{
	
	public PlantaGuisante(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super("PlantaGuisante", 35, 4, 3, 8);
		
	}
	
	public String localizador() {
        return "PGU(" + super.getSalud()+")";
    }

	@Override
	public void mover() {} // no se mueve
	
	
	

}
