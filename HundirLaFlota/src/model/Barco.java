package model;

public class Barco {
	
	//ATRIBUTOS
	private int longitud;
	private String nombre;
	
	//CONSTRUCTOR
	public Barco(int longitud, String nombre) {
		this.longitud = longitud;
		this.nombre = nombre;
	}
	
	//GETTERS AND SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
