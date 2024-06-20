package myWBproject;








import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pAceuil extends JFrame {

    public pAceuil() {
    	setBackground(SystemColor.text);
    	getContentPane().setBackground(SystemColor.text);
        setTitle("GMAO");
        setSize(683, 472);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.text);
        panel.setBounds(10, 42, 279, 346);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("GESTION DES MAINTENANCES");
        btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        btnNewButton_1.setBounds(10, 11, 248, 23);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("GESTION OPERATEUR");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        btnNewButton_2.setBounds(10, 77, 248, 23);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_4 = new JButton("GESTION FICHES DE MAINTENANCE");
        btnNewButton_4.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        btnNewButton_4.setBounds(10, 157, 248, 23);
        panel.add(btnNewButton_4);
        
        JButton btnNewButton_3 = new JButton("GESTION DES PRESTATIONS");
        btnNewButton_3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        btnNewButton_3.setBounds(10, 226, 248, 23);
        panel.add(btnNewButton_3);
        
        JButton btnNewButton_5 = new JButton("REGLEMENT ET CLOTURE DE DOSSIER");
        btnNewButton_5.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        btnNewButton_5.setBounds(10, 301, 248, 23);
        panel.add(btnNewButton_5);
        
        JLabel lblNewLabel = new JLabel("MENU");
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        lblNewLabel.setBounds(10, 11, 287, 14);
        getContentPane().add(lblNewLabel);
        
        JButton btnNewButton = new JButton("DECONNEXION");
        btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        btnNewButton.setBounds(249, 399, 163, 23);
        getContentPane().add(btnNewButton);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.text);
        panel_1.setBounds(299, 42, 358, 335);
        getContentPane().add(panel_1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pAceuil().setVisible(true);
            }
        });
    }
}
