package monstruos;

public class MonstruoDistancia extends Monstruos {

	public MonstruoDistancia(String nombre, int salud, int ataque, int defensa) {
		super("Monstruo AD", 40, 10, 10);

	}
	

    public String localizador() {
        return "MD(" + super.getSalud()+")";
    }
	
   
		
	

}
