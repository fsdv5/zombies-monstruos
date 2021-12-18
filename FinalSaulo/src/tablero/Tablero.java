package tablero;

import monstruos.Monstruos;
import plantas.Plantas;
import unidades.Unidades;

public class Tablero {
	
	private Unidades[][] TableroJuego = new Unidades[11][11];
	
	
	
		
	
	   public void pintarTablero(){
	        
		   System.out.println("   " + "BASE");
	        String lineaFinal = "";
	       
	        for (int i=0; i < 8; i++) {
	        	 
	            String lineaArriba = " ";
	            
	            for (int j=0; j < TableroJuego[i].length; j++) {
	                if(j == TableroJuego[i].length)lineaArriba+=("--------");
	                
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
	        
	        System.out.println(" ");
	    }

	   
	public void agregarMonstruo(Monstruos monstruo, int y, int x) {
		
		TableroJuego[y][x] = monstruo;
	}
	

	public void agregarPlanta(Plantas planta, int y, int x) throws ExcepcionAgregarPlanta {
		
		if(TableroJuego[y][x] == null) {
			
			TableroJuego[y][x] = planta;
			System.out.println("Planta agregada correctamente. Posicion del tablero: " + y + ", " + x);
		} else {
			throw new ExcepcionAgregarPlanta("La posicion se encuentra ocupada. La proxima elegí bien");
	}
	}
	
			
		
				
		
			
	
	
	//Limpieza de unidades muertas
	
	public void limpiarMuertos() {
		
		for(int i=0; i<TableroJuego.length; i++) {
			for(int j=0; j<TableroJuego.length; j++) {
				
		if(TableroJuego[i][j]!=null) {
			
		
		if(TableroJuego[i][j].getSalud()<1) {
			
			System.out.println(TableroJuego[i][j].getNombre() + " ha muerto");
			TableroJuego[i][j] = null;
		}
			 
		} else {}
			}}
	}
		
																			 
	// metodo para verificar que hay en esa posicion
	
	public void retornarOcupados(int y, int x) { 
				
		
			if(TableroJuego[y][x]!=null) {
			System.out.println("La posicion est ocupada por: " + TableroJuego[y][x].getNombre());
			} else {
				System.out.println("La posicion consultada est libre");
			}
		
		
			

			
	}
	

	

	

}
