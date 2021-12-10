package vista;

import utilidades.Leer;

public class ImprimirMenu {
	
	public void imprimirMenu () {
		
		System.out.println("Opciones:"
				+ "\n1. Jugar"
				+ "\n2. Instrucciones"
				+ "\n3. Salir");
		
		
	}
	public void imprimirSubmenu () {
		System.out.println("Ha seleccionado usted la opción jugar. ¿Qué modo de juego desea?"
				+ "\n1. Player vs Player"
				+ "\n2. Player vs CPU");
	}
	

}
