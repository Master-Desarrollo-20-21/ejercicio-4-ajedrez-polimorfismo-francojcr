package es.escuelait.poo.practica3;

class Chess {

	final static int NUM_ROWS = 8;
	final static int NUM_COLUMNS = 8;	
	Board board;

	private void play() {

		board = new Board(NUM_ROWS,NUM_COLUMNS);

		do {
			board.show();
			board.play();
		} while (!board.isFinish());
		this.celebrate();
	}

	private void celebrate() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {

		new Chess().play();
	}

}
