package vista;

import utilidades.Leer;

public class ImprimirMenu {
	
	public void imprimirMenu () {
		
		System.out.println("Bienvenidos a JO_JEAN® Battle Of The Seas."
				+ "\nOpciones:"
				+ "\n\n1. ☞ Jugar"
				+ "\n2. ☞ Instrucciones"
				+ "\n0. ☞ Salir\n");
		System.out.printf("• Elección: ");
		
		
	}
	public void imprimirSubmenuJugar () {
		System.out.println("\nHa seleccionado usted la opción jugar. ¿Qué modo de juego desea?"
				+ "\n1. ☞ Player vs Player"
				+ "\n2. ☞ Player vs CPU\n");
		System.out.printf("• Elección: ");
	}
	
	public void imprimirSubmenuInstrucciones () {
		System.out.println("\n1. ☞ No puedes colocar los barcos de forma diagonal y tienen que tener una casilla de distancia entre ellos.");
		System.out.println("2. ☞ Si tocas o hundes un barco, el turno vuelve a recaer sobre ti.");
		System.out.println("3. ☞ Si impactas en el agua, el turno pasa a tu rival.");
		System.out.println("4. ☞ Si hundes dos barcos seguidos, tendrás la oportunidad de lanzar "
				+ "\n\tuna bomba que ocupará una zona 3x3 del tablero rival.");
		System.out.println("5. ☞ Existe una opción para ganar directamente ya que se generará "
				+ "\n\tde forma aleatoria un barco que ocupe una casilla en el tablero rival, "
				+ "\n\tsi aciertas cuál es ganarás la partida de forma automática.");
	}
	
	
}
