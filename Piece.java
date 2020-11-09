package es.escuelait.poo.practica3;

abstract  class Piece {
	
	public static enum validColor {WHITE,BLACK};
	
	protected  char symbol;
	protected validColor color;
	
	protected Piece(char symbol, validColor color) {
		
		if (color == validColor.WHITE) {
		  this.symbol = symbol;
		} else {
		  this.symbol = Character.toUpperCase(symbol);			
		}
			
		this.color = color;
	}

	protected void show() {
		Console console = new Console();
		
		console.out(symbol);
	}
	
	protected abstract void move(Square from, Square to);

	public validColor getPlayer() {		
		return color;
	}

	protected abstract boolean isValidaMove(Player player, Square from, Square to);

	
}
