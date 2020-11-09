package es.escuelait.poo.practica3;

public class Player {

	private Piece.validColor color;
	
    public Player(Piece.validColor color) {
        this.color = color;
    }
    
    public Piece.validColor color() {
        return color;
    }

	public void show() {
		Console console = new Console();
		
		console.out("Jugador " + this.color.toString());
		
	}    
    
}
