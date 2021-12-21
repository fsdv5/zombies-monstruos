package plantas;

import unidades.Unidades;

public class PlantaCarnivora extends Plantas {
	

	int contadorAtaques = 4;
	
	public PlantaCarnivora(String nombre, int salud, int costeTrebol, int ataque, int defensa,int contador) {
		super("PlantaCarnivora", 50, 6, 1000, 9,0);
		
		
	}
	
	
public void atacar(Unidades unidad) {
		if(contadorAtaques == 0) {
		
		 unidad.setSalud(unidad.getSalud() - this.ataque);
		 System.out.println("La planta Carnivora se comió un enemigo.");
		 contadorAtaques=4;
		}
		 contadorAtaques--;
	}

	public String localizador() {
        return "PC(" + super.getSalud()+")";
    }

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	
	//Contador turnos
	

	

	
	

}



