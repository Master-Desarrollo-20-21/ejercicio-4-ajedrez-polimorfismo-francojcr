package es.escuelait.poo.practica3;

class Board {

	static final String rowSeparator = "-----------------";
	static final String columnSeparator = "|";
	Square[][] squares;
	private Player[] players;
	private Turn turno;
	Console console;
	
	public Board(int numRows, int numColumns) {
		squares = new Square[numRows][numColumns];
        players = new Player[2];
        players[0] = new Player(Piece.validColor.WHITE);
        players[1] = new Player(Piece.validColor.BLACK);		
		turno = new Turn(0);
		console = new Console();
		
		for (int i=0;i<numRows;i++) {
			for (int j=0;j<numColumns;j++) {
				squares[i][j] = new Square(i,j);
			}
		}
		
		for (int i=0;i<numColumns;i++) {
			squares[1][i].putPiece(new Pawn(Piece.validColor.BLACK));
		}
		for (int i=0;i<numColumns;i++) {
			squares[6][i].putPiece(new Pawn(Piece.validColor.WHITE));
		}
	}

	public boolean isFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	public void play() {

		this.move(players[turno.turn()]);
		
	}

	public void show() {
		Console console = new Console();

		for (int i=0;i<squares.length;i++) {
			console.out(rowSeparator+"\n");
			for (int j=0;j<squares[i].length;j++) {
				console.out(columnSeparator);
				squares[i][j].show();
			}
			console.out(columnSeparator+"\n");
		}
	}
	
	public boolean isTaken(int posRow, int posColumn) {
		
		return this.squares[posRow][posColumn].getPiece() != null;
	}

	private void move(Player player) {
		Square from = new Square();
		Square to = new Square();
		Piece piece;
		
        do {
			player.show();
			do {
				console.out("\nCasilla desde\n");
				from.getFromUser();
			} while (!isValidSquare(from,player));
			
			console.out("Casilla hasta\n");
			do {
				console.out("\nCasilla desde\n");
				to.getFromUser();
			} while (!isValidSquare(from,player));
			
			piece = squares[from.getPosRow()][from.getPosColumn()].getPiece();
			
			if (piece == null) {
				console.out("No exite pieza en la casilla desde\n");
			}
			
        } while (!(piece != null && piece.isValidaMove(player,from, to)));
	}
	
	private boolean isValidSquare(Square from, Player player) {
		
		if (from.getPosRow() < 0 || from.getPosRow() > squares.length) {
			console.out("Fila fuera de rango\n");
			return false;
		}

		if (from.getPosColumn() < 0 || from.getPosColumn() > squares[from.getPosRow()].length) {
			console.out("Columna fuera de rango\n");
			return false;
		}
		
		return true;
	}
	
}
