package plantas;

public class PlantaGuisante extends Plantas{
	
	public PlantaGuisante(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super("Planta Guisante", 35, 4, 3, 8);
	
		
	}
	
	public String localizador() {
        return "PGU(" + super.getSalud()+")";
    }

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}


	
	
	

}
