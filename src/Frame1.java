import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import eshop.Shop;
import eshop.Datenstrukturen.Adresse;
import eshop.Exceptions.BenutzerExistiertBereitsException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private Shop shop;
	private JFrame frame;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtEmail;
	private JTextField txtPasswort;
	private JTextField txtStrae;
	private JTextField txtHausnnummer;
	private JTextField txtStadt;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtPlz;
	private JTextField textField_7;

//	public Frame1 (Shop shop){
//		this.shop = shop;
//	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 681, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtVorname = new JTextField();
		txtVorname.setBackground(Color.WHITE);
		txtVorname.setEditable(false);
		txtVorname.setHorizontalAlignment(SwingConstants.CENTER);
		txtVorname.setText("Vorname");
		txtVorname.setBounds(234, 99, 86, 20);
		frame.getContentPane().add(txtVorname);
		txtVorname.setColumns(10);
		
		txtNachname = new JTextField();
		txtNachname.setBackground(Color.WHITE);
		txtNachname.setEditable(false);
		txtNachname.setHorizontalAlignment(SwingConstants.CENTER);
		txtNachname.setText("Nachname");
		txtNachname.setBounds(234, 121, 86, 20);
		frame.getContentPane().add(txtNachname);
		txtNachname.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setEditable(false);
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setText("Email");
		txtEmail.setBounds(234, 141, 86, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPasswort = new JTextField();
		txtPasswort.setBackground(Color.WHITE);
		txtPasswort.setEditable(false);
		txtPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		txtPasswort.setText("Passwort");
		txtPasswort.setBounds(234, 162, 86, 20);
		frame.getContentPane().add(txtPasswort);
		txtPasswort.setColumns(10);
		
		txtStrae = new JTextField();
		txtStrae.setBackground(Color.WHITE);
		txtStrae.setEditable(false);
		txtStrae.setHorizontalAlignment(SwingConstants.CENTER);
		txtStrae.setText("Stra\u00DFe");
		txtStrae.setBounds(234, 181, 86, 20);
		frame.getContentPane().add(txtStrae);
		txtStrae.setColumns(10);
		
		txtHausnnummer = new JTextField();
		txtHausnnummer.setBackground(Color.WHITE);
		txtHausnnummer.setEditable(false);
		txtHausnnummer.setHorizontalAlignment(SwingConstants.CENTER);
		txtHausnnummer.setText("Hausnnummer");
		txtHausnnummer.setBounds(234, 201, 86, 20);
		frame.getContentPane().add(txtHausnnummer);
		txtHausnnummer.setColumns(10);
		
		txtStadt = new JTextField();
		txtStadt.setBackground(Color.WHITE);
		txtStadt.setEditable(false);
		txtStadt.setHorizontalAlignment(SwingConstants.CENTER);
		txtStadt.setText("Stadt");
		txtStadt.setBounds(234, 241, 86, 20);
		frame.getContentPane().add(txtStadt);
		txtStadt.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(359, 162, 86, 20);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(359, 99, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(359, 121, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(359, 141, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(359, 181, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(359, 201, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(359, 221, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblKundeRegistrieren = DefaultComponentFactory.getInstance().createTitle("Kunde Registrieren");
		lblKundeRegistrieren.setHorizontalAlignment(SwingConstants.CENTER);
		lblKundeRegistrieren.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKundeRegistrieren.setBounds(234, 11, 211, 43);
		frame.getContentPane().add(lblKundeRegistrieren);
		
		JButton btnBesttigen = new JButton("Best\u00E4tigen");
		btnBesttigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vor = textField.getText();
				String nach = txtNachname.getText();
				String mail = txtEmail.getText();
				String passwort = txtPasswort.getText();
				String str = txtStrae.getText();
				String hnr = txtHausnnummer.getText();
				String plz = txtPlz.getText();
				String stadt = txtStadt.getText();
				Adresse adresse = new Adresse(str, hnr, plz, stadt);
				try {
					shop.kundeRegi(vor, nach, mail, passwort, adresse);
					
				} catch (BenutzerExistiertBereitsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBesttigen.setBounds(297, 272, 89, 23);
		frame.getContentPane().add(btnBesttigen);
		
		txtPlz = new JTextField();
		txtPlz.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlz.setBackground(Color.WHITE);
		txtPlz.setEditable(false);
		txtPlz.setText("PLZ");
		txtPlz.setBounds(234, 221, 86, 20);
		frame.getContentPane().add(txtPlz);
		txtPlz.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(359, 241, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
	}
}
