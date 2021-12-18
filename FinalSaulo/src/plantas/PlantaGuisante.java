package plantas;

public class PlantaGuisante extends Plantas{
	
	public PlantaGuisante(String nombre, int salud, int costeTrebol, int ataque, int defensa,int contador) {
		super("PlantaGuisante", 35, 4, 3, 8,0);
		super.setAtaquexsegundo(1);
		
	}
	
	public String localizador() {
        return "PGU(" + super.getSalud()+")";
    }

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}


	
	
	

}
