package monstruos;

public class MonstruoCuerpo extends Monstruos{

	public MonstruoCuerpo(String nombre, int salud, int ataque, int defensa) {
		super("Monstruo CaC", 100, 15, 10);
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
