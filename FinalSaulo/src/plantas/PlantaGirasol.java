package plantas;

import tablero.Tablero;

public class PlantaGirasol extends Plantas{
	

	public PlantaGirasol(String nombre, int salud, int costeTrebol, int ataque, int defensa) {
		super("Planta Girasol", 30, 3, 2, 5);

		
	}
	
	 public int generadorSoles(int soles){    
		 return soles += 1;
		 }
		
	
	
	public String localizador() {
        return "PGI(" + super.getSalud()+")";
    }


	@Override
	public void mover() {} // no se mueve



	
	
	


}
