//Comment

package chess;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ButtonBorder extends JPanel {
	  private static final int N = 8;
	  private static final int SIZE = 75;
      
	  public ButtonBorder() {
		    super(new GridLayout(N, N));
		        this.setPreferredSize(new Dimension(N * SIZE, N * SIZE));
		final Position[][] p = new Position[8][8];
		setLayout(new GridLayout(0, 8, 0, 0));
		
		Piece b;
		//Position s;
		
		JButton RB = new JButton("2");
		add(RB);
		b = new Piece();
		b.button = RB;
		b.color = "Black";
		b.ident = "Rook";
		//p[0][0] = b;
		JButton KnB = new JButton("3");
		add(KnB);
		b = new Piece();
		b.button = KnB;
		b.color = "Black";
		b.ident = "Knight";
		//p[0][1] = b;
		
		JButton BB = new JButton("4");
		add(BB);
		b = new Piece();
		b.button = BB;
		b.color = "Black";
		b.ident = "Bishop";
		//p[0][2] = b;

		JButton QB = new JButton("5");
		add(QB);
		b.button = QB;
		b = new Piece();
		b.color = "Black";
		b.ident = "Queen";
		//p[0][3] = b;
		
		JButton KB = new JButton("6");
		add(KB);
		b.button = KB;
		b = new Piece();
		b.color = "Black";
		b.ident = "King";
		//p[0][3] = b;
		
		JButton BB_1 = new JButton("4");
		add(BB_1);
		b.button = BB_1;
		b = new Piece();
		b.color = "Black";
		b.ident = "Bishop";
		//p[0][5] = b;
		
		JButton KnB_1 = new JButton("3");
		add(KnB_1);
		b = new Piece();
		b.button = KnB_1;
		b.color = "Black";
		b.ident = "Knight";
		//p[0][6] = b;
		
		JButton RB_1 = new JButton("2");
		add(RB_1);
		b = new Piece();
		b.button = RB_1;
		b.color = "Black";
		b.ident = "Rook";
		//p[0][7] = b;
		
		
		JButton PB_1 = new JButton("1");
		add(PB_1);
		
		JButton PB_2 = new JButton("1");
		add(PB_2);
	
		JButton PB_3 = new JButton("1");
		add(PB_3);
		
		JButton PB_4 = new JButton("1");
		add(PB_4);
		
		JButton PB_5 = new JButton("1");
		add(PB_5);
	
		JButton PB_6 = new JButton("1");
		add(PB_6);
	
		JButton PB_7 = new JButton("1");
		add(PB_7);
		
		JButton PB_8 = new JButton("1");
		add(PB_8);
	
		
		JButton e1 = new JButton("");
		add(e1);
		
		JButton e2 = new JButton("");
		add(e2);
		
		JButton e3 = new JButton("");
		add(e3);
		
		JButton e4 = new JButton("");
		add(e4);
		
		JButton e5 = new JButton("");
		add(e5);
		
		JButton e6 = new JButton("");
		add(e6);
		
		JButton e7 = new JButton("");
		add(e7);
		
		JButton e8 = new JButton("");
		add(e8);
		
		JButton e9 = new JButton("");
		add(e9);
		
		JButton e10 = new JButton("");
		add(e10);
		
		JButton e11 = new JButton("");
		add(e11);
		
		JButton e12 = new JButton("");
		add(e12);
		
		JButton e13 = new JButton("");
		add(e13);
		
		JButton e14 = new JButton("");
		add(e14);
		
		JButton e15 = new JButton("");
		add(e15);
		
		JButton e16 = new JButton("");
		add(e16);
		
		JButton e17 = new JButton("");
		add(e17);
		
		JButton e18 = new JButton("");
		add(e18);
		
		JButton e19 = new JButton("");
		add(e19);
		
		JButton e20 = new JButton("");
		add(e20);
		
		JButton e21 = new JButton("");
		add(e21);
		
		JButton e22 = new JButton("");
		add(e22);
		
		JButton e23 = new JButton("");
		add(e23);
		
		JButton e24 = new JButton("");
		add(e24);
		
		JButton e25 = new JButton("");
		add(e25);
		
		JButton e26 = new JButton("");
		add(e26);
		
		JButton e27 = new JButton("");
		add(e27);
		
		JButton e28 = new JButton("");
		add(e28);
		
		JButton e29 = new JButton("");
		add(e29);
		
		JButton e30 = new JButton("");
		add(e30);
		
		JButton e31 = new JButton("");
		add(e31);
		JButton e32 = new JButton("");
		add(e32);
		
		final JButton PW_1 = new JButton("P");
		add(PW_1);
	
		PW_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Piece b = new Piece();
				b.button = PW_1;
				b.color = "White";
				b.ident = "Pawn";
				
				Position s = new Position();
				s.y = 6;
				s.x = 0;
				s.p = b;
				p[6][0] = s;
				getPositions(s);
				
			}
		});
		
		JButton PW_2 = new JButton("P");
		add(PW_2);
		b = new Piece();
		b.button = PW_2;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][1] = b;
		
		JButton PW_3 = new JButton("P");
		add(PW_3);
		b = new Piece();
		b.button = PW_3;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][2] = b;
		
		JButton PW_4 = new JButton("P");
		add(PW_4);
		b = new Piece();
		b.button = PW_4;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][3] = b;
		
		JButton PW_5 = new JButton("P");
		add(PW_5);
		b = new Piece();
		b.button = PW_5;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][4] = b;
		
		JButton PW_6 = new JButton("P");
		add(PW_6);
		b = new Piece();
		b.button = PW_6;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][5] = b;
		
		JButton PW_7 = new JButton("P");
		add(PW_7);
		b = new Piece();
		b.button = PW_7;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][6] = b;
		
		JButton PW_8 = new JButton("P");
		add(PW_8);
		b = new Piece();
		b.button = PW_8;
		b.color = "White";
		b.ident = "Pawn";
		//p[6][7] = b;
		
		final JButton RW = new JButton("R");
		add(RW);
		RW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(RW);	
		RW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piece b = new Piece();
				b.button = RW;
				b.color = "White";
				b.ident = "Rook";
				
				Position s = new Position();
				s.y = 7;
				s.x = 0;
				s.p = b;
				p[7][0] = s;
			
				getPositions(s);
			}
		});
		
		final JButton KnW = new JButton("Kn");
		KnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(KnW);	
		KnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piece b = new Piece();
				b.button = KnW;
				b.color = "White";
				b.ident = "Knight";
				
				Position s = new Position();
				s.y = 7;
				s.x = 1;
				s.p = b;
				p[7][1] = s;
			
				getPositions(s);
			}
		});
		
		
		JButton BW = new JButton("B");
		add(BW);
		BW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piece b = new Piece();
				b.button = RW;
				b.color = "White";
				b.ident = "Bishop";
				
				Position s = new Position();
				s.y = 7;
				s.x = 2;
				s.p = b;
				p[7][2] = s;
			
				getPositions(s);
			}
		});
		
		final JButton QW = new JButton("Q");
		add(QW);
		/*b = new Piece();
		b.button = QW;
		b.color = "White";
		b.ident = "Queen";
		//p[7][3] = b;*/
		
		// FOR TESTING
		QW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(QW);	
		QW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piece b = new Piece();
				b.button = QW;
				b.color = "White";
				b.ident = "Queen";
				
				Position s = new Position();
				s.y = 7;
				s.x = 3;
				s.p = b;
				p[7][3] = s;
			
				getPositions(s);
			}
		});
		
		
		final JButton KW = new JButton("K");
		add(KW);
		/*b = new Piece();
		b.button = KW;
		b.color = "White";
		b.ident = "King";*/
		//p[7][4] = b;
		
		// FOR TESTING
		KW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(KW);	
		KW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piece b = new Piece();
				b.button = KW;
				b.color = "White";
				b.ident = "King";
				
				Position s = new Position();
				s.y = 7;
				s.x = 4;
				s.p = b;
				p[7][4] = s;
			
				getPositions(s);
			}
		});
		
		
		
		JButton BW_1 = new JButton("B");
		add(BW_1);
		b = new Piece();
		b.button = BW_1;
		b.color = "White";
		b.ident = "Bishop";
		//p[7][5] = b;
		
		JButton KnW_1 = new JButton("Kn");
		add(KnW_1);
		b = new Piece();
		b.button = KnW_1;
		b.color = "White";
		b.ident = "Knight";
		//p[7][6] = b;
		
		JButton RW_1 = new JButton("R");
		add(RW_1);
		b = new Piece();
		b.button = RW_1;
		b.color = "White";
		b.ident = "Rook";
		//p[7][7] = b;
		
	
	}
/*
    private static final int N = 8;
    private static final int SIZE = 75;
    
    
    
    public ButtonBorder() {
        super(new GridLayout(N, N));
        this.setPreferredSize(new Dimension(N * SIZE, N * SIZE));
        boolean different = false;
        for(Integer j = 1; j <9; j++)
        {
	        for(Integer i = 1; i < 9; i++)
	        {
	        	JButton e11i = new JButton(Integer.toString(i*j));
	        	if(different)
	        	{
	        		e11i.setBackground(Color.PINK);
	        	}
	        	else
	        	{
	        		e11i.setBackground(Color.WHITE);
	        	}
	        	add(e11i);
	        	different = !different;
	        }
	        different = !different;
        }
    }
*/

    private void display() {
        JFrame f = new JFrame("ButtonBorder");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(this);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
            	/*ButtonBorder frame = new ButtonBorder();
   
				frame.setVisible(true);
            	 JFrame f = new JFrame("ButtonBorder");
                 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 //f.getContentPane().add(this);
                 f.pack();
                 f.setLocationRelativeTo(null);
                 f.setVisible(true);*/
                new ButtonBorder().display();
            }
        });
    }
   
    /*
    * When user clicks on a piece on the board getPositions() will be called
    * 
    * There will be a 2 dimensional array of positions for the buttons on the board and
    * we'll know which ones to highlight and which ones to disable using
    * Vector<Position> available attribute of a piece
    * 
    * Currently it only prints out the available positions of pawn and knight
    */
	public void getPositions(Position s)
	{
		Position spot;
		s.p.available = new Vector<Position>();
		
		//Added some basic first moves
		switch(s.p.ident)
		{
			case("Pawn"):
				if(s.y == 6)
				{
					spot = new Position();
					spot.y = 4;
					spot.x = s.x;
					s.p.available.add(spot);
					System.out.println(s.p.available.size());
					spot = new Position();
					spot.y = 5;
					spot.x = s.x;
					s.p.available.add(spot);
					System.out.println(s.p.available.size());
				}
				else
				{
					spot = new Position();
					spot.y = s.y - 1;
					spot.x = s.x;
					s.p.available.add(spot);
				}
		
				break;
				
			case("Rook"):
				Rook.getPositions(s);
				break;
				
			case("Knight"):
				spot = new Position();
				spot.y = s.y - 2;
				spot.x = s.x - 1;
				if(s.x >= 0 && s.y >= 0)
				{
					s.p.available.add(spot);
				}
				spot = new Position();
				spot.y = s.y - 2;
				spot.x = s.x + 1;
				if(s.x >= 0 && s.y >= 0)
				{
					s.p.available.add(spot);
				}
				
				break;
				
			case("Bishop"):
				Bishop.getPositions(s);
				break;
			
			case("Queen"):
				Queen.getPositions(s);
				break;
				
			case("King"):
				King.getPositions(s);
				break;
		}
		System.out.println("");
		for(int i = 0; i < s.p.available.size(); i++)
		{
			if(s.p.available.size() != 0)
			{
				System.out.println(s.p.available.get(i).x + " " + s.p.available.get(i).y);
			}
		}
	}
}