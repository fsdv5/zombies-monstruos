package tablero;


public class TableroJuego {

	private static TableroJuego tablero;
	private String[][] tableroJuego = new String[5][11];
	

	private TableroJuego() {
		
		iniciarTablero();
		
	}

	public static TableroJuego getTablero() {

		if (tablero == null) {

			tablero = new TableroJuego();
		}

		return tablero;

	}

	public void dibujarTablero() {
		
		iniciarTablero();
		
		System.out.println("     00  01  02  03  04  05  06  07  08  09  10");
		
		for (int i = 1; i <= 5; i++) {

			System.out.print("0" + i);
			for (int j = 0; j < 11; j++) {

				System.out.print(tableroJuego[i-1][j]);
			}
			System.out.println();

		}

	}

	private void iniciarTablero() {

		for (int i = 0; i < tableroJuego.length; i++) {

			for (int j = 0; j < tableroJuego[i].length; j++) {

				if (j == 0) {

					tableroJuego[i][j] = "   B- ";
				} else {

					tableroJuego[i][j] = " -O ";

				}

			}

		}

	}

}
