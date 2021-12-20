package tablero;

import Usuario.Usuario;
import monstruos.MonstruoCuerpo;
import monstruos.MonstruoDistancia;
import monstruos.Monstruos;
import plantas.Plantas;
import unidades.Unidades;


public class Tablero {
	
	private Unidades[][] TableroJuego = new Unidades[11][11];
	Usuario us = new Usuario();
	
	
		
	
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

	   
	public void agregarMonstruo(Monstruos monstruo) {
		
				
		int y = (int)(Math.random()*7+0);
		
		int x = (int) (Math.random() * (11 - 5) + 5);
		
		TableroJuego[y][x] = monstruo;
	}
	
	
	public void moverMonstruo() {
		
		for(int i=0; i<TableroJuego.length; i++) {
			for(int j=0; j<TableroJuego.length; j++) {
				
		if(TableroJuego[i][j]!=null && TableroJuego[i][j] instanceof Monstruos && j > 1) { // > 1 = afuera base
		
						
			TableroJuego[i][j-1] = TableroJuego[i][j];
			TableroJuego[i][j] = null;
		}
			}
		}
		
	}
	

	public void agregarPlanta(Plantas planta, int y, int x) throws ExcepcionAgregarPlanta {
		

		
		if(TableroJuego[y][x] == null) {
			
			if(us.getRecursos().getTrebol() > planta.getCosteTrebol()) {
			
			TableroJuego[y][x] = planta;
			us.getRecursos().setTrebol(us.getRecursos().getTrebol() - planta.getCosteTrebol());
			System.out.println("-------------------------------------------------------------");
			System.out.println("Planta agregada correctamente. Posicion del tablero: " + y + ", " + x);
			System.out.println("-------------------------------------------------------------");
			} else {
				
				throw new ExcepcionAgregarPlanta("No tenes suficientes recursos");
			}
		} else {
			System.out.println("-------------------------------------------------------------");
			throw new ExcepcionAgregarPlanta("\tLa posicion se encuentra ocupada. La proxima eleg� bien");
			
	}
	}
	
			

	public void buscarPelea() {
		
		for(int i=0; i<TableroJuego.length; i++) {
			for(int j=0; j<TableroJuego.length; j++) {
				
				if(TableroJuego[i][j] instanceof Plantas) {
				
					if(TableroJuego[i][j+1] instanceof Monstruos) {
						
						TableroJuego[i][j].atacar(TableroJuego[i][j+1]);
						
					} else {}
					
				} else if(TableroJuego[i][j] instanceof Monstruos){
					
					if(TableroJuego[i][j] instanceof MonstruoDistancia) {
						
						TableroJuego[i][j].atacar(TableroJuego[i][j-2]);
						
					} else {
						System.out.println(TableroJuego[i][j].getNombre() + "No tiene unidades para atacar");
					} } else if (TableroJuego[i][j] instanceof MonstruoCuerpo) {
						TableroJuego[i][j].atacar(TableroJuego[i][j-1]);												
					} else {
						System.out.println("que pasa");
					}
					
				}
				
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
