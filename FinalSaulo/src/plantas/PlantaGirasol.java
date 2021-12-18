package plantas;

import tablero.Tablero;

public class PlantaGirasol extends Plantas{
	

	public PlantaGirasol(String nombre, int salud, int costeTrebol, int ataque, int defensa,int contador) {
		super("PlantaGirasol", 30, 3, 2, 5,0);
		super.setAtaquexsegundo(2);
		
	}
	
	 public int generadorSoles(int soles){    
		 return soles += 1;
		 }
		
	
	
	public String localizador() {
        return "PGI(" + super.getSalud()+")";
    }

<<<<<<< HEAD

	
=======
	@Override
	public void mover() {} // no se mueve


>>>>>>> branch 'NuevasPruebas' of https://gitlab.com/sadfacundo/finalsaulo.git
	
	
	


}
