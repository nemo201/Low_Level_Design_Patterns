package chessV1;

public class Bishop extends Piece{
	public Bishop(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position from, Position to) {
		return Math.abs(from.getRow() - to.getRow()) == Math.abs(from.getCol() - to.getCol());
	}
	
	
}
