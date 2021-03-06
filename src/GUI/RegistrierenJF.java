/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Vector;
import java.awt.Color;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
//import rmi.common.EShopRemote;
//import rmi.common.KundeExistiertBereitsException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import eshop.Shop;
import eshop.Exceptions.BenutzerExistiertBereitsException;



/**
 *
 * @author Gruppe A4(Patrick, Oleksandra, Walter)
 */
public class RegistrierenJF extends javax.swing.JFrame {

    
//    private EShopRemote eshopartikel;
//    private Vector artikelliste;
//    private Shop shop;
    /**
     * Creates new form RegistrierenJF
     */
    public RegistrierenJF() throws IOException, RemoteException, NotBoundException{
        super("Registrieren");
        initComponents();
        setLocationRelativeTo(null);
        Registry registry = LocateRegistry.getRegistry();
//        eshopartikel = (EShopRemote) registry.lookup("shop�");
//        artikelliste = eshopartikel.gibArtikelListe();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRegVorname = new javax.swing.JLabel();
        jLabelRegNachname = new javax.swing.JLabel();
        jLabelRegLoginname = new javax.swing.JLabel();
        jLabelRegPassword = new javax.swing.JLabel();
        jLabelRegEmail = new javax.swing.JLabel();
        jLabelRegWohnort = new javax.swing.JLabel();
        jLabelRegStraße = new javax.swing.JLabel();
        jLabelRegPLZ = new javax.swing.JLabel();
        jTextFieldRegVorname = new javax.swing.JTextField();
        jTextFieldRegNachname = new javax.swing.JTextField();
        jTextFieldRegLogin = new javax.swing.JTextField();
        jTextFieldRegEmail = new javax.swing.JTextField();
        jTextFieldRegWohnort = new javax.swing.JTextField();
        jTextFieldRegStrasse = new javax.swing.JTextField();
        jTextFieldRegPLZ = new javax.swing.JTextField();
        jPasswordFieldRegPassword = new javax.swing.JPasswordField();
        jButtonReg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelRegError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Willkommen zur Registrierung unseres E-Shops");

        jLabelRegVorname.setText("Vorname:");

        jLabelRegNachname.setText("Nachname:");

        jLabelRegLoginname.setText("Loginname:");

        jLabelRegPassword.setText("Passwort:");

        jLabelRegEmail.setText("E-Mail:");

        jLabelRegWohnort.setText("Wohnort:");

        jLabelRegStraße.setText("Strasse:");

        jLabelRegPLZ.setText("PLZ:");

        jButtonReg.setText("Registrieren");
        jButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegActionPerformed(evt);
            }
        });

        jButton1.setText("Schließen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabelRegPLZ)
        							.addGap(43)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jButtonReg, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        								.addComponent(jTextFieldRegPLZ, 289, 289, 289)
        								.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        								.addComponent(jLabelRegError, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabelRegEmail)
        							.addGap(0, 321, Short.MAX_VALUE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabelRegWohnort)
        								.addComponent(jLabelRegStraße))
        							.addGap(18)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGap(10)
        									.addComponent(jTextFieldRegStrasse))
        								.addComponent(jTextFieldRegWohnort, 289, 289, 289))))
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabelRegNachname)
        						.addComponent(jLabelRegLoginname)
        						.addComponent(jLabelRegPassword))
        					.addGap(75, 308, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabelRegVorname)
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel1)
        							.addGap(0, 76, Short.MAX_VALUE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jTextFieldRegEmail, Alignment.LEADING, 289, 289, 289)
        								.addComponent(jPasswordFieldRegPassword, Alignment.LEADING, 289, 289, 289)
        								.addComponent(jTextFieldRegLogin, Alignment.LEADING, 289, 289, 289)
        								.addComponent(jTextFieldRegNachname, Alignment.LEADING, 289, 289, 289)
        								.addComponent(jTextFieldRegVorname, 289, 289, 289))
        							.addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegVorname)
        				.addComponent(jTextFieldRegVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegNachname)
        				.addComponent(jTextFieldRegNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegLoginname)
        				.addComponent(jTextFieldRegLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegPassword)
        				.addComponent(jPasswordFieldRegPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegEmail)
        				.addComponent(jTextFieldRegEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegWohnort)
        				.addComponent(jTextFieldRegWohnort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegStraße)
        				.addComponent(jTextFieldRegStrasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelRegPLZ)
        				.addComponent(jTextFieldRegPLZ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabelRegError, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonReg)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton1)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegActionPerformed
          // nr, name, vorname, loginname, passwort, email, wohnort, strasse, plz
        int nr = 100;
        String name = jTextFieldRegNachname.getText();
        String vorname = jTextFieldRegVorname.getText();
        String login = jTextFieldRegLogin.getText();
        String passwort = jPasswordFieldRegPassword.getText();
        String email = jTextFieldRegEmail.getText();
        String wohnort = jTextFieldRegWohnort.getText();
        String strasse = jTextFieldRegStrasse.getText();
        String plz = jTextFieldRegPLZ.getText();

        
        jLabelRegError.setForeground(Color.GREEN);
        jLabelRegError.setText("Erfolgreich registriert.");
        jTextFieldRegNachname.setEnabled(false);
        jTextFieldRegVorname.setEnabled(false);
        jTextFieldRegLogin.setEnabled(false);
        jPasswordFieldRegPassword.setEnabled(false);
        jTextFieldRegEmail.setEnabled(false);
        jTextFieldRegWohnort.setEnabled(false);
        jTextFieldRegStrasse.setEnabled(false);
        jTextFieldRegPLZ.setEnabled(false);
        jButtonReg.setEnabled(false);
    }//GEN-LAST:event_jButtonRegActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldRegNachname.setEnabled(true);
        jTextFieldRegVorname.setEnabled(true);
        jTextFieldRegLogin.setEnabled(true);
        jPasswordFieldRegPassword.setEnabled(true);
        jTextFieldRegEmail.setEnabled(true);
        jTextFieldRegWohnort.setEnabled(true);
        jTextFieldRegStrasse.setEnabled(true);
	jTextFieldRegPLZ.setEnabled(true);
        jButtonReg.setEnabled(true);
        
        jTextFieldRegNachname.setText("");
        jTextFieldRegVorname.setText("");
        jTextFieldRegLogin.setText("");
        jPasswordFieldRegPassword.setText("");
        jTextFieldRegEmail.setText("");
        jTextFieldRegWohnort.setText("");
        jTextFieldRegStrasse.setText("");
	jTextFieldRegPLZ.setText("");
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrierenJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrierenJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrierenJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrierenJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrierenJF().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RegistrierenJF.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NotBoundException ex) {
                    Logger.getLogger(RegistrierenJF.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelRegEmail;
    private javax.swing.JLabel jLabelRegError;
    private javax.swing.JLabel jLabelRegLoginname;
    private javax.swing.JLabel jLabelRegNachname;
    private javax.swing.JLabel jLabelRegPLZ;
    private javax.swing.JLabel jLabelRegPassword;
    private javax.swing.JLabel jLabelRegStraße;
    private javax.swing.JLabel jLabelRegVorname;
    private javax.swing.JLabel jLabelRegWohnort;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldRegPassword;
    private javax.swing.JTextField jTextFieldRegEmail;
    private javax.swing.JTextField jTextFieldRegLogin;
    private javax.swing.JTextField jTextFieldRegNachname;
    private javax.swing.JTextField jTextFieldRegPLZ;
    private javax.swing.JTextField jTextFieldRegStrasse;
    private javax.swing.JTextField jTextFieldRegVorname;
    private javax.swing.JTextField jTextFieldRegWohnort;
    // End of variables declaration//GEN-END:variables
}
