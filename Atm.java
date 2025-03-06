package Edu;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Atm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atm frame = new Atm();
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
	public Atm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            int n = Integer.parseInt(textField.getText()); // Get input value
		            String balanceText = lblNewLabel.getText().replaceAll("[^0-9]", ""); // Extract numbers
		            int m = balanceText.isEmpty() ? 0 : Integer.parseInt(balanceText); // Convert to integer
		            int c = n + m; // Add deposited amount
		            lblNewLabel.setText("Current Balance: $" + c); // Update label
		            textField.setText("");
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
		           
		        }
		    }
		    
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(76, 248, 172, 42);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(148, 112, 358, 56);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Withdrawal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    int n = Integer.parseInt(textField.getText()); // Get input value
				    String balanceText = lblNewLabel.getText().replaceAll("[^0-9]", ""); // Extract numeric balance
				    int m = balanceText.isEmpty() ? 0 : Integer.parseInt(balanceText); // Convert balance to integer
				    
				    if (n > m) {
				        JOptionPane.showMessageDialog(null, "Insufficient Balance!"); 
				    } else {
				        int c = m - n; // Withdraw amount
				        lblNewLabel.setText("Current Balance: $" + c); // Update balance
				        textField.setText("");
				    }
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Please enter a valid number!"); 
				    
				}

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(382, 248, 163, 42);
		contentPane.add(btnNewButton_1);
		
		 lblNewLabel = new JLabel("Current Balance: $ 1000");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(148, 30, 358, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(266, 332, 107, 35);
		contentPane.add(btnNewButton_2);
	}

}
