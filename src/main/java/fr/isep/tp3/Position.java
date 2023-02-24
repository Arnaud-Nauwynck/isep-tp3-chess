package fr.isep.tp3;

public class Position {

	public final int row;
	public final int column;
	public final String positionName;
	
	public static String rowToString(int row) {
		return ""+(8-row);
	}
	public static String columnToString(int column) {
		return ""+('a'+ column);
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
		this.positionName = columnToString(column) + rowToString(row);
	}
	
}

