package test;


import java.util.Scanner;

import plantas.FabricaPlantas;
import plantas.Plantas;
import tablero.TableroJuego;

public class Prueba {

	
	public static void main(String[] args) {
		
		
		
		Plantas p = FabricaPlantas.construir("PlantaCarnivora");
		Plantas p2 = FabricaPlantas.construir("PlantaCarnivora");
		
		/*
		 * System.out.println(p2.getSalud());
		 * 
		 * p.atacar(p2);
		 * 
		 * System.out.println(p2.getSalud());
		 */
		
		Scanner scTexto = new Scanner(System.in);
		
		Scanner scNumero = new Scanner(System.in);
		
		int opcion = 0;
		
		do {
			
					System.out.println("\t\t\tBienvenido al juego de Plantas vs. Monstruos");
					
					System.out.println("PLANTAS DISPONIBLES");
					System.out.println("-------------------");
					System.out.println("[1] -> Planta Normal; Caracter�sticas: Coste de Trebol 3, Vida 30, Ataque 10, Defensa 5");
					System.out.println("[2] -> Planta Girasol; Caracter�sticas: Coste de Trebol 3, Vida 30, Ataque 2, Defensa 5, Permite obtener un trebol cada 4 turnos");
					System.out.println("[3] -> Planta Carn�vora; Caracter�sticas: Coste de Trebol 6, Vida 50, Mata a un enemigo cada 4 turnos, Defensa 9");
					System.out.println("[4] -> Planta Guisante; Caracter�sticas: Coste de Trebol 4, Vida 35, Ataque 3, Defensa 8, Puede atacar a distancia");
					
					System.out.println(" ");
					
					System.out.print("Elige un tipo de planta con la que deseas jugar, y presiona Enter, y as� sucesivamente. Recuerda que m�ximo puedes elegir 8 plantas. (El tipo de planta se puede repetir; si seleccionas una planta que no existe se acabar� el juego) ");
					
					int tipoPlanta1 = scNumero.nextInt();
					int tipoPlanta2 = scNumero.nextInt();
					int tipoPlanta3 = scNumero.nextInt();
					int tipoPlanta4 = scNumero.nextInt();
					int tipoPlanta5 = scNumero.nextInt();
					int tipoPlanta6 = scNumero.nextInt();
					int tipoPlanta7 = scNumero.nextInt();
					int tipoPlanta8 = scNumero.nextInt();
					
					if(tipoPlanta1  < 5 && tipoPlanta2 < 5 && tipoPlanta3 < 5 && tipoPlanta4 < 5 && tipoPlanta5 < 5 && tipoPlanta6 < 5 && tipoPlanta7 < 5  && tipoPlanta8 < 5){
						
						
									TableroJuego t = TableroJuego.getTablero();
									
									t.dibujarTablero();
									
									
									System.out.println(" ");		
									
									System.out.println("Elige en qu� casillero del tablero deseas posicionar las plantas " + " " + tipoPlanta1 + " " + tipoPlanta2 + " " + tipoPlanta3 + " " + tipoPlanta4 + " " + tipoPlanta5 + " " + tipoPlanta6 + " " + tipoPlanta7 + " " + tipoPlanta8 + "(En ese �rden). Record� que s�lo pod�s tener una planta por casillero. Si eliges un casillero repetido perder�s autom�ticamente la segunda planta introducida en el mismo. Suerte! ");
									
									int posicionTablero1 = scNumero.nextInt();
									int posicionTablero2 = scNumero.nextInt();
									int posicionTablero3 = scNumero.nextInt();
									int posicionTablero4 = scNumero.nextInt();
									int posicionTablero5 = scNumero.nextInt();
									int posicionTablero6 = scNumero.nextInt();
									int posicionTablero7 = scNumero.nextInt();
									int posicionTablero8 = scNumero.nextInt();
									int posicionTablero9 = scNumero.nextInt();
									int posicionTablero10 = scNumero.nextInt();
									int posicionTablero11 = scNumero.nextInt();
									int posicionTablero12 = scNumero.nextInt();
									int posicionTablero13 = scNumero.nextInt();
									int posicionTablero14 = scNumero.nextInt();
									int posicionTablero15 = scNumero.nextInt();
									int posicionTablero16= scNumero.nextInt();
									int posicionTablero17= scNumero.nextInt();
									int posicionTablero18= scNumero.nextInt();
									int posicionTablero19= scNumero.nextInt();
									int posicionTablero20= scNumero.nextInt();
									int posicionTablero21= scNumero.nextInt();
									int posicionTablero22= scNumero.nextInt();
									int posicionTablero23= scNumero.nextInt();
									int posicionTablero24= scNumero.nextInt();
									int posicionTablero25= scNumero.nextInt();
									int posicionTablero26= scNumero.nextInt();
									int posicionTablero27= scNumero.nextInt();
									int posicionTablero28= scNumero.nextInt();
									int posicionTablero29= scNumero.nextInt();
									int posicionTablero30= scNumero.nextInt();
									int posicionTablero31= scNumero.nextInt();
									int posicionTablero32= scNumero.nextInt();
									int posicionTablero33 = scNumero.nextInt();
									int posicionTablero34= scNumero.nextInt();
									int posicionTablero35= scNumero.nextInt();
									int posicionTablero36= scNumero.nextInt();
									int posicionTablero37= scNumero.nextInt();
									int posicionTablero38= scNumero.nextInt();
									int posicionTablero39= scNumero.nextInt();
									int posicionTablero40= scNumero.nextInt();
										
										System.out.println(" ");
										
										
										System.out.println ("Qu� nivel dificultad deseas? Presiona 1 para F�CIL, 2 para NORMAL o 3 para D�FICIL");
										
										int dificultad = scNumero.nextInt();
										
										
										if(dificultad == 1) {
											
											System.out.println("Has elegido el nivel f�cil. El juego comenzar� intant�neamente. Buena Suerte!");
											
											// Posicionar 5 monstruos
											
										} else if (dificultad == 2){
											
											System.out.println("Has elegido el nivel medio. El juego comenzar� intant�neamente. Buena Suerte!");
											
											// Posicionar 15 monstruos
											
										} else if (dificultad == 3){
											
											System.out.println("Has elegido el nivel d�ficil. El juego comenzar� intant�neamente. Buena Suerte!");
											
											// Posicionar 30 monstruos
											
							            }else {
											
											System.out.println("Error al selecionar el nivel. Fin del juego");
											
											break;
							            }
								
				} else {
								
								System.out.println("Error! Ese tipo de planta no existe. Fin del juego");
								
								
				}
							
				System.out.println("Si desea jugar nuevamente presione 1, de lo contrario, presione 2");
				
				opcion = scNumero.nextInt();
				
	}while (opcion == 1);
				
	
	System.out.println("Gracias por jugar");
				
					
					
	}
}
	

