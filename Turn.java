package es.escuelait.poo.practica3;

public class Turn {
	
	   private int value;

	    public Turn(int firstPlayer) {
	    	value = firstPlayer;
	    }

	    public int turn() {
	        return value;
	    }

	    public int noTurn() {
	        return (value + 1) % 2;
	    }

	    public void change() {
	    	value = this.noTurn();
	    }
    
}
