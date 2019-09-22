package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Bai3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3 frame = new Bai3();
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
	public Bai3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
		Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
		
		JButton btn1 = new JButton("BoxLayout");
		btn1.setForeground(Color.RED);
		btn1.setFont(font);
		pnBox.add(btn1);
		
		JButton btn2 = new JButton("X_AXIS");
		btn2.setForeground(Color.BLUE);
		btn2.setFont(font);
		pnBox.add(btn2);
		
		JButton btn3 = new JButton("Y_AXIS");
		btn3.setForeground(Color.ORANGE);
		btn3.setFont(font);
		pnBox.add(btn3);
		
		Container con = getContentPane();
		con.add(pnBox);
	}

}
