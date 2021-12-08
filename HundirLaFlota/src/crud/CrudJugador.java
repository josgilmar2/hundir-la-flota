package crud;

import utilidades.*;
import model.*;

public class CrudJugador {
	
	public CrudJugador (Jugador jugador) {
		
	}

	public void addJugador1 (String nombre) {
		System.out.println("Introduzca el nombre del jugador 1.");
		Jugador jugador1=new Jugador (nombre=Leer.dato());
		
	}
	
	public void addJugador2 (String nombre) {
		System.out.println("Introduzca el nombre del jugador 2.");
		
	}
}
