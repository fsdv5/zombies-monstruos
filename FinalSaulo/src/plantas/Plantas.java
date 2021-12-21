package plantas;
import java.util.Random;
import tablero.Tablero;
import unidades.Unidades;

public abstract class  Plantas extends Unidades {
	
	/** Atributo que controla el ataque por segundo de cada planta*/
	
	





	public Plantas(String nombre, int salud, int costeTrebol, int ataque, int defensa,int contador) {
		super(nombre, salud, ataque, defensa ,contador);
		this.costeTrebol =  costeTrebol;
		
	}
	
	
    
	
	public void atacar(Unidades unidad) {
		
		//Ataque mínimo: 0, Maximo: según nivel de ataque
		 unidad.setSalud(unidad.getSalud() - (int) (Math.random()*this.ataque + 0));
	}
	
	
	
		

	public abstract void mover();
		
	
}
	
	
	
		


