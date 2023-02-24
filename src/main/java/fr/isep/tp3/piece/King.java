package fr.isep.tp3.piece;

public class King extends Piece {

	public King(boolean color) {
		super(color);
	}

	@Override
	public String name() {
		return "K"+colorName();
	}

}

