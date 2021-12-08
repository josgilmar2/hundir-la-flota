package model;

//ESTA CLASE SIRVE PARA GENERAR LOS OBJETOS BARCO. COGERÁ LOS DATOS DE LA CLASE DatosBarco.
//POSTERIORMENTE SE PASAN ESTOS OBJETOS A LA DAT

public class Barco {
	
	//ATRIBUTOS
	private String nombre;
	private int longitud;
	private int orientacion;
	private int posicionx;
	private int posiciony;
	
	//CONSTRUCTOR
	public Barco(String nombre, int longitud, int posicionx, int posiciony, int orientacion) {
		
		this.posicionx = posicionx;
		this.posiciony = posiciony;
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
