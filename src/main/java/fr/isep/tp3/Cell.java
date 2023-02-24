package fr.isep.tp3;

import fr.isep.tp3.piece.Piece;
import lombok.Getter;
import lombok.Setter;

public class Cell {
	
	public final Position pos;
	
	@Getter @Setter
	private Piece piece;
	
	public Cell(Position pos) {
		this.pos = pos;
	}

	public boolean isEmpty() {
		return piece == null;
	}
	
}
