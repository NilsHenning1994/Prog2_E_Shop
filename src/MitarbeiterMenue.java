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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class MitarbeiterMenue {

	private JFrame frame;
	private JTextField txtHalloUser;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MitarbeiterMenue window = new MitarbeiterMenue();
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
	public MitarbeiterMenue() {
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
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setBounds(107, 25, 365, 378);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 35, 107, 403);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Artikel anlegen");
		btnNewButton.setBounds(10, 33, 87, 85);
		panel_1.add(btnNewButton);
		
		JButton btnArtikelAendern = new JButton("Artikel aendern");
		btnArtikelAendern.setBounds(10, 167, 87, 85);
		panel_1.add(btnArtikelAendern);
		
		JButton btnEreignislog = new JButton("Ereignislog");
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
