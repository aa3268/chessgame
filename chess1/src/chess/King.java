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

public class King extends Piece{
	
	public String getColor(){
		return this.color;
	}
	
	public static void getPositions(Position s)
	{
		Position spot;
		s.p.available = new Vector<Position>();
		
		spot = new Position();	// North
		spot.y = s.y - 1;
		spot.x = s.x ;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
	
		spot = new Position();	// NorthEast
		spot.y = s.y - 1;
		spot.x = s.x + 1;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1) ){
			s.p.available.add(spot);
		}
		
		spot = new Position();	// East
		spot.y = s.y;
		spot.x = s.x + 1;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
		
		spot = new Position();	// SouthEast
		spot.y = s.y + 1;
		spot.x = s.x + 1;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
		
		spot = new Position();	// South 
		spot.y = s.y + 1;
		spot.x = s.x;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
		
		spot = new Position();	// SouthWest 
		spot.y = s.y + 1;
		spot.x = s.x - 1;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
		
		spot = new Position();	// West 
		spot.y = s.y;
		spot.x = s.x - 1;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
		
		spot = new Position();	// NorthWest 
		spot.y = s.y - 1;
		spot.x = s.x - 1;
		if((Math.abs(spot.y-s.y) <=1) && (Math.abs(spot.x-s.x) <=1) && (spot.y != 8) && (spot.x != 8)  && (spot.y != -1) && (spot.x != -1)){
			s.p.available.add(spot);
		}
	}
	
	
}
