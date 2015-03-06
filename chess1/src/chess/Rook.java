package chess;

import java.util.Vector;

public class Rook extends Piece{
	
	public String getColor(){
		return this.color;
	}
	
	@Override
	public void possibleMove(Position s)
	{
		Position spot;
		s.p.available = new Vector<Position>();
		
		spot = new Position();
		for(int i = s.y; i < 8; i++){
			spot.x = s.x;
			spot.y = i+1;
			s.p.available.add(spot);
		}
		spot = new Position();
		for(int i = s.y; i > -1; i--){
			spot.x = s.x;
			spot.y = i;
			s.p.available.add(spot);
		}
		spot = new Position();
		for(int i = s.x; i < 8; i++){
			spot.y = s.y;
			spot.x = i+1;
			s.p.available.add(spot);
		}
		spot = new Position();
		for(int i = s.x; i > -1; i--){
			spot.y = s.y;
			spot.x = i;
			s.p.available.add(spot);
		}
	}
}
