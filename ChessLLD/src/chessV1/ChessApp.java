package chessV1;

public class ChessApp {
	public static void main(String[] args) {
		Board board = new Board();
		Position fromPawn = new Position(6, 0);
        Position toPawn = new Position(5, 0);

		Piece pawn = board.getCell(fromPawn).getPiece();
		System.out.println("Pawn move valid: " + pawn.canMove(board, fromPawn, toPawn));
		
		Position fromRook = new Position(7, 0);
        Position toRook = new Position(7, 5);

        Piece rook = board.getCell(fromRook).getPiece();
        System.out.println("Rook move valid: " +
                rook.canMove(board, fromRook, toRook));

        // 4️⃣ Test knight move (WHITE knight from (7,1) to (5,2))
        Position fromKnight = new Position(7, 1);
        Position toKnight = new Position(5, 2);

        Piece knight = board.getCell(fromKnight).getPiece();
        System.out.println("Knight move valid: " +
                knight.canMove(board, fromKnight, toKnight));

        // 5️⃣ Test invalid bishop move (WHITE bishop from (7,2) to (6,2))
        Position fromBishop = new Position(7, 2);
        Position toBishop = new Position(6, 2);

        Piece bishop = board.getCell(fromBishop).getPiece();
        System.out.println("Bishop move valid: " +
                bishop.canMove(board, fromBishop, toBishop));
	}
}
