package es.escuelait.poo.practica3;

class Square {

	private int	posRow;
	private int posColumn;
	private Piece piece;
	
	public Square(int posRow, int posColumn) {
		this.posRow = posRow;
		this.posColumn = posColumn;
		piece = null;
	}

	public Square() {
		piece = null;
	}

	public void putPiece(Piece inPiece) {
		this.piece = inPiece;
	}

	public void show() {
		Console console = new Console();
		
		if (piece == null) {
			console.out(" ");
		} else {
			piece.show();
		}
		
	}
	
	public void getFromUser() {
		Console console = new Console();
		
		this.posRow = console.inInt("Indique la fila:");
		this.posColumn = console.inInt("Indique la columa:");
		
		this.posRow--;
		this.posColumn--;
	}
	
	public int getPosRow() {
		return posRow;
	}

	public int getPosColumn() {
		return posColumn;
	}
	
	public Piece getPiece() {
		return piece;
	}


}
