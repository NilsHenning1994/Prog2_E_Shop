import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Font;

public class KundenMenue {

	private JFrame frame;
	private JTextField txtHalloUser;
	private JTextField txtBezeichnung;
	private JTextField txtBestand;
	private JTextField txtId;
	private JTextField txtPreis;
	private JTextField txtAnzahl;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KundenMenue window = new KundenMenue();
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
	public KundenMenue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(106, 35, 585, 403);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtBezeichnung = new JTextField();
		txtBezeichnung.setEditable(false);
		txtBezeichnung.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtBezeichnung.setHorizontalAlignment(SwingConstants.LEFT);
		txtBezeichnung.setText("Bezeichnung");
		txtBezeichnung.setBounds(132, 31, 86, 20);
		panel.add(txtBezeichnung);
		txtBezeichnung.setColumns(10);
		
		txtBestand = new JTextField();
		txtBestand.setEditable(false);
		txtBestand.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtBestand.setHorizontalAlignment(SwingConstants.LEFT);
		txtBestand.setText("Bestand");
		txtBestand.setBounds(217, 31, 86, 20);
		panel.add(txtBestand);
		txtBestand.setColumns(10);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtId.setHorizontalAlignment(SwingConstants.LEFT);
		txtId.setText("ID");
		txtId.setBounds(99, 31, 36, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtPreis = new JTextField();
		txtPreis.setEditable(false);
		txtPreis.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPreis.setHorizontalAlignment(SwingConstants.LEFT);
		txtPreis.setText("Preis");
		txtPreis.setBounds(303, 31, 86, 20);
		panel.add(txtPreis);
		txtPreis.setColumns(10);
		
		JButton btnInWarenkorb = new JButton("in Warenkorb");
		btnInWarenkorb.setBounds(446, 53, 97, 23);
		panel.add(btnInWarenkorb);
		
		JButton button = new JButton("in Warenkorb");
		button.setBounds(446, 77, 97, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("in Warenkorb");
		button_1.setBounds(446, 100, 97, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("in Warenkorb");
		button_2.setBounds(446, 122, 97, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("in Warenkorb");
		button_3.setBounds(446, 145, 97, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("in Warenkorb");
		button_4.setBounds(446, 170, 97, 23);
		panel.add(button_4);
		
		txtAnzahl = new JTextField();
		txtAnzahl.setEditable(false);
		txtAnzahl.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAnzahl.setHorizontalAlignment(SwingConstants.LEFT);
		txtAnzahl.setText("Anzahl");
		txtAnzahl.setBounds(389, 31, 57, 20);
		panel.add(txtAnzahl);
		txtAnzahl.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(389, 54, 57, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(389, 78, 57, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(389, 101, 57, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(389, 123, 57, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(389, 146, 57, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(389, 171, 57, 20);
		panel.add(textField_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 35, 107, 403);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 33, 87, 85);
		panel_1.add(btnNewButton);
		
		JButton btnArtikelAendern = new JButton("");
		btnArtikelAendern.setBounds(10, 167, 87, 85);
		panel_1.add(btnArtikelAendern);
		
		JButton btnEreignislog = new JButton("");
		btnEreignislog.setBounds(10, 294, 87, 85);
		panel_1.add(btnEreignislog);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 691, 35);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		txtHalloUser = new JTextField();
		txtHalloUser.setBounds(543, 5, 86, 20);
		panel_2.add(txtHalloUser);
		txtHalloUser.setBackground(Color.WHITE);
		txtHalloUser.setEditable(false);
		txtHalloUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtHalloUser.setText("Hallo User");
		txtHalloUser.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(633, 5, 58, 20);
		panel_2.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Test", "Logout"}));
	}
}
