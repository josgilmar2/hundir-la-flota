package model;

//ESTA CLASE VA A GENERAR LOS OBJETOS DISPARO. POSTERIORMENTE PASARÁ A LA CLASE DATOSDISPARO. 

public class Disparo {
	
	//ATRIBUTOS
	
	private int x;
	private int y;
	private int tipoDisparo;
	
	//CONSTRUCTOR
	
	public Disparo(int x, int y, int tipoDisparo){
		
		this.x=x;
		this.y=y;
		this.tipoDisparo=tipoDisparo;
		
	}
	
	//GETTERS Y SETTERS

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTipoDisparo() {
		return tipoDisparo;
	}

	public void setTipoDisparo(int tipoDisparo) {
		this.tipoDisparo = tipoDisparo;
	}
	
	

}
