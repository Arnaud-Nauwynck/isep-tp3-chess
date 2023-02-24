package fr.isep.tp3.piece;

public class Rook extends Piece {

	public Rook(boolean color) {
		super(color);
	}
	

	@Override
	public String name() {
		return "R"+colorName();
	}

}

