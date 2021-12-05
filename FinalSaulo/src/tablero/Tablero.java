package tablero;

import monstruos.Monstruos;
import plantas.Plantas;
import unidades.Unidades;

public class Tablero {
	
	private Unidades[][] TableroJuego = new Unidades[11][11];
	
	
	
			
	
	
	public void agregarUnidad(Unidades unidad, int posicionX, int posicionY) {
		
		if(unidad instanceof Monstruos && posicionX<8) {			
			System.out.println("No puede agregar un monstruo en esa posicion");
			
		} else if (unidad instanceof Plantas && posicionX>3 ) {
			System.out.println("No puede agregar una planta en esa posicion");
			
		} else {
			
			if(TableroJuego[posicionX][posicionY] == null) {
			
			if(unidad instanceof Plantas) {
				TableroJuego[posicionX][posicionY] = unidad;
		System.out.println("Planta agregada correctamente");
		
		} else if(unidad instanceof Monstruos) {
			TableroJuego[posicionX][posicionY] = unidad;
				System.out.println("Monstruo agregado correctamente");
				
												}
			} else {
		
			System.out.println("Posicion ocupada. Por favor seleccione otra");
		}
			}
																			 }
	// metodo para verificar que hay en esa posicion
	public void retornarOcupados(int x, int y) { 
				
		
			if(TableroJuego[x][y]!=null) {
			System.out.println("La posicion está ocupada por: " + TableroJuego[x][y].getNombre());
			} else {
				System.out.println("La posicion consultada está libre");
			}
		
		
			
	}
	
	//metodo para avanzar monstruos
	
	public void avanzarMonstruos() {
		
					
		
		
	}

}
