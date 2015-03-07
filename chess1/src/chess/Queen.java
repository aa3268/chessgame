package chess;

import java.util.Vector;

/*
 * Graph Layout:
 * 
	0
	1
	2
	3
	4
	5
	6
	7/0 1 2 3 4 5 6 7
 *
 */

public class Queen extends Piece{
	
	public String getColor(){
		return this.color;
	}

	public static void getPositions(Position s)
	{
		s.p.available = new Vector<Position>();
		
		// -----------------  Bishop Moves  ------------------------
		
		//Southeast diagonal
		for(int i = s.x+1, j = s.y+1; i < 8 && j < 8; i++, j++){
			Position spot = new Position();
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
			System.out.println("bishop:southeast: "+"x="+spot.x+" y="+spot.y);
		}
		//Southwest diagonal
		for(int i = s.x-1, j = s.y+1; i > -1 && j < 8; i--, j++){
			Position spot = new Position();
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
			System.out.println("bishop:southwest: "+"x="+spot.x+" y="+spot.y);
		}
		//Northeast diagonal
		for(int i = s.x+1, j = s.y-1; i < 8 && j > -1; i++, j--){
			Position spot = new Position();
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
			System.out.println("bishop:northeast: "+"x="+spot.x+" y="+spot.y);
		}
		//Northwest diagonal
		for(int i = s.x-1, j = s.y-1; i > -1 && j > -1; i--, j--){
			Position spot = new Position();
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
			System.out.println("bishop:northwest: "+"x="+spot.x+" y="+spot.y);
		}
		
		
		
		// -----------------  Rook Moves  ------------------------
		Position spot = new Position();
		spot.x = s.x;
		spot.y = s.y;
		
		// All North
		while(spot.y > 0){
			Position spotValid = new Position();
			spotValid.x = spot.x;
			spotValid.y = --spot.y;
			s.p.available.add(spotValid);
			System.out.println("rook:north: "+"x="+spotValid.x+" y="+spotValid.y);
		}
		
		spot.x = s.x;
		spot.y = s.y;
		
		//All South
		while(spot.y < 7){
			Position spotValid = new Position();
			spotValid.x = spot.x;
			spotValid.y = ++spot.y;
			s.p.available.add(spotValid);
			System.out.println("rook:south: "+"x="+spotValid.x+" y="+spotValid.y);
		}
		
		spot.x = s.x;
		spot.y = s.y;
		
		//All East
		while(spot.x < 7){
			Position spotValid = new Position();
			spotValid.x = ++spot.x;
			spotValid.y = spot.y;
			s.p.available.add(spotValid);
			System.out.println("rook:east: "+"x="+spotValid.x+" y="+spotValid.y);
		}
		
		spot.x = s.x;
		spot.y = s.y;
		
		//All West
		while (spot.x > 0){
			Position spotValid = new Position();
			spotValid.x = --spot.x;
			spotValid.y = spot.y;
			s.p.available.add(spotValid);
			System.out.println("rook:west: "+"x="+spotValid.x+" y="+spotValid.y);
		}
		
	}
}
