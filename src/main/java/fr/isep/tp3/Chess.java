package fr.isep.tp3;

import java.util.Scanner;

import fr.isep.tp3.piece.Bishop;
import fr.isep.tp3.piece.King;
import fr.isep.tp3.piece.Knight;
import fr.isep.tp3.piece.Pawn;
import fr.isep.tp3.piece.Queen;
import fr.isep.tp3.piece.Rook;

public class Chess {

	Scanner scanner;
	
	private final Cell[][] board = new Cell[8][8];
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
		for (int i=0; i<8; i++) {
			board [i] = new Cell[8];
			for (int j=0; j<8; j++) {
				board [i][j] = new Cell(new Position (i,j));
			}
		}
		for (int j=0; j<8 ; j++) {
			board[1][j].setPiece(new Pawn(false));
			board[6][j].setPiece(new Pawn(true));
		}
		fillRowPieces(board[0], false);
		fillRowPieces(board[7], true);
	}

	private void fillRowPieces(Cell[] row, boolean color) {
		row[0].setPiece(new Rook(color));
		row[1].setPiece(new Knight(color));
		row[2].setPiece(new Bishop(color));
		row[3].setPiece(color? new King(color) : new Queen(color));
		row[4].setPiece(color? new Queen(color) : new King(color));
		row[5].setPiece(new Bishop(color));
		row[6].setPiece(new Knight(color));
		row[7].setPiece(new Rook(color));
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
		System.out.println("Please enter move: ");
		scanner.nextLine();
		return null;
	}

	private void printBoard() {
		// TODO Auto-generated method stub
		for(int i=0; i<8;i++) {
			
			for(int j=0; j<8; j++) {
				
				if(board[i][j].isEmpty()) {
					System.out.print("  ");
				}
				else {
					System.out.print(board[i][j].getPiece().name());
				}
				System.out.print("|");
			}
			System.out.println();
			for(int j=0; j<8; j++) {
				System.out.print("--+");
			}
			System.out.println();
		}
	}

	private boolean isCheckMate() {
		// TODO Auto-generated method stub
		return false;
	}

}
