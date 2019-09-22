package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Bai4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4 frame = new Bai4();
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
	public Bai4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.RED);
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.RED);
		pnBorder.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnBorder.add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.BLUE);
		pnBorder.add(pnEast, BorderLayout.EAST);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		pnBorder.add(pnCenter, BorderLayout.CENTER);
		
		getContentPane().add(pnBorder);
	}

}
