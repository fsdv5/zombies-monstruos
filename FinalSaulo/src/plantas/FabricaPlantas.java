package plantas;

public class FabricaPlantas {

	public static Plantas construir(String tipo) {

		switch (tipo) {
		
		case "PlantaNormal":
			return new PlantaNormal("PlantaNormal", 30, 3, 10, 5,0);
		case "PlantaGirasol":
			return new PlantaGirasol("PlantaGirasol", 30, 3, 2, 5,0);
		case "PlantaCarnivora":
			return new PlantaCarnivora("PlantaCarnivora", 50, 6, 1000, 9,0); // planta que mata cada 4 turnos.. verificar
		case "PlantaGuisante":
			return new PlantaGuisante("PlantaGuisante", 35, 4, 3, 8,0);
		default:
			System.out.println("No se encuentra ese tipo");
			return null;
		}

		
		// en el metodo atacar que varie, sacarlo del constructor
		
	}
	
}


