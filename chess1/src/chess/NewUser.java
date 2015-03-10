package chess;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class NewUser extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	static NewUser frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new NewUser();
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
	public NewUser() {
		
		setBounds(100, 100, 300, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		Cancel.setBounds(151, 72, 124, 23);
		contentPane.add(Cancel);
		
		JLabel username = new JLabel("Username");
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		username.setBounds(10, 10, 81, 20);
		contentPane.add(username);
		
		JLabel lblPasswords = new JLabel("Password");
		lblPasswords.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswords.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPasswords.setBounds(10, 41, 81, 20);
		contentPane.add(lblPasswords);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 38, 175, 23);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(101, 10, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		

		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				
			
				  	if(textField.getText().length() != 0 && passwordField.getText().length() != 0)
				  	{
				  		/* 		If username already exist in database
				  		 *			JOptionPane.showMessageDialog(frame, "Username already exists");
				  		 *		else
				  		 *			Add username and password to database
				  		 */
				  		dispose();
				  		
				  	}
				 	else
				 	{
				 		JOptionPane.showMessageDialog(frame, "Please provide Username and Password");
				 	}
			}
		});
		Submit.setBounds(10, 72, 124, 23);
		contentPane.add(Submit);
	}
}
