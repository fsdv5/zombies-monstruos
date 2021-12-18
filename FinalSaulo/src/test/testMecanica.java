package test;

import Juego.Mecanica;
import tablero.Tablero;

public class testMecanica {
	
	public static void main(String[] args) {
		
		Mecanica m = new Mecanica();
		Tablero t = new Tablero();
		
		m.seleccionUsuario();
		t.pintarTablero();
		m.posicionarPlanta();
		
		
	}

}
