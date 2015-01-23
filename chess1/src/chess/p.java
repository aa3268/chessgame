package chess;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class p extends JFrame {

	private JPanel contentPane;
	public final JTextField text;
	public final JTextField text1;
	public static p frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new p();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public p() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Panel.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text = new JTextField();
		text.setBounds(108, 54, 86, 20);
		contentPane.add(text);
		text.setColumns(10);
		text.setText("");
		
		text1 = new JTextField();
		text1.setBounds(108, 85, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		text1.setText("");
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 57, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(10, 88, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Create New User");
		btnNewButton_1.setBounds(52, 227, 140, 23);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("Panel.background"));
		textArea.setBounds(10, 144, 224, 72);
		contentPane.add(textArea);
		
		JButton login = new JButton("Log In");
		login.addActionListener(new ActionListener() {
			Map<String,String> m = new HashMap();
			public void actionPerformed(ActionEvent arg0) {
				try{
					URL oracle = new URL("https://www.cs.drexel.edu/~aa3268/userData");
			        URLConnection yc = oracle.openConnection();
			        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			        String inputLine = in.readLine();
			        String[] tokens = null;
			        String id;
			        String password;
			        
			        while(inputLine != null)
			        {
				        //inputLine = in.readLine();
			        	//System.out.println(inputLine);
			        	tokens = inputLine.split(",");
			        	id = tokens[0].trim();
			        	password = tokens[3].trim();
			        	m.put(id, password);
			        	inputLine = in.readLine();
			        }	
			 
					//System.out.println(m.toString());
				in.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(!text.getText().equals("") && !text1.getText().equals(""))
				{
					if(m.get(text.getText()).equals(text1.getText()))
					{
							MainMenu k = new MainMenu();
							String[] args = null;
							k.main(args);
							frame.dispose();
					}
					else
					{
						
						System.out.println(m.get(text.getText()));
							
					}
				}
				else if(text.getText().equals("") && !text1.getText().equals(""))
				{
					textArea.setText("Pleaser Enter Username");
				}
				else if(text1.getText().equals("") && !text.getText().equals(""))
				{
					textArea.setText("Pleaser Enter Password");
				}
				else
				{
					textArea.setText("Pleaser Enter Username and Password");
				}
					
					
					
				}
			
				
		});
		login.setBounds(71, 117, 92, 23);
		contentPane.add(login);

	}
}
