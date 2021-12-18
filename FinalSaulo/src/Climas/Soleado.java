package Climas;

import plantas.Plantas;
import unidades.Unidades;

public class Soleado {
	

	public void BajarDefensa(Unidades unidad){
		
		
		if (unidad instanceof Plantas) {
		
		unidad.setDefensa(unidad.getDefensa() - 2);
		
	}
		
	}


}
