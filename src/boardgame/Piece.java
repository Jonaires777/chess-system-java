package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	//public Piece[][] possibleMoves() {
	//	return
	//}

	//public boolean possibleMove(Position position) {
	//	return 
	//}

	//public boolean isThereAnyPossibleMove() {
	//	return
	//}
}
