package Juego;
import Climas.*;
import monstruos.*;
import plantas.*;
import recursos.*;
import tablero.*;
import unidades.*;
import Usuario.*;
import java.util.Scanner;

public class Mecanica {
	
	Scanner sc = new Scanner(System.in);
	//Usuario jugador = new Usuario();
	Recursos recursos = new Recursos();
	int posicionY;
	int posicionX;
	Tablero ta = new Tablero();
	Plantas planta;
	Monstruos monstruo;
	Soleado soleado = new Soleado();
	Lluvioso lluvioso = new Lluvioso();
	
	
	Plantas p1 = FabricaPlantas.construir("PlantaNormal");
	Plantas p2 = FabricaPlantas.construir("PlantaCarnivora");
	Plantas p3 = FabricaPlantas.construir("PlantaCarnivora");
	
	Monstruos m1 = FabricaMonstruos.construir("MonstruoDistancia");
	Monstruos m2 = FabricaMonstruos.construir("MonstruoCuerpo");
	Monstruos m3 = FabricaMonstruos.construir("MonstruoCuerpo"); 
	
	
		
	
	public void seleccionUsuario() {
		
		System.out.println("\tBienvenido al juego de Plantas vs. Monstruos");
		System.out.println("-------------------------------------------------------------");
		System.out.println("\tPor favor, ingrese su nombre de usuario: ");
		String usuario = sc.nextLine();
		
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("\tPreparate para comenzar, " + usuario + ". ");
		System.out.println("RECURSOS DISPONIBLES: " + "Trebol: " + recursos.getTrebol() + ", Agua: " +  recursos.getAgua());
		System.out.println("-------------------------------------------------------------");
		

	}
	
	public void seleccionDificultad() {
		
		System.out.println ("Que nivel dificultad deseas? Presiona 1 para FACIL, 2 para NORMAL o 3 para DIFICIL");
		
		int dificultad = sc.nextInt();

		if(dificultad == 1) {
			
						
			System.out.println("Has elegido el nivel facil. El juego comenzar intantneamente. Buena Suerte!");
			ta.setContadorMonstruos(5);
		    
			
		} else if (dificultad == 2){
			
			System.out.println("Has elegido el nivel medio. El juego comenzar intantneamente. Buena Suerte!");
			
			ta.setContadorMonstruos(15);
			
	} else if (dificultad == 3){
			
			System.out.println("Has elegido el nivel dificil. El juego comenzar intantneamente. Buena Suerte!");
			
			ta.setContadorMonstruos(30);
		
								
	}

		
	}
	
	public void menuSeleccion() {
		
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t Es momento de posicionar sus plantas en el tablero");
		System.out.println("");
		
		System.out.println("TABLERO ");
		System.out.println("-------------------");
		ta.pintarTablero();
		System.out.println("");
		
	
		System.out.println("");
		
	
		System.out.println("\t\tPLANTAS DISPONIBLES");
		System.out.println("-------------------------------------------------------------");
		System.out.println("[1] -> Planta Normal; Caractersticas: Coste de Trebol 3, Vida 30, Ataque 10, Defensa 5");
		System.out.println("[2] -> Planta Girasol; Caractersticas: Coste de Trebol 3, Vida 30, Ataque 2, Defensa 5, Permite obtener un trebol cada 4 turnos");
		System.out.println("[3] -> Planta Carnivora; Caractersticas: Coste de Trebol 6, Vida 50, Mata a un enemigo cada 4 turnos, Defensa 9");
		System.out.println("[4] -> Planta Guisante; Caractersticas: Coste de Trebol 4, Vida 35, Ataque 3, Defensa 8, Puede atacar a distancia");
		System.out.println("[5] -> COMENZAR TURNO");
		System.out.println("[6] -> Usar unidades de agua");
		System.out.println("[7] -> SALIR");
		
		System.out.println("-------------------------------------------------------------");
	
		
		
		
		System.out.println("Que planta desea agregar? \nUsted cuenta con los siguientes recursos: " + "Trebol: " + recursos.getTrebol() + ", Agua: " +  recursos.getAgua());
		
		int eleccionPlanta = sc.nextInt();
		if(ta.buscarGanador()) {eleccionPlanta=7;}
		switch(eleccionPlanta) {
		
		case 1: 
			System.out.println("Planta Normal. Excelente eleccion! ¿En que posiciones del tablero desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaNormal");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			recursos.setTrebol(recursos.getTrebol()-planta.getCosteTrebol());			
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			
			menuSeleccion();
			break;
			
	
		case 2:
			
			System.out.println("Planta Girasol. Excelente eleccion! ¿En que posiciones desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaGirasol");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			recursos.setTrebol(recursos.getTrebol()-planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			
			menuSeleccion();
			break;
		
		case 3: 
			System.out.println("Planta Carnivora. Excelente eleccion! ¿En que posiciones desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaCarnivora");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			recursos.setTrebol(recursos.getTrebol()-planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			menuSeleccion();
			break;
	
		case 4:
			System.out.println("Planta Guisante. Excelente eleccion! ¿En que posiciones desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaGuisante");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			recursos.setTrebol(recursos.getTrebol()-planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			menuSeleccion();
			break;
			
		case 5:
			
			
			if(ta.getContadorMonstruos() > 0) {
			ta.agregarMonstruo(ta.monstruoRandom());
			}
			ta.pintarTablero();
			ta.moverMonstruo();
			ta.buscarPelea();
			ta.limpiarMuertos();
		if(ta.buscarGanador()==false) {
			menuSeleccion();
		}
			break;
			
			
			
		case 6:
			
			   System.out.println("Ingrese la posición de la planta a la que quieres agregarle las unidades de agua");
	            posicionY = sc.nextInt();
	            posicionX = sc.nextInt();

	            ta.PlantasAgua(posicionY, posicionX);

	            recursos.setAgua(recursos.getAgua() - 2);
	            menuSeleccion();
	            
	            
	            break;
	
			
			
		case 7 : 	
			System.out.println("Gracias por jugar! Hasta pronto");
			break;
			
		default:
			System.out.println("No existe la opción seleccionada. Por favor elija correctamente.");
			menuSeleccion();
			
		} 
	
		
	
	
	}
}

	