package model;

//ESTA CLASE SIRVE PARA GENERAR LOS OBJETOS BARCO. COGERÁ LOS DATOS DE LA CLASE DatosBarco.
//POSTERIORMENTE SE PASAN ESTOS OBJETOS A LA DAT

public class Barco {
	
	//ATRIBUTOS
	private String nombre;
	private int longitud;
	private int orientacion;
	private int fila;
	private int columna;
	
	//CONSTRUCTOR
	public Barco(String nombre, int longitud, int fila, int columna, int orientacion) {
		
		this.fila = fila;
		this.columna = columna;
		this.orientacion = orientacion;
	}
	
	//GETTERS AND SETTERS

	public int getLongitud() {
		return longitud;
	}

	public int getOrientacion() {
		
		return orientacion;
	}

	public void setOrientacion(int orientacion) {
		this.orientacion = orientacion;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	
	

}
