package vista;

import utilidades.Leer;
import datos.*;

public class ImprimirTablero {
	
	
	public void imprimirTablero() {	
		
		DatosTablero tablero= new DatosTablero ();
		
		for(char[] chars : tablero.getTablero()) {
			
			System.out.printf(" ");
			System.out.println(chars);
			
		}
	}
	
	

	
	
}
