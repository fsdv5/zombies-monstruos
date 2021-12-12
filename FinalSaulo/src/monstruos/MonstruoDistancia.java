package monstruos;

public class MonstruoDistancia extends Monstruos {

	public MonstruoDistancia(String nombre, int salud, int ataque, int defensa) {
		super("Monstruo AD", 50, 10, 10);
		// TODO Auto-generated constructor stub
	}
	

    public String localizador() {
        return "MD(" + super.getSalud()+")";
    }
	
   
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

}
