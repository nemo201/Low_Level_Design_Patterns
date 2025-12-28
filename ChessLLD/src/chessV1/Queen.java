package chessV1;

public class Queen extends Piece{
	public Queen(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position from, Position to) {
		return new Rook(color).canMove(board, from, to) || new Bishop(color).canMove(board, from, to);
	}
}
