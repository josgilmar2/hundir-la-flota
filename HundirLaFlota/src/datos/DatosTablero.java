package datos;

public class DatosTablero {
	
	

	private char [][] tablero={
			{' ',' ',' ',' ','0',' ',' ',' ','1',' ',' ',' ','2',' ',' ',' ','3',' ',' ',' ','4',' ',' ',' ','5',' ',' ',' ','6',' ',' ',' ','7',' ',' ',' ','8',' ',' ',' ','9'},
			{' ',' ','╔','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╦','═','═','═','╗'},
			{'A',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},
			{'B',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},
			{'C',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},
			{'D',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},  
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},       
			{'E',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},       
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},       
			{'F',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},       
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},       
			{'G',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},       
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},       
			{'H',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},
			{'I',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},
			{' ',' ','╠','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╬','═','═','═','╣'},
			{'J',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║',' ',' ',' ','║'},
			{' ',' ','╚','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╩','═','═','═','╝'}
			};
	
	public DatosTablero() {
		
	}

	public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}
	
	
		

}
