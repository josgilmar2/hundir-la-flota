package principal;

import utilidades.*;	
import vista.*;
import model.*;
import crud.*;


public class Ppal {

	public static void main(String[] args) {
		
		//VARIABLES
		int op;
		String nombre;
		boolean victoria=false;
		ImprimirMenu menu=new ImprimirMenu ();
		ImprimirTablero tablero= new ImprimirTablero ();
		Jugador jugador1, jugador2;
		
		
		//ANIMACION
		
		//MENÚ 
		
		menu.imprimirMenu();
		op=Leer.datoInt();
		
		switch (op) {
		
			case 1:
				menu.imprimirSubmenuJugar();
				op=Leer.datoInt();
				switch (op) {
					
					case 1: 
						
						//AQUÍ INTRODUCIMOS LOS NOMBRES DE LOS JUGADORES.
						
						System.out.println("\nIntroduzca el nombre del jugador 1.");
						jugador1=new Jugador (Leer.dato());
						System.out.println("\nIntroduzca el nombre del jugador 2.");
						jugador2=new Jugador (Leer.dato());
						
						//AQUÍ POSICIONAMOS BARCOS.
						System.out.println("Ahora solo tiene que colocar sus barcos."
								+ "\nTenga en cuenta que no pueden salirse del tablero ni superponerse. Aún así, si es subnormal no tiene que preocuparse porque hemos previsto su deficiencia.");
						tablero.imprimirTablero();
						
						//FOR EACH QUE REGISTRE BARCOS (DENTRO DE POSICIONAR BARCOS).
						
						//AQUÍ EMPIEZA EL BUCLE DE LA PARTIDA.
						
						do {
							
							
						}while (!victoria);
						
						break;
						
					case 2:
						
						break;
				}
				break;
			case 2:
				menu.imprimirSubmenuInstrucciones();
				break;
			case 0:
				break;
		}
		
		
	}

}
