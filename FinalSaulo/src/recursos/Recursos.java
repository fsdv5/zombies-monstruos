package recursos;

public class Recursos {
	
	private int trebol = 10;
	private int agua = 2;
	
	
	public Recursos() {

	}
	
	public Recursos(int trebol, int agua) {
		super();
		this.trebol = trebol;
		this.agua = agua;
		
	}


	public int getTrebol() {
		return trebol;
	}


	public void setTrebol(int trebol) {
		this.trebol = trebol;
	}


	public int getAgua() {
		return agua;
	}


	public void setAgua(int agua) {
		this.agua = agua;
	}


	@Override
	public String toString() {
		return "Recursos [trebol=" + trebol + ", agua=" + agua + "]";
	}
	
	

}
