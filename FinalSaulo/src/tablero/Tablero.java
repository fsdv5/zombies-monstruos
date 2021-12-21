package tablero;

import Usuario.Usuario;
import monstruos.FabricaMonstruos;
import monstruos.MonstruoCuerpo;
import monstruos.MonstruoDistancia;
import monstruos.Monstruos;
import plantas.PlantaGirasol;
import plantas.Plantas;
import unidades.Unidades;


public class Tablero {

	int contadorMonstruos = 0;
	int random = (int) (Math.random()*10 + 0);
	
	
	private Unidades[][] TableroJuego = new Unidades[11][11];
	Usuario us = new Usuario();
	
	
	

	public void PlantasAgua(int i, int j) {


	                if (TableroJuego[i][j] != null && TableroJuego[i][j] instanceof Plantas) {

	                    TableroJuego[i][j].setSalud(TableroJuego[i][j].getSalud() + random);

	                }else {

	                    System.out.println("Error! No hay ninguna planta en el tablero");
	                }

	            }
	
	
	
	
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
		
				
		int y = (int)(Math.random()*8+0);
		
		int x = (int) (Math.random() * (11 - 6) + 6);
		
		TableroJuego[y][x] = monstruo;
		contadorMonstruos--;
	}
	
	
	public Monstruos monstruoRandom() {
		
		int y = (int)(Math.random()*3+0);

		if(y < 2) {
			
			return FabricaMonstruos.construir("MonstruoCuerpo");
			
		} else {
			
			return FabricaMonstruos.construir("MonstruoDistancia");
		}
		

		
	}
	
	
	public boolean buscarGanador() {
		
		for(int i=0; i < TableroJuego.length; i++) {
					
		if(TableroJuego[i][0] instanceof Monstruos ) {

            System.out.println("GANAN LOS MONSTRUOS");
            return true;
        
            }
	}
		
		return false;
		} 
	
	
	public void moverMonstruo() {
		
		
		for(int i=0; i<TableroJuego.length; i++) {
			for(int j=0; j<TableroJuego.length; j++) {				
	
				
		if(TableroJuego[i][j]!=null && TableroJuego[i][j] instanceof Monstruos && j > 0) { // > 0 = afuera base
			
			if(TableroJuego[i][j-1] == null) {
				
				TableroJuego[i][j-1] = TableroJuego[i][j];
				TableroJuego[i][j] = null;
							
			}
			
		} else if(TableroJuego[i][j] instanceof Monstruos && j == 0) {
			buscarGanador();
			
			} else {}
		}
	}
	}


	public void agregarPlanta(Plantas planta, int y, int x) throws ExcepcionAgregarPlanta {
		

		
		if(TableroJuego[y][x] == null && x<5) {
			
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
			throw new ExcepcionAgregarPlanta("\t Posicion invalida. La proxima eleg� bien");
			
	}
	}
	
			

	public void buscarPelea() {

        for (int i = 0; i < TableroJuego.length; i++) {
            for (int j = 0; j < TableroJuego.length; j++) {
// Se estableci� un ciclo en el cual K reserva el �ndice del monstruo; con la finalidad de encontrar la posici�n exacta del monstruo para luego realizar el ataque de la planta.
                if (TableroJuego[i][j] instanceof Plantas) {
                    System.out.println(
                            "hay una " + TableroJuego[i][j].getNombre() + " en la posicion: " + i + " columna " + j);
                    for (int k = 0; k < TableroJuego.length; k++) {
                        if (TableroJuego[i][k] instanceof Monstruos) {
                            TableroJuego[i][j].atacar(TableroJuego[i][k]);
                            System.out.println("la " + TableroJuego[i][j].getNombre() + " ataca al "
                                    + TableroJuego[i][k].getNombre());
                        }
                    }

                }

                else {
                }
// Se realiz� una b�squeda general en los �ndices para ver si se encuentra instanciado alg�n monstruo; para luego realizar un filtrado entre los monstruos a distancia y CaC.
                if (TableroJuego[i][j] instanceof Monstruos) {
                    System.out.println(
                            "hay un " + TableroJuego[i][j].getNombre() + " en la posicion: " + i + " columna " + j);
// Se estableci� un ciclo en el cual K reserva el �ndice de la planta; con la finalidad de encontrar la posici�n exacta de la misma para luego realizar el ataque.
                    if (TableroJuego[i][j] instanceof MonstruoDistancia) {
                        for (int k = 0; k < TableroJuego.length; k++) {
                            if (TableroJuego[i][k] instanceof Plantas) {
                                TableroJuego[i][j].atacar(TableroJuego[i][k]);
                                System.out.println("el " + TableroJuego[i][j].getNombre() + " ataca a la "
                                        + TableroJuego[i][k].getNombre());
                            }
                        }
// Se estableci� un ciclo en el cual H reserva el �ndice de la planta; con la finalidad de encontrar la posici�n exacta entre el monstruo y la misma.
                    } else if (TableroJuego[i][j] instanceof MonstruoCuerpo) {
                        for (int h = 0; h < TableroJuego.length; h++) {
                            if (TableroJuego[i][h] instanceof Plantas) {
                                if (TableroJuego[i][h] == TableroJuego[i][j - 1]) {
                                    TableroJuego[i][j].atacar(TableroJuego[i][h]);
                                    System.out.println("el " + TableroJuego[i][j].getNombre() + " ataca a la "
                                            + TableroJuego[i][h].getNombre());
                                }
                            }
                        }
                    }
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



	public Unidades[][] getTableroJuego() {
		return TableroJuego;
	}




	public void setTableroJuego(Unidades[][] tableroJuego) {
		TableroJuego = tableroJuego;
	}




	public int getContadorMonstruos() {
		return contadorMonstruos;
	}



	public void setContadorMonstruos(int contadorMonstruos) {
		this.contadorMonstruos = contadorMonstruos;
	}





	

	

}
