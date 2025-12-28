package chessV1;

public class Cell {
	private Position position;
	private Piece piece;
	
	public Cell(Position position) {
		this.position = position;
	}
	
	public boolean isEmpty() {
		return piece == null;
	}
	
	public Piece getPiece() {
		return piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}
