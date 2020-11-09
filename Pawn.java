package es.escuelait.poo.practica3;

class Pawn extends Piece {

	public Pawn( validColor color) {
		super('p',color);
	}

	@Override
	protected void move(Square from, Square to) {
		
		
	}

	@Override
	protected boolean isValidaMove(Player player, Square from, Square to) {
		
		if (this.getPlayer() != player.color()) {
			Console console = new Console();
			
			console.out("La pieza no pertence al jugador\n");
			return false;
		}
		
		if (from.getPosColumn() == to.getPosColumn()) {
			if (this.color == validColor.WHITE) {
				if (from.getPosRow() == 7) {
					if ((from.getPosRow() != to.getPosRow() - 1) && (from.getPosRow() != to.getPosRow() - 2)) {
						return false;
					}					
				} else {
					if (from.getPosRow() != to.getPosRow() - 1) {
						return false;
					}
				}
			} else {
				if (from.getPosRow() == 2) {
					
				} else {
					
				}			
			}		
		} else {
			
		}		
		
	    return true;
	}

	
}
