package controller;

import datos.*;
import model.*;

public class ControllerBarco {
	
	public void colocarBarcos (DatosTablero [][]tablero, Barco b, int fila, int columna, int orientacion) {
		for (int i=0;i<tablero.length;i++) {
			for (int j=0; j<tablero[i].length;j++) {
				if (i==fila && j==columna) {
					for (int longitud = 0; longitud<b.getLongitud(); longitud++, j++) {
						
						System.out.println(b.getLongitud()+"O");
					}
				}else {
					System.out.println(tablero[i][j]+" ");
				}
			}
			
			System.out.println(" ");
		}
	}

}
