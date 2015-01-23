package chess;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonBorder extends JPanel {
	
	public ButtonBorder() {
		setLayout(new GridLayout(0, 8, 0, 0));
		
		JButton RB = new JButton("r");
		add(RB);
		
		JButton KnB = new JButton("kn");
		add(KnB);
		
		JButton BB = new JButton("b");
		add(BB);

		JButton QB = new JButton("q");
		add(QB);
		
		JButton KB = new JButton("k");
		add(KB);
		
		JButton BB_1 = new JButton("b");
		add(BB_1);
		
		JButton KnB_1 = new JButton("kn");
		add(KnB_1);
		
		
		JButton RB_1 = new JButton("r");
		add(RB_1);
		
		
		JButton PB_1 = new JButton("p");
		add(PB_1);
		
		JButton PB_2 = new JButton("p");
		add(PB_2);
	
		JButton PB_3 = new JButton("p");
		add(PB_3);
		
		JButton PB_4 = new JButton("p");
		add(PB_4);
		
		JButton PB_5 = new JButton("p");
		add(PB_5);
	
		JButton PB_6 = new JButton("p");
		add(PB_6);
	
		JButton PB_7 = new JButton("p");
		add(PB_7);
		
		JButton PB_8 = new JButton("p");
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
		
		JButton PW_1 = new JButton("P");
		add(PW_1);
		
		JButton PW_2 = new JButton("P");
		add(PW_2);
		
		JButton PW_3 = new JButton("P");
		add(PW_3);
		
		JButton PW_4 = new JButton("P");
		add(PW_4);
		
		JButton PW_5 = new JButton("P");
		add(PW_5);
		
		JButton PW_6 = new JButton("P");
		add(PW_6);
		
		JButton PW_7 = new JButton("P");
		add(PW_7);
		
		JButton PW_8 = new JButton("P");
		add(PW_8);
		
		JButton e111 = new JButton("R");
		add(e111);
		
		JButton e112 = new JButton("Kn");
		add(e112);
		
		JButton e113 = new JButton("B");
		add(e113);
		
		JButton e114 = new JButton("Q");
		add(e114);
		
		JButton e115 = new JButton("K");
		add(e115);
		
		JButton e116 = new JButton("B");
		add(e116);
		
		JButton e117 = new JButton("Kn");
		add(e117);
		
		JButton e118 = new JButton("R");
		add(e118);
		
	
	}

    private static final int N = 8;
    private static final int SIZE = 75;
    
    
    /*
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
    }*/



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

            @Override
            public void run() {
                new ButtonBorder().display();
            }
        });
    }
    
    
    public void CheckMove(String i, int x, int y)
    {
    	Vector<int[][]> v;

    	switch(i)
    	{
    	case("P"):
    	{
    		int y_1 = y - 1;
    		
    		int y_2 = y - 2;
    	}
    	break;
    	case("B"):
    	{
    	
    	}
    	break;
    	case("R"):
    	{
    	
    	}
    	break;
    	case("Kn"):
    	{
    	
    	}
    	break;
    	case("Q"):
    	{
    	
    	}
    	break;
    	case("K"):
    	{
    	
    	}
    	break;
    
    	
    	
    	
    	}
		
    }
    
}