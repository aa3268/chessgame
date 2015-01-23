package chess;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;
	static MainMenu frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Invite");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonBorder k = new ButtonBorder();
				String[] args = null;
				k.main(args);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(277, 27, 89, 49);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(5, 5, 214, 251);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = null;
				p.main(args);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(277, 87, 89, 49);
		contentPane.add(btnNewButton_1);
	}


}
