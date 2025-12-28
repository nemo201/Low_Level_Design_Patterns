package chessV1;

public class Board {
	private Cell[][] cells = new Cell[8][8];
	
	public Board() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				cells[i][j] = new Cell(new Position(i, j));
			}
		}
		initialize();
	}

	private void initialize() {
		// pawns
		for (int c = 0; c < 8; c++) {
			cells[1][c].setPiece(new Pawn(Color.BLACK));
			cells[6][c].setPiece(new Pawn(Color.WHITE));
		}
		
		//rooks
		cells[0][0].setPiece(new Rook(Color.BLACK));
		cells[0][7].setPiece(new Rook(Color.BLACK));
		cells[7][0].setPiece(new Rook(Color.WHITE));
		cells[7][7].setPiece(new Rook(Color.WHITE));
		
		//Knights
		cells[0][1].setPiece(new Knight(Color.BLACK));
		cells[0][6].setPiece(new Knight(Color.BLACK));
		cells[7][1].setPiece(new Knight(Color.WHITE));
		cells[7][6].setPiece(new Knight(Color.WHITE));
		
		//bishops
		cells[0][2].setPiece(new Bishop(Color.BLACK));
		cells[0][5].setPiece(new Bishop(Color.BLACK));
		cells[7][2].setPiece(new Bishop(Color.WHITE));
		cells[7][5].setPiece(new Bishop(Color.WHITE));
		
		//queens
		cells[0][3].setPiece(new Queen(Color.BLACK));
		cells[7][3].setPiece(new Queen(Color.WHITE));
		
		//kings
		cells[0][4].setPiece(new King(Color.BLACK));
		cells[7][4].setPiece(new King(Color.WHITE));
	}
	
	public Cell getCell(Position position) {
		return cells[position.getRow()][position.getCol()];
	}
	
}
