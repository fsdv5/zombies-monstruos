package monstruos;

public class MonstruoCuerpo extends Monstruos{

	public MonstruoCuerpo(String nombre, int salud, int ataque, int defensa, int contador) {
		super("Monstruo CaC", 100, 15, 10,0);
		super.setVelocidad(2);
		// TODO Auto-generated constructor stub
	}

	

    public String localizador() {
        return "MC(" + super.getSalud()+")";
    }
    
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

}
