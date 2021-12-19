package test;

import Climas.Soleado;
import Climas.Lluvioso;
import Climas.Nublado;


import java.util.Scanner;
import Usuario.Usuario;
import monstruos.*;
import plantas.*;
import tablero.ExcepcionAgregarPlanta;
import tablero.Tablero;
import unidades.Unidades;
import Climas.Soleado;
import Climas.Lluvioso;
import Climas.Nublado;

public class Prueba {



	/*
	
	public static void main(String[] args) {
		
		  Scanner scTexto = new Scanner(System.in);
			
	      Scanner scNumero = new Scanner(System.in);
	      
	   
		
		int opcion = 0;
		
	do {
			
					System.out.println("\t\t\tBienvenido al juego de Plantas vs. Monstruos");
					
					System.out.println("PLANTAS DISPONIBLES");
					System.out.println("-------------------");
					System.out.println("[1] -> Planta Normal; Caractersticas: Coste de Trebol 3, Vida 30, Ataque 10, Defensa 5");
					System.out.println("[2] -> Planta Girasol; Caractersticas: Coste de Trebol 3, Vida 30, Ataque 2, Defensa 5, Permite obtener un trebol cada 4 turnos");
					System.out.println("[3] -> Planta Carnivora; Caractersticas: Coste de Trebol 6, Vida 50, Mata a un enemigo cada 4 turnos, Defensa 9");
					System.out.println("[4] -> Planta Guisante; Caractersticas: Coste de Trebol 4, Vida 35, Ataque 3, Defensa 8, Puede atacar a distancia");
					
					System.out.println(" ");
					
				//	System.out.println("Que planta desea agregar? tiene disponible:" + us.getRecursos());

					
		
					for (int i=0; i < 20; i++) {
						
						int x = (int) (Math.random() * (11 - 5) + 5);
						System.out.println(x);
						
						
					}
					
					
		Tablero ta = new Tablero();
		
		
		Plantas p1 = FabricaPlantas.construir("PlantaNormal");
		Plantas p2 = FabricaPlantas.construir("PlantaCarnivora");
		Plantas p3 = FabricaPlantas.construir("PlantaCarnivora");
		
		
		 * try { ta.agregarPlanta(p1, 1, 1); } catch (ExcepcionAgregarPlanta e) { //
		 * TODO Auto-generated catch block System.out.println(e.getMessage()); } try {
		 * ta.agregarPlanta(p2, 1, 1); } catch (ExcepcionAgregarPlanta e) { // TODO
		 * Auto-generated catch block System.out.println(e.getMessage()); }
		
		
		Monstruos m1 = FabricaMonstruos.construir("MonstruoDistancia");
		Monstruos m2 = FabricaMonstruos.construir("MonstruoCuerpo");
		Monstruos m3 = FabricaMonstruos.construir("MonstruoCuerpo"); 
		
	
		ta.agregarMonstruo(m1);
		ta.pintarTablero();
		ta.moverMonstruo();
		ta.pintarTablero();
		ta.moverMonstruo();
		ta.pintarTablero();
		
		
		
		/*
		 * p2.atacar(p1); p2.atacar(p1); p2.atacar(p1); p2.atacar(p1);
		 * 
		 * 
		 * ta.limpiarMuertos();
		 
		
					 */

	//	System.out.println("TABLERO ");
		//System.out.println("-------------------");
		
		
	}
}
		
		/*
		System.out.println(m1.getSalud());
		
		p1.atacar(m1);
		
		System.out.println(m1.getSalud());
		
		
		ta.agregarUnidad(p1, 1, 1);
		
		ta.agregarUnidad(p2, 2, 1);
		ta.agregarUnidad(p3, 5, 1);
		
		ta.agregarUnidad(m1, 6, 0);
		ta.agregarUnidad(m2, 5, 1);
		
		ta.agregarUnidad(m3, 9, 1);
		
		ta.retornarOcupados(4,0);
	
		
		System.out.println(" ");
		
		ta.pintarTablero();
		
		System.out.println(" ");
		
		Soleado soleado= new Soleado();
		Nublado nublado = new Nublado();
		Lluvioso lluvioso = new Lluvioso();
		
		int NRClimas = (int)(Math.random()*3+0);
	
		/*
		
		if (NRClimas == 0) {
			
			System.out.println("Jugarás en un clima soleado, preparate!");
			
			soleado.BajarDefensa(p1);
			soleado.BajarDefensa(p2);
			soleado.BajarDefensa(p3);
		}
		
		else if (NRClimas == 1) {
			
			System.out.println("Jugarás en un clima nublado, preparate!");
			
			nublado.DosXTurno(m1);
			nublado.DosXTurno(m2);
		}
		
		else if (NRClimas == 2) {
			
			System.out.println("Jugarás en un clima lluvioso, preparate!");
			
			lluvioso.AgregarVidayPoder(p1);
			lluvioso.AgregarVidayPoder(p2);
			lluvioso.AgregarVidayPoder(p3);
		}

		
		System.out.println ("Qué nivel dificultad deseas? Presiona 1 para FÁCIL, 2 para NORMAL o 3 para DÍFICIL");
		
		int dificultad = scNumero.nextInt();
		
		
		if(dificultad == 1) {
			
			System.out.println("Has elegido el nivel fácil. El juego comenzar intantáneamente. Buena Suerte!");
			
			System.out.println(" ");
			
			
		
			
			// Posicionar 5 monstruos a casilleros de la base
			
			for (int i = 0; i  < 3; i++) {
				
			int numeroY = (int)(Math.random()*10+0);
			int numeroX = (int)(Math.random()*(10-6+1)+6);
			
			ta.agregarMonstruo(m1, numeroY, numeroX);
			
			}
			
            
			for (int i = 0; i < 2; i++) {
				
				int numeroY = (int)(Math.random()*10+0);
				int numeroX = (int)(Math.random()*(10-6+1)+6);
				
				ta.agregarMonstruo(m2, numeroY, numeroX);
				
			}
			
			ta.pintarTablero();
			
		
			
			
			
		} else if (dificultad == 2){
			
			System.out.println("Has elegido el nivel medio. El juego comenzar intantáneamente. Buena Suerte!");
			
			// Posicionar 15 monstruos
			
			for (int i = 0; i  < 10; i++) {
				
				int numeroY = (int)(Math.random()*10+0);
				int numeroX = (int)(Math.random()*(10-6+1)+6);
				
				ta.agregarMonstruo(m1, numeroY, numeroX);
				
				}
				
	            
				for (int i = 0; i < 5; i++) {
					
					int numeroY = (int)(Math.random()*10+0);
					int numeroX = (int)(Math.random()*(10-6+1)+6);
					
					ta.agregarMonstruo(m2, numeroY, numeroX);
					
				}
				
				ta.pintarTablero();
			
		} else if (dificultad == 3){
			
			System.out.println("Has elegido el nivel díficil. El juego comenzar intantáneamente. Buena Suerte!");
			
			// Posicionar 30 monstruos
		
		
			for (int i = 0; i  < 20; i++) {
				
				int numeroY = (int)(Math.random()*10+0);
				int numeroX = (int)(Math.random()*(10-6+1)+6);
				
				ta.agregarMonstruo(m1, numeroY, numeroX);
				
				}
				
	            
				for (int i = 0; i < 10; i++) {
					
					int numeroY = (int)(Math.random()*10+0);
					int numeroX = (int)(Math.random()*(10-6+1)+6);
					
					ta.agregarMonstruo(m2, numeroY, numeroX);
					
				}
				
				ta.pintarTablero();
				
				
				
				
		/*
		 * ta.pintarTablero(); m1.atacar(p1); ta.pintarTablero();
		 */
		

		
		
			
			
		
		
		/*TableroJuego t = TableroJuego.getTablero();
		
	//	t.dibujarTablero();
		
		
		
		// t.iniciarTablero();
		
		
		Plantas p = FabricaPlantas.construir("PlantaCarnivora");
		Monstruos m1 = FabricaMonstruos.construir("MonstruoCuerpo");
		
		System.out.println(m1.getSalud());
		
		p.atacar(m1);
		
		System.out.println(m1.getSalud());
		
		
		Usuario us = new Usuario("Facundo");
		
		System.out.println("Usuario " + us.getNombreUsuario() + ", " +  us.getRecursos());
		
		
	*/



		    

		
		
		
		
		
		
		// clima singleton 
	
		/*
    }else {
		
		System.out.println("Error al selecionar el nivel. Fin del juego");
		
		break;
    }

	System.out.println("Si desea jugar nuevamente presione 1, de lo contrario, presione 2");
	
	opcion = scNumero.nextInt();
	
	
} while (opcion == 1);
	

System.out.println("Gracias por jugar");
	
		
		
}

	private static int random() {
		// TODO Auto-generated method stub
		return 0;
	}
	*/


