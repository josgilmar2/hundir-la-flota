package model;

//ESTA CLASE SIRVE PARA GENERAR LOS OBJETOS BARCO. COGERÁ LOS DATOS DE LA CLASE DatosBarco.
//POSTERIORMENTE SE PASAN ESTOS OBJETOS A LA DAT

public class Barco {
	
	//ATRIBUTOS
	private int longitud;
	private String orientacion;
	private int posicionx;
	private int posiciony;
	
	//CONSTRUCTOR
	public Barco(int posicionx, int posiciony, int longitud, String orientacion) {
		
		this.posicionx = posicionx;
		this.posiciony = posiciony;
		this.longitud = longitud;
		this.orientacion = orientacion;
	}
	
	//GETTERS AND SETTERS

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public int getPosicionx() {
		return posicionx;
	}

	public void setPosicionx(int posicionx) {
		this.posicionx = posicionx;
	}

	public int getPosiciony() {
		return posiciony;
	}

	public void setPosiciony(int posiciony) {
		this.posiciony = posiciony;
	}
	
	
	

}
