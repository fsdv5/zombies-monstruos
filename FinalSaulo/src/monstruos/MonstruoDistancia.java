package monstruos;

public class MonstruoDistancia extends Monstruos {

	public MonstruoDistancia(String nombre, int salud, int ataque, int defensa,int contador) {
		super("Monstruo AD", 50, 10, 10,0);
		super.setVelocidad(2);
		super.setAtaquexsegundoZ(1);
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
