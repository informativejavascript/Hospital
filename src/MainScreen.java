import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainScreen extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setTitle("MainScreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton doctorbutton = new JButton("Doctor");
		doctorbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new TabClass();
			}
		});
		doctorbutton.setBounds(127, 41, 110, 23);
		contentPane.add(doctorbutton);
		
		JButton receptionistbutton = new JButton("Receptionist");
		receptionistbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TabClass();
			}
		});
		receptionistbutton.setBounds(127, 123, 110, 23);
		contentPane.add(receptionistbutton);
	}
}
