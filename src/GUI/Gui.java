package GUI;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

import eshop.Shop;

public class Gui extends JFrame {
	private Shop shop;

	
	private void initialize(){
		try {
			shop = new Shop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new FrameBeispiel(shop));
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		initialize();
	}

}
