package model;

public class Jugador {
	
	//ATRIBUTOS
	private String nombre;
	private double puntuacion;
	
	//CONSTRUCTOR
	public Jugador(String nombre, double puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	

}
