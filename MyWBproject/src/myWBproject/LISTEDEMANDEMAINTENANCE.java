package myWBproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;

public class LISTEDEMANDEMAINTENANCE {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LISTEDEMANDEMAINTENANCE window = new LISTEDEMANDEMAINTENANCE();
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
	public LISTEDEMANDEMAINTENANCE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBackground(SystemColor.text);
		frame.setBounds(100, 100, 697, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("LISTE DES DEMANDES DE MAINTENANCE\r\n");
		lblNewLabel.setBounds(10, 11, 225, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBounds(10, 400, 661, 26);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("RETOUR");
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton.setBounds(30, 0, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VALIDER L'AFFECTATION");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_1.setBounds(219, 0, 183, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MODIFIER");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2.setBounds(502, 0, 136, 23);
		panel.add(btnNewButton_2);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(10, 36, 402, 353);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 382, 331);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "TYPE", "DESCRIPTION", "DATE"
			}
		));
		table.getColumnModel().getColumn(3).setResizable(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel_2.setBounds(422, 36, 249, 353);
		frame.getContentPane().add(panel_2);
	}

}
