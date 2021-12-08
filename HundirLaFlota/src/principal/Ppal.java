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
		
		menu.ImprimirMenu();
		op=Leer.datoInt();
		
		switch (op) {
		
			case 1:
				menu.ImprimirSubmenu();
				op=Leer.datoInt();
				switch (op) {
					
					case 1: 
						
						//AQUÍ INTRODUCIMOS LOS NOMBRES DE LOS JUGADORES.
						
						System.out.println("Introduzca el nombre del jugador 1.");
						jugador1=new Jugador (Leer.dato());
						System.out.println("Introduzca el nombre del jugador 2.");
						jugador2=new Jugador (Leer.dato());
						
						//AQUÍ POSICIONAMOS BARCOS.
						
						tablero.imprimirTablero();
						
						//AQUÍ EMPIEZA EL BUCLE DE LA PARTIDA.
						
						do {
							
							
						}while (!victoria);
						
						break;
						
					case 2:
						System.out.println("");
						break;
				}
				break;
			case 2:
				
				break;
			case 0:
				break;
		}
		
		
	}

}
