package vista;

import utilidades.Leer;

public class ImprimirOpciones {
	
	public static void menu () {
		
		int numMenu=0, cero=0;
		
		do {
			
			System.out.println("Pulse 0 para salir");
			System.out.println("Pulse 1 para ver las instrucciones");
			System.out.println("Pulse 2 para jugar");
			numMenu=Leer.datoInt();
			
			switch (numMenu) {
			
				case 0:
					break;
					
				case 1:
					System.out.println("1. No puedes colocar los barcos de forma diagonal.");
					System.out.println("2. Si tocas o hundes un barco, el turno vuelve a recaer sobre ti.");
					System.out.println("3. Si impactas en el agua, el turno pasa a tu rival.");
					System.out.println("4. Si hundes dos barcos seguidos, tendrás la oportunidad de lanzar "
							+ "una bomba que ocupará cuatro casillas de forma cuadrangular.");
					System.out.println("5. Existe una opción para ganar directamente ya que se generará "
							+ "de forma aleatoria un barco que ocupe una casilla en el tablero rival, si aciertas cuál es"
							+ "ganarás la partida de forma automática.");
					break;
					
				case 2:
					System.out.println("Ha seleccionado la opción jugar. ¿Qué modo de juego desea?"
							+ "\n - VS CPU"
							+ "\n - Multijugador");
					break;
					
				default:
					break;
			}
			
		}while (numMenu!=cero);
		
		
	}

}
