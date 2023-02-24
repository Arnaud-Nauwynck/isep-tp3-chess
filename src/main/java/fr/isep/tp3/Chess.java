package fr.isep.tp3;

public class Chess {

	private Cell[][] board;
	private Player[] players;
	private Player currentPlayer;

	// On decrit brievement la logique du jeu
	public void play() {
		while (true) {
			createPlayers();
			initialiseBoard();
			while (!isCheckMate()) {
				printBoard();
				String move;
				do {
					move = askMove();
				} while (!isValidMove(move));
				updateBoard(move);
				switchPlayer();
			}
		}
	}

	private void switchPlayer() {
		// TODO Auto-generated method stub
		
	}

	private void updateBoard(String move) {
		// TODO Auto-generated method stub
		
	}

	private boolean isValidMove(String move) {
		// TODO Auto-generated method stub
		return false;
	}

	private String askMove() {
		// TODO Auto-generated method stub
		return null;
	}

	private void printBoard() {
		// TODO Auto-generated method stub
		
	}

	private boolean isCheckMate() {
		// TODO Auto-generated method stub
		return false;
	}

	private void initialiseBoard() {
		// TODO Auto-generated method stub
		
	}

	private void createPlayers() {
		// TODO Auto-generated method stub
		
	}
}
