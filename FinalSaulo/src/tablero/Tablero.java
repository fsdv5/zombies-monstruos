package tablero;

import monstruos.Monstruos;
import plantas.Plantas;
import unidades.Unidades;

public class Tablero {
	
	private Unidades[][] TableroJuego = new Unidades[11][11];
	
	
	
		
	
	   public void pintarTablero(){
	        
	        String lineaFinal = "";
	        for (int i=0; i < 2; i++) {
	            String lineaArriba = "|";
	            for (int j=0; j < TableroJuego[i].length; j++) {
	                if(j == TableroJuego[i].length-1)lineaArriba+=("-------|");
	                else lineaArriba+=("--------");
	            }
	            lineaFinal= lineaArriba;
	            System.out.println(lineaArriba);
	            
	            String lineaAbajo = "|";
	            for (int j=0; j < TableroJuego[i].length; j++) {
	                if (TableroJuego[i][j]==null){
	                    lineaAbajo+=("       ");
	                    lineaAbajo+=("|");
	                }
	                else{
	                    lineaAbajo += TableroJuego[i][j].localizador() +"  ";
	                    lineaAbajo+=("|");
	                }
	            }
	            
	            System.out.println(lineaAbajo);
	        }
	        System.out.println(lineaFinal);
	    }
	
	
	public void agregarUnidad(Unidades unidad, int ancho, int alto) {
		
		if(unidad instanceof Monstruos && alto<6) {			
			System.out.println("No puede agregar un monstruo en esa posicion");
			
		} else if (unidad instanceof Plantas  && alto>3 ) {
			System.out.println("No puede agregar una planta en esa posicion");
			
		} else {
			
			if(TableroJuego[ancho][alto] == null) {
			
			if(unidad instanceof Plantas) {
				TableroJuego[ancho][alto]= unidad;
		System.out.println("Planta agregada correctamente");
		
		} else if(unidad instanceof Monstruos) {
			
			TableroJuego[ancho][alto] = unidad;
			
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
			System.out.println("La posicion est ocupada por: " + TableroJuego[x][y].getNombre());
			} else {
				System.out.println("La posicion consultada est libre");
			}
		
		
			

			
	}
	
	//metodo para avanzar monstruos
	
	public void avanzarMonstruos() {
		
					
		
		
	}

}
