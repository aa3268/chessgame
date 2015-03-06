package chess;

import java.util.Vector;

public class Bishop extends Piece{

	public String getColor(){
		return this.color;
	}
	
	@Override
	public void possibleMove(Position s)
	{
		Position spot;
		s.p.available = new Vector<Position>();
		
		//Southeast diagonal
		spot = new Position();
		for(int i = s.x+1, j = s.y+1; i < 8 && j < 8; i++, j++){
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
		}
		//Northeast diagonal
		spot = new Position();
		for(int i = s.x+1, j = s.y-1; i < 8 && j > -1; i++, j--){
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
		}
		//Northwest diagonal
		spot = new Position();
		for(int i = s.x-1, j = s.y-1; i > -1 && j > -1; i--, j--){
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
		}
		//Southwest diagonal
		spot = new Position();
		for(int i = s.x-1, j = s.y+1; i > -1 && j < 8; i--, j++){
			spot.x = i;
			spot.y = j;
			s.p.available.add(spot);
		}
	}
}
