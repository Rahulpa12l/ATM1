package Edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logo window = new Logo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Logo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 543, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login & Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(149, 34, 232, 31);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(257, 110, 168, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(121, 110, 126, 31);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(121, 151, 126, 37);
		frame.getContentPane().add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(257, 157, 168, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = textField_1.getText();

				if (username.equals("admin") && password.equals("1234")) {
					frame.dispose(); // Close Login window
					Atm atmFrame = new Atm();
					atmFrame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid Username or Password!");
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(122, 236, 125, 37);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Register eminfo = new Register();
				eminfo.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(296, 236, 153, 37);
		frame.getContentPane().add(btnNewButton_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		String username = textField.getText();
		String password = textField_1.getText();

		if (username.equals("admin") && password.equals("1234")) {
			frame.dispose(); // Close Login window
			Atm atmFrame = new Atm();
			atmFrame.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(frame, "Invalid Username or Password!");
		}

	}
}
