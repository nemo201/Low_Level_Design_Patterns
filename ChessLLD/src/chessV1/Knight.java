package chessV1;

public class Knight extends Piece {
	public Knight(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position from, Position to) {
		int rowDiff = Math.abs(from.getRow() - to.getRow());
		int colDiff = Math.abs(from.getCol() - to.getCol());
		return rowDiff * colDiff == 2;
	}
	
	
}
