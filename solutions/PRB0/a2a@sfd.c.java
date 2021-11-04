package game;

import java.util.*;

public class Main {
	
	/*
	 * ROWS - The # of rows on the board.
	 * COLS - The # of columns on the board.
	 * board - The game board. 
	 */
	static int ROWS = 7;
	static int COLS = 7;
	static int NUM_SHIPS = 5;
	static int SHIP_SIZE = 4;
	static int[][] board = new int[COLS][ROWS];
	static int[][] shownBoard = new int[COLS][ROWS];
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int hitsLeft = setUpGame();
		int startingHits = hitsLeft;
		int numGuesses = 0;
		boolean hit;
		// Loop until all ships have been sunk
		while (hitsLeft > 0) {
			int[] targetCoords = askUserForTarget();
			numGuesses++;
			hit = fireShot(targetCoords);
			if (hit) {
				hitsLeft--;
			}
		}
		finishGame(numGuesses, startingHits);
	}
	
	/*
	 * Fires a shot at the given x and y coordinates.
	 * Returns true if something is hit, false if nothing is hit.
	 */
	private static boolean fireShot(int[] targetCoords) {
		// Check if coordinate has already been fired upon
		if (shownBoard[targetCoords[0]][targetCoords[1]] != 0) {
			System.out.printf("Already tried %c%d!\n", getChar(targetCoords[0] + 1), targetCoords[1] + 1);
			return false;
		}
		if (board[targetCoords[0]][targetCoords[1]] == 1) {
			// Hit
			shownBoard[targetCoords[0]][targetCoords[1]] = 1;
			System.out.printf("%c%d hit!\n", getChar(targetCoords[0] + 1), targetCoords[1] + 1);
			return true;
		} else {
			// Miss
			shownBoard[targetCoords[0]][targetCoords[1]] = 2;
			System.out.printf("%c%d missed!\n", getChar(targetCoords[0] + 1), targetCoords[1] + 1);
			return false;
		}
	}
	
	/*
	 * Asks the user for a x and y coordinate to fire on.
	 * Returns the x and y coordinates that the user picked.
	 */
	private static int[] askUserForTarget() {
		printBoard();
		while (true) {
			System.out.println("Please enter the coordinates you'd like to fire on (Example: C4).");
			System.out.println("Type 'h' for special commands.");
			String coords = s.next();
			if (coords.equalsIgnoreCase("h")) {
				System.out.println("Special commands:");
				System.out.println("'p' - Print the board again, in case it goes off the screen");
				System.out.println("'i' - Gives you useful information, like the # of starting ships and ship size");
				System.out.println("'r' - Chooses random coordinates for you");
				System.out.println("\"cheat\" - Prints the debug board, with all the ship locations");
				continue;
			} else if (coords.equalsIgnoreCase("p")) {
				printBoard();
				continue;
			} else if (coords.equalsIgnoreCase("i")) {
				System.out.printf("Board size: %d x %d\n", COLS, ROWS);
				System.out.printf("# of starting ships: %d\n", NUM_SHIPS);
				System.out.printf("Ship size: %d\n", SHIP_SIZE);
				continue;
			} else if (coords.equalsIgnoreCase("r")) {
				int[] randCoords = new int[2];
				do {
					randCoords[0] = randRange(0, COLS);
					randCoords[1] = randRange(0, ROWS);
				} while (shownBoard[randCoords[0]][randCoords[1]] != 0);
				return randCoords;
			} else if (coords.equalsIgnoreCase("cheat")) {
				printDebugBoard();
				continue;
			}
			int[] intCoords = new int[2];
			intCoords[0] = getInt(coords.charAt(0)) - 1;
			// Lots of input checking to make sure it's valid
			if (coords.length() > 3 || coords.length() < 2) {
				System.out.println("Invalid length!");
				continue;
			}
			if (intCoords[0] >= COLS || intCoords[0] < 0) {
				System.out.println("Invalid column!");
				continue;
			}
			if (!Character.isDigit(coords.charAt(1))) {
				System.out.println("Invalid row!");
				continue;
			}
			if (coords.length() == 3 && !Character.isDigit(coords.charAt(2))) {
				System.out.println("Invalid row!");
				continue;
			}
			intCoords[1] = Integer.decode(coords.substring(1)) - 1;
			if (intCoords[1] >= ROWS || intCoords[1] < 0) {
				System.out.println("Invalid row!");
				continue;
			}
			return intCoords;
		}
	}
	
	/*
	 * Prints the debug board to the console in a grid-shaped style.
	 */
	private static void printDebugBoard() {
		System.out.print(" ");
		if (ROWS > 9) {
			System.out.print(" ");
		}
		for (int x = 0; x < COLS; x++) {
			System.out.print(" " + getChar(x + 1));
		}
		System.out.println();
		for (int y = 0; y < ROWS; y++) {
			if (ROWS > 9 && y < 9) {
				System.out.print(" ");
			}
			System.out.print(y + 1);
			for (int x = 0; x < COLS; x++) {
				switch (board[x][y]) {
				case 0:
					System.out.print("  ");
					break;
				case 1:
					System.out.print(" X");
					break;
				default:
					System.out.print(" " + shownBoard[x][y]);
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Prints the board to the console in a grid-shaped style.
	 */
	private static void printBoard() {
		System.out.print(" ");
		if (ROWS > 9) {
			System.out.print(" ");
		}
		for (int x = 0; x < COLS; x++) {
			System.out.print(" " + getChar(x + 1));
		}
		System.out.println();
		for (int y = 0; y < ROWS; y++) {
			if (ROWS > 9 && y < 9) {
				System.out.print(" ");
			}
			System.out.print(y + 1);
			for (int x = 0; x < COLS; x++) {
				switch (shownBoard[x][y]) {
				case 0:
					System.out.print("  ");
					break;
				case 1:
					System.out.print(" X");
					break;
				case 2:
					System.out.print(" -");
					break;
				default:
					System.out.print(" " + shownBoard[x][y]);
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Gets the character associated with the given number (1=A, 2=B, etc).
	 */
	private static char getChar(int n) {
		// 65 is the unicode value of the character 'A', minus one because 1=A
		return Character.toChars(64 + n)[0];
	}
	
	/*
	 * Gets the number associated with the given character (A=1, B=2, etc).
	 */
	private static int getInt(char c) {
		// 10 is the numeric value of the character 'A', minus nine so that A=1
		return Character.getNumericValue(c) - 9;
	}
	
	/*
	 * Sets up the game by choosing random locations for the ships to be in.
	 * Returns the # of cells with a ship placed on them (the # of hits needed to win).
	 */
	private static int setUpGame() {
		System.out.println("Setting up the game...");
		// Make sure given values are not invalid
		if (COLS > 26) {
			System.out.println("Too many columns! Maximum # of columns is 26.");
			System.exit(1);
		}
		if (ROWS > 99) {
			System.out.println("Too many rows! Maximum # of columns is 99.");
			System.exit(1);
		}
		int attemptsLeft = 50;
		int chosenx, choseny;
		boolean alreadyTaken;
		for (int i = 0; i < NUM_SHIPS; i++) {
			if (attemptsLeft == 0) {
				// Loop has run too many times; board is probably full
				System.out.printf("%d ship(s) with ship length %d set up!\n", i, SHIP_SIZE);
				System.out.printf("Warning: %d ship(s) not placed due to a full board\n", NUM_SHIPS - i);
				return SHIP_SIZE * i;
			}
			if (Math.random() < 0.5) {
				// Vertical ship
				chosenx = randRange(0, COLS);
				choseny = randRange(0, ROWS - SHIP_SIZE + 1);
				// Check if board is big enough to fit given vertical ship size
				if (choseny == -1) {
					attemptsLeft--;
					i--;
					continue;
				}
				// Check if chosen spots are already occupied
				alreadyTaken = false;
				for (int j = 0; j < SHIP_SIZE; j++) {
					if (board[chosenx][choseny + j] != 0) {
						alreadyTaken = true;
						break;
					}
				}
				if (!alreadyTaken) {
					// Spots are free; take them
					for (int j = 0; j < SHIP_SIZE; j++) {
						board[chosenx][choseny + j] = 1;
					}
					attemptsLeft = 50;
				} else {
					// No ship placed; try again
					i--;
				}
			} else {
				// Horizontal ship
				chosenx = randRange(0, COLS - SHIP_SIZE + 1);
				choseny = randRange(0, ROWS);
				// Check if board is big enough to fit given horizontal ship size
				if (chosenx == -1) {
					attemptsLeft--;
					i--;
					continue;
				}
				// Check if chosen spots are already occupied
				alreadyTaken = false;
				for (int j = 0; j < SHIP_SIZE; j++) {
					if (board[chosenx + j][choseny] != 0) {
						alreadyTaken = true;
						break;
					}
				}
				if (!alreadyTaken) {
					// Spots are free; take them
					for (int j = 0; j < SHIP_SIZE; j++) {
						board[chosenx + j][choseny] = 1;
					}
					attemptsLeft = 50;
				} else {
					// No ship placed; try again
					i--;
				}
			}
			attemptsLeft--;
		}
		System.out.printf("%d ship(s) with ship length %d set up!\n", NUM_SHIPS, SHIP_SIZE);
		return SHIP_SIZE * NUM_SHIPS;
	}
	
	/*
	 * Finishes the game by leaving the user with a nice message.
	 */
	private static void finishGame(int guessCount, int startingCount) {
		printBoard();
		System.out.printf("It took you %d guesses to sink all the ships.\n", guessCount);
		System.out.printf("There were %d cells containing ships at the beginning.\n", startingCount);
		System.out.printf("Your shot efficiency is %.0f", (float) startingCount / (float) guessCount * 100);
		System.out.println("%. Nice job!");
		System.out.println("Thanks for playing! :)");
	}
	
	/*
	 * Returns a random integer from a to b, not including b.
	 * If given range is invalid, returns a - 1.
	 */
	private static int randRange(int a, int b) {
		if (b <= a) {
			return a - 1;
		}
		return (int) Math.floor(Math.random() * (b - a));
	}

}
