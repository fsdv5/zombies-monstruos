package Juego;
import Climas.*;
import monstruos.*;
import plantas.*;
import recursos.*;
import tablero.*;
import test.*;
import unidades.*;
import Usuario.*;
import java.util.Scanner;

public class Mecanica {
	
	Scanner sc = new Scanner(System.in);
	Usuario jugador = new Usuario(" ");
	int posicionY;
	int posicionX;
	Tablero ta = new Tablero();
	Plantas planta;
	
	public void seleccionUsuario() {
		
		System.out.println("\tBienvenido al juego de Plantas vs. Monstruos");
		System.out.println("-------------------------------------------------------------");
		System.out.println("\tPor favor, ingrese su nombre de usuario: ");
		String usuario = sc.nextLine();
		jugador.setNombreUsuario(usuario);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("\tPreparate para comenzar, " + jugador.getNombreUsuario() + ". ");
		System.out.println("RECURSOS DISPONIBLES: " + jugador.getRecursos());
		System.out.println("-------------------------------------------------------------");
		

	}
	
	public void posicionarPlanta() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("\t Es momento de posicionar sus plantas en el tablero");
		System.out.println("");
		System.out.println("\t\tPLANTAS DISPONIBLES");
		System.out.println("-------------------------------------------------------------");
		System.out.println("[1] -> Planta Normal; Caractersticas: Coste de Trebol 3, Vida 30, Ataque 10, Defensa 5");
		System.out.println("[2] -> Planta Girasol; Caractersticas: Coste de Trebol 3, Vida 30, Ataque 2, Defensa 5, Permite obtener un trebol cada 4 turnos");
		System.out.println("[3] -> Planta Carnivora; Caractersticas: Coste de Trebol 6, Vida 50, Mata a un enemigo cada 4 turnos, Defensa 9");
		System.out.println("[4] -> Planta Guisante; Caractersticas: Coste de Trebol 4, Vida 35, Ataque 3, Defensa 8, Puede atacar a distancia");
		System.out.println("[5] -> COMENZAR JUEGO");
		
		System.out.println("-------------------------------------------------------------");
	
		
		
		
		System.out.println("Que planta desea agregar? Usted cuenta con los siguientes recursos: " + jugador.getRecursos());
		
		int eleccionPlanta = sc.nextInt();
		
		switch(eleccionPlanta) {
		
		case 1: 
			System.out.println("Planta Normal. Excelente eleccion! ¿En que posiciones del tablero desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaNormal");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			jugador.getRecursos().setTrebol(jugador.getRecursos().getTrebol() - planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			
			posicionarPlanta();
			break;
			
	
		case 2:
			
			System.out.println("Planta Girasol. Excelente eleccion! ¿En que posiciones desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaGirasol");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			jugador.getRecursos().setTrebol(jugador.getRecursos().getTrebol() - planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			
			posicionarPlanta();
			break;
		
		case 3: 
			System.out.println("Planta Carnivora. Excelente eleccion! ¿En que posiciones desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaCarnivora");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			jugador.getRecursos().setTrebol(jugador.getRecursos().getTrebol() - planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			posicionarPlanta();
			break;
	
		case 4:
			System.out.println("Planta Guisante. Excelente eleccion! ¿En que posiciones desea ingresarla?");
			System.out.println("Por favor, ingrese la posicion del tablero de acuerdo a las siguientes indicaciones: Posicion Y / Posicion X");
			posicionY = sc.nextInt();
			posicionX = sc.nextInt();
			planta = FabricaPlantas.construir("PlantaGuisante");
			try {
			ta.agregarPlanta(planta, posicionY, posicionX);
			jugador.getRecursos().setTrebol(jugador.getRecursos().getTrebol() - planta.getCosteTrebol());
			}catch(ExcepcionAgregarPlanta e) {
				System.out.println(e.getMessage());
			}
			posicionarPlanta();
			break;
			
		case 5:
			System.out.println("El juego comenzara a continuacion.");
			ta.pintarTablero();
			break;
		
		default:
			System.out.println("No existe la opción seleccionada. Por favor elija correctamente.");
			posicionarPlanta();
			
		} 
	
		
	
		
	}

}
