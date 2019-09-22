package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Bai2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 frame = new Bai2();
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
	public Bai2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.pink);
		
		JButton btn1 = new JButton("FlowLayout");
		pnFlow.add(btn1);
		
		JButton btn2 = new JButton("Add controls");
		pnFlow.add(btn2);
		
		JButton btn3 = new JButton("Above a line");
		pnFlow.add(btn3);
		
		JButton btn4 = new JButton("Below a line");
		pnFlow.add(btn4);
		
		JButton btn5 = new JButton("Down a line");
		pnFlow.add(btn5);
		
		Container con = getContentPane();
		con.add(pnFlow);
	}
}
