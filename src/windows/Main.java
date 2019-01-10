package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 450, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 408, 96);
		contentPane.add(textField);
		textField.setColumns(10);
		
		button = new JButton("1");
		button.setBounds(12, 419, 91, 67);
		contentPane.add(button);
		
		button1 = new JButton("2");
		button1.setBounds(113, 419, 91, 67);
		contentPane.add(button1);
		
		button2 = new JButton("3");
		button2.setBounds(216, 419, 91, 67);
		contentPane.add(button2);
		
		button3 = new JButton("+");
		button3.setBounds(319, 419, 91, 67);
		contentPane.add(button3);
		
		button_1 = new JButton("4");
		button_1.setBounds(12, 329, 91, 67);
		contentPane.add(button_1);
		
		button_2 = new JButton("5");
		button_2.setBounds(113, 329, 91, 67);
		contentPane.add(button_2);
		
		button_3 = new JButton("6");
		button_3.setBounds(216, 329, 91, 67);
		contentPane.add(button_3);
		
		button_4 = new JButton("-");
		button_4.setBounds(319, 329, 91, 67);
		contentPane.add(button_4);
		
		button_5 = new JButton("7");
		button_5.setBounds(12, 235, 91, 67);
		contentPane.add(button_5);
		
		button_6 = new JButton("8");
		button_6.setBounds(113, 235, 91, 67);
		contentPane.add(button_6);
		
		button_7 = new JButton("9");
		button_7.setBounds(216, 235, 91, 67);
		contentPane.add(button_7);
		
		button_8 = new JButton("*");
		button_8.setBounds(319, 235, 91, 67);
		contentPane.add(button_8);
		
		button_9 = new JButton("AC");
		button_9.setBounds(12, 142, 91, 67);
		contentPane.add(button_9);
		
		button_10 = new JButton("+/-");
		button_10.setBounds(113, 142, 91, 67);
		contentPane.add(button_10);
		
		button_11 = new JButton("%");
		button_11.setBounds(216, 142, 91, 67);
		contentPane.add(button_11);
		
		button_12 = new JButton("/");
		button_12.setBounds(319, 142, 91, 67);
		contentPane.add(button_12);
	}
}
