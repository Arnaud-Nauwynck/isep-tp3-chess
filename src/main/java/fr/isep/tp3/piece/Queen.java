package fr.isep.tp3.piece;

public class Queen extends Piece {

	public Queen(boolean color) {
		super(color);
	}
	

	@Override
	public String name() {
		return "Q"+colorName();
	}

}

