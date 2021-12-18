package Climas;

import plantas.Plantas;
import unidades.Unidades;


public class Lluvioso {
	
	public void AgregarVidayPoder(Unidades unidad) {
		
	
		if (unidad instanceof Plantas) {
		
		unidad.setSalud(unidad.getSalud() + 2);
		
		unidad.setSalud(unidad.getSalud() - ((int) (Math.random()*unidad.getAtaque() + 0) * 2 / 100));
		
		}
		
		}
	}

