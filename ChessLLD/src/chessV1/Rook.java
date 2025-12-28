package chessV1;

public class Rook extends Piece{
	public Rook(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position from, Position to) {
		return from.getRow() == to.getRow() || from.getCol() == to.getCol();
	}
	
}
