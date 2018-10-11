package main.java.collections.a2;

import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.util.*;
import java.io.*;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Rectangle;

public class Woerterbuch extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextField jTextField = null;
	private JTextField jTextField1 = null;
	private JList jList = null;
	private JButton jButton = null;

	private JTextArea jTextArea = null;
	private JLabel English = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;

	// TODO Attribut HashMap anlegen

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setColumns(30);
			jTextField.setBounds(new Rectangle(74, 7, 334, 20));
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setColumns(30);
			jTextField1.setBounds(new Rectangle(74, 35, 334, 20));
		}
		return jTextField1;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("Suchen");
			jButton.setBounds(new Rectangle(328, 70, 77, 26));
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					// TODO Suchbegriff aus jTextField in Hashmap suchen,
					// falls gefunden Ergebnis in jTextField1 ausgeben
					// ansonsten Fehlertext anzeigen

				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(484, 10, 0, 16));
		}
		return jTextArea;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Woerterbuch thisClass = new Woerterbuch();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public Woerterbuch() {
		super();
		initialize();

		try {
			// Wörterbuchdatei öffnen und einlesen
			Scanner s = new Scanner(new File("dict_e-d.txt"));
			while (s.hasNext()) {
				String line = s.nextLine();
				line = line.trim();
				if (!line.isEmpty()) {

					// TODO Sofern es sich um keine Kommentarzeile handelt
					// HashMap füllen:
					// Mit dem Aufruf 
					//     'String[] tokens = line.split("\\t");'
					// kann die Zeile
					// in den Englischen bzw. Deutschen Teil geteilt werden.
					// Es ist darauf zu achten, dass der Englische Begriff
					// mehrfach mit unterschiedlichen Deutschen Bedeutungen 
					// in der Datei vorkommen kann!!!

				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(444, 154);
		this.setContentPane(getJContentPane());
		this.setTitle("Wörterbuch");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(4, 37, 54, 16));
			jLabel1.setText("Deutsch");
			jLabel = new JLabel();
			jLabel.setText("Englisch");
			jLabel.setBounds(new Rectangle(5, 10, 48, 16));
			English = new JLabel();
			English.setText("");
			English.setBounds(new Rectangle(58, 18, 0, 0));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(English, null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJTextArea(), null);
			jContentPane.add(getJTextField1(), null);
			jContentPane.add(jLabel1, null);
		}
		return jContentPane;
	}

} // @jve:decl-index=0:visual-constraint="-8,11"
