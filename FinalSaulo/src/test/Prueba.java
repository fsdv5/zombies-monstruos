package test;


import Usuario.Usuario;
import monstruos.*;
import plantas.*;
import tablero.Tablero;
import tablero.TableroJuego;
import unidades.Unidades;

public class Prueba {

	
	public static void main(String[] args) {
		
		
		Tablero ta = new Tablero();
		
		Plantas p1 = FabricaPlantas.construir("PlantaNormal");
		Plantas p2 = FabricaPlantas.construir("PlantaCarnivora");
		Plantas p3 = FabricaPlantas.construir("PlantaCarnivora");
		
		Monstruos m1 = FabricaMonstruos.construir("MonstruoCuerpo");
		Monstruos m2 = FabricaMonstruos.construir("MonstruoCuerpo");
		Monstruos m3 = FabricaMonstruos.construir("MonstruoCuerpo");
		
		/*
		System.out.println(m1.getSalud());
		
		p1.atacar(m1);
		
		System.out.println(m1.getSalud());
		
		
		ta.agregarUnidad(p1, 1, 1);
		
		ta.agregarUnidad(p2, 2, 1);
	
		*/
		ta.agregarUnidad(p3, 5, 1);
		
		ta.agregarUnidad(m1, 6, 0);
		ta.agregarUnidad(m2, 5, 1);
		
		ta.agregarUnidad(m3, 9, 1);
		
		ta.retornarOcupados(4,0);
			
			
		}
		
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



		    }

		
		
		
		
		
		
		// clima singleton 
		
	
	


