package fr.isep.tp3.piece;

public class Pawn extends Piece {

	public Pawn(boolean color) {
		super(color);
	}

	@Override
	public String name() {
		return "P"+colorName();
	}
	
}
