package windows;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logic.Logica;
import javax.swing.DropMode;
import java.awt.Font;
import java.awt.TextField;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private String texto;
	public Logica l = new Logica();
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private boolean fim = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(12, 13, 408, 96);
		contentPane.add(textField);
		textField.setColumns(10);

		button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "1");
			}
		});
		button.setBounds(12, 419, 91, 67);
		contentPane.add(button);

		button1 = new JButton("2");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "2");
			}
		});
		button1.setBounds(113, 419, 91, 67);
		contentPane.add(button1);

		button2 = new JButton("3");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "3");
			}
		});
		button2.setBounds(216, 419, 91, 67);
		contentPane.add(button2);

		button3 = new JButton("+");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
				if (l.getNum1() == 0) {
					textField.setText("");
					l.salvaNum1(texto);
					l.idOperacao = 1;

				}

			}
		});
		button3.setBounds(319, 419, 91, 67);
		contentPane.add(button3);

		button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "4");
			}
		});
		button_1.setBounds(12, 329, 91, 67);
		contentPane.add(button_1);

		button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "5");
			}
		});
		button_2.setBounds(113, 329, 91, 67);
		contentPane.add(button_2);

		button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "6");
			}
		});
		button_3.setBounds(216, 329, 91, 67);
		contentPane.add(button_3);

		button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
				if (l.getNum1() == 0) {
					textField.setText("");
					l.salvaNum1(texto);
					l.idOperacao = 2;
				}
			}
		});
		button_4.setBounds(319, 329, 91, 67);
		contentPane.add(button_4);

		button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "7");
			}
		});
		button_5.setBounds(12, 235, 91, 67);
		contentPane.add(button_5);

		button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "8");
			}
		});
		button_6.setBounds(113, 235, 91, 67);
		contentPane.add(button_6);

		button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFim();
				texto = textField.getText();
				textField.setText(texto + "9");
			}
		});
		button_7.setBounds(216, 235, 91, 67);
		contentPane.add(button_7);

		button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
				if (l.getNum1() == 0) {
					textField.setText("");
					l.salvaNum1(texto);
					l.idOperacao = 3;
				}

			}
		});
		button_8.setBounds(319, 235, 91, 67);
		contentPane.add(button_8);

		button_9 = new JButton("AC");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		button_9.setBounds(12, 142, 91, 67);
		contentPane.add(button_9);

		button_10 = new JButton("+/-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();

				if (!texto.contains("-")) {
					texto = "-" + texto;
					textField.setText(texto);
				} else if (texto.contains("-")) {
					String x = texto.replace("-", "");
					textField.setText(x);
				}
			}
		});
		button_10.setBounds(113, 142, 91, 67);
		contentPane.add(button_10);

		button_11 = new JButton("%");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
					float x = Float.parseFloat(texto);
					l.percent(x);
					textField.setText(""+l.percent(x));
					
			}
		});
		button_11.setBounds(216, 142, 91, 67);
		contentPane.add(button_11);

		button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
				if (l.getNum1() == 0) {
					textField.setText("");
					l.salvaNum1(texto);
					l.idOperacao = 4;
				}
			}
		});
		button_12.setBounds(319, 142, 91, 67);
		contentPane.add(button_12);

		button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
				textField.setText(texto + "0");
			}
		});
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setBounds(12, 509, 194, 67);
		contentPane.add(button_13);

		button_14 = new JButton(",");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textField.getText();
				if (!texto.contains(".")) {
					textField.setText(texto + ".");
				}
			}
		});
		button_14.setBounds(216, 509, 91, 67);
		contentPane.add(button_14);

		button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textField.getText();
				l.salvaNum2(texto);
				textField.setText("");
				l.checkOperacao();
				String x = "" + l.resultado;
				textField.setText(x);
				l.clearNuns();
				fim = true;
			}
		});
		button_15.setBounds(319, 509, 91, 67);
		contentPane.add(button_15);
	}
	void checkFim() {
		if (fim) {
			textField.setText("");
			fim = false;
		}
	}
}
