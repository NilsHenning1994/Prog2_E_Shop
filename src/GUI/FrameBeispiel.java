package GUI;
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

public final class FrameBeispiel extends JPanel {

	private Shop shop;
	private JFrame frmKundeRegistrieren;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtEmail;
	private JTextField txtPasswort;
	private JTextField txtStrasse;
	private JTextField txtHausnnummer;
	private JTextField txtStadt;
	private JPasswordField txt4;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txtPlz;
	private JTextField txt8;

	public FrameBeispiel (Shop shop){
		this.shop = shop;
		initialize();
	}
	
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKundeRegistrieren = new JFrame();
		frmKundeRegistrieren.setTitle("Kunde Registrieren");
		frmKundeRegistrieren.setBounds(100, 100, 681, 373);
		frmKundeRegistrieren.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		txtVorname = new JTextField();
		txtVorname.setBackground(Color.WHITE);
		txtVorname.setEditable(false);
		txtVorname.setHorizontalAlignment(SwingConstants.CENTER);
		txtVorname.setText("Vorname");
		txtVorname.setBounds(30, 68, 86, 20);
		//add(txtVorname);
		add(txtVorname);
		txtVorname.setColumns(10);
		
		txtNachname = new JTextField();
		txtNachname.setBackground(Color.WHITE);
		txtNachname.setEditable(false);
		txtNachname.setHorizontalAlignment(SwingConstants.CENTER);
		txtNachname.setText("Nachname");
		txtNachname.setBounds(30, 90, 86, 20);
		add(txtNachname);
		txtNachname.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setEditable(false);
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setText("Email");
		txtEmail.setBounds(30, 110, 86, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPasswort = new JTextField();
		txtPasswort.setBackground(Color.WHITE);
		txtPasswort.setEditable(false);
		txtPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		txtPasswort.setText("Passwort");
		txtPasswort.setBounds(30, 131, 86, 20);
		add(txtPasswort);
		txtPasswort.setColumns(10);
		
		txtStrasse = new JTextField();
		txtStrasse.setBackground(Color.WHITE);
		txtStrasse.setEditable(false);
		txtStrasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtStrasse.setText("Stra\u00DFe");
		txtStrasse.setBounds(30, 150, 86, 20);
		add(txtStrasse);
		txtStrasse.setColumns(10);
		
		txtHausnnummer = new JTextField();
		txtHausnnummer.setBackground(Color.WHITE);
		txtHausnnummer.setEditable(false);
		txtHausnnummer.setHorizontalAlignment(SwingConstants.CENTER);
		txtHausnnummer.setText("Hausnnummer");
		txtHausnnummer.setBounds(30, 170, 86, 20);
		add(txtHausnnummer);
		txtHausnnummer.setColumns(10);
		
		txtStadt = new JTextField();
		txtStadt.setBackground(Color.WHITE);
		txtStadt.setEditable(false);
		txtStadt.setHorizontalAlignment(SwingConstants.CENTER);
		txtStadt.setText("Stadt");
		txtStadt.setBounds(30, 210, 86, 20);
		add(txtStadt);
		txtStadt.setColumns(10);
		
		txt4 = new JPasswordField();
		txt4.setBounds(155, 131, 86, 20);
		add(txt4);
		
		txt1 = new JTextField();
		txt1.setBounds(155, 68, 86, 20);
		add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(155, 90, 86, 20);
		add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(155, 110, 86, 20);
		add(txt3);
		txt3.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(155, 150, 86, 20);
		add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBounds(155, 170, 86, 20);
		add(txt6);
		txt6.setColumns(10);
		
		txt7 = new JTextField();
		txt7.setBounds(155, 190, 86, 20);
		add(txt7);
		txt7.setColumns(10);
		
		JButton Btn_confirm = new JButton("Bestaetigen");
		Btn_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vor = txt1.getText();
				String nach = txt2.getText();
				String mail = txt3.getText();
				String passwort = txt4.getPassword().toString();
				String str = txt5.getText();
				String hnr = txt6.getText();
				String plz = txt7.getText();
				String stadt = txt8.getText();
				Adresse adresse = new Adresse(str, hnr, plz, stadt);
				try {
					shop.kundeRegi(vor, nach, mail, passwort, adresse);
					
				} catch (BenutzerExistiertBereitsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Btn_confirm.setBounds(93, 241, 89, 23);
		add(Btn_confirm);
		
		txtPlz = new JTextField();
		txtPlz.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlz.setBackground(Color.WHITE);
		txtPlz.setEditable(false);
		txtPlz.setText("PLZ");
		txtPlz.setBounds(30, 190, 86, 20);
		add(txtPlz);
		txtPlz.setColumns(10);
		
		txt8 = new JTextField();
		txt8.setBounds(155, 210, 86, 20);
		add(txt8);
		txt8.setColumns(10);
		
		JLabel label = new JLabel();
		label.setText("Willkommen zur Registrierung unseres E-Shops");
		label.setBounds(30, 24, 223, 14);
		add(label);
	}
}
