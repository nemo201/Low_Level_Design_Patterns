package chessV1;

public class Pawn extends Piece{
	
	Pawn(Color color) {
		super(color);
	}

	@Override
	public boolean canMove(Board board, Position from, Position to) {
		int direction = (this.color == Color.WHITE) ? 1 : -1;
		return from.getCol() == to.getCol() && to.getRow() - from.getRow() == direction && board.getCell(to).isEmpty();
	}

}
