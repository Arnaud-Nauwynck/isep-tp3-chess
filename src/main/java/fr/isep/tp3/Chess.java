package fr.isep.tp3;

import java.util.Scanner;

public class Chess {

	Scanner scanner;
	
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

	private void createPlayers() {
		this.scanner = new Scanner(System.in);
		System.out.println("Please enter name of player 1: ");
		String player1Name = scanner.nextLine();
		System.out.println("Please enter name of player 2: ");
		String player2Name = scanner.nextLine();
		Player player1 = new Player(player1Name, true);
		Player player2 = new Player(player2Name, false);
		System.out.println("initializing game '" + player1Name + "' against '" + player2Name + "'");
		this.players = new Player[] { player1, player2 };
		this.currentPlayer = player1;
	}
	

	private void initialiseBoard() {
		
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

}
