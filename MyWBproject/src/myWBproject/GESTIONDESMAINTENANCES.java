package myWBproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.SystemColor;

public class GESTIONDESMAINTENANCES {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GESTIONDESMAINTENANCES window = new GESTIONDESMAINTENANCES();
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
	public GESTIONDESMAINTENANCES() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.setBounds(100, 100, 680, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(10, 39, 289, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CREER UNE MAINTENANCE");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_1.setBounds(20, 11, 187, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MODIFIER");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_2.setBounds(20, 182, 187, 37);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SUPPRIMER");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_3.setBounds(20, 277, 187, 37);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("LISTE MAINTENANCE");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_5.setBounds(20, 99, 187, 37);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("GESTION DES MAINTENANCES");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 11, 257, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(325, 39, 329, 366);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.setBounds(219, 416, 152, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
