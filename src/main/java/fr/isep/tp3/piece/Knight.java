package fr.isep.tp3.piece;

public class Knight extends Piece {

	public Knight(boolean color) {
		super(color);
	}

	@Override
	public String name() {
		return "N"+colorName();
	}

}

