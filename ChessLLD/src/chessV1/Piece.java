package chessV1;

public abstract class Piece {
	protected Color color;
	
	protected Piece(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract boolean canMove(Board board, Position from, Position to);
}
