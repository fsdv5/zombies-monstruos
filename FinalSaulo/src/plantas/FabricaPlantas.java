package plantas;

public class FabricaPlantas {

	public static Plantas construir(String tipo) {

		switch (tipo) {
		
		case "PlantaNormal":
			return new PlantaNormal("PlantaNormal", 30, 3, (int)(Math.random()*10+1), 5);
		case "PlantaGirasol":
			return new PlantaGirasol("PlantaGirasol", 30, 3, (int)(Math.random()*2+1), 5);
		case "PlantaCarnivora":
			return new PlantaCarnivora("PlantaCarnivora", 50, 6, (int)(Math.random()*25+1), 9); // planta que mata cada 4 turnos.. verificar
		case "PlantaGuisante":
			return new PlantaGuisante("PlantaGuisante", 35, 4, (int)(Math.random()*3+1), 8);
		default:
			System.out.println("No se encuentra ese tipo");
			return null;
		}

	}
}
