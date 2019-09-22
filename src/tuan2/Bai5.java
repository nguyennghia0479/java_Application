package tuan2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Bai5 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;
	private JTextField txt_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5 frame = new Bai5();
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
	public Bai5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 291);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 434, 49);
		panel.add(panel_1);
		
		JLabel lblTieuDe = new JLabel("Gi\u1EA3i Ph\u01B0\u01A1ng Tr\u00ECnh B\u1EADc 2");
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblTieuDe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Input a, b, c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(0, 49, 434, 178);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		txt_a = new JTextField();
		txt_a.setBounds(142, 24, 200, 20);
		panel_2.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setBounds(142, 55, 200, 20);
		panel_2.add(txt_b);
		txt_b.setColumns(10);
		
		txt_c = new JTextField();
		txt_c.setBounds(142, 86, 200, 20);
		panel_2.add(txt_c);
		txt_c.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(221, 117, 48, 14);
		panel_2.add(lblResult);
		
		txt_result = new JTextField();
		txt_result.setEnabled(false);
		txt_result.setBounds(142, 142, 200, 20);
		panel_2.add(txt_result);
		txt_result.setColumns(10);
		
		JLabel lbl_a = new JLabel("a: ");
		lbl_a.setBounds(114, 27, 18, 14);
		panel_2.add(lbl_a);
		
		JLabel lbl_b = new JLabel("b: ");
		lbl_b.setBounds(114, 58, 18, 14);
		panel_2.add(lbl_b);
		
		JLabel lbl_c = new JLabel("c: ");
		lbl_c.setBounds(114, 89, 18, 14);
		panel_2.add(lbl_c);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 255), null), "Choose action", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(0, 227, 434, 65);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnCaculator = new JButton("Caculator");
		btnCaculator.setBounds(54, 31, 89, 23);
		panel_3.add(btnCaculator);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(161, 31, 89, 23);
		panel_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(271, 31, 89, 23);
		panel_3.add(btnExit);
	}
}
