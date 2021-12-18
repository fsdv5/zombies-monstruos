package monstruos;



public class FabricaMonstruos {
	
	public static Monstruos construir(String tipo) {

		switch (tipo) {
		

		case "MonstruoCuerpo":
			return new MonstruoCuerpo("Monstruo CaC", 100, 15, 10,0);
		case "MonstruoDistancia":
			return new MonstruoDistancia("Monstruo AD", 50, 10, 10,0);
		default:
			System.out.println("No se encuentra ese tipo");
			return null;
		}

	}

	

}
