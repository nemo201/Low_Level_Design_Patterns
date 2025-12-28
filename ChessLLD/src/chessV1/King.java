package chessV1;

public class King extends Piece {
	public King(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position from, Position to) {
		return Math.abs(from.getRow() - to.getRow()) <= 1 && Math.abs(from.getCol() - to.getCol()) <= 1;
	}

}
