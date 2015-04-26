import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class PatientsDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public PatientsDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel id = new JLabel("ID");
		id.setBounds(21, 25, 46, 14);
		contentPane.add(id);
		
		JLabel name = new JLabel("Name");
		name.setBounds(21, 72, 46, 14);
		contentPane.add(name);
		
		JLabel city = new JLabel("City");
		city.setBounds(21, 111, 46, 14);
		contentPane.add(city);
		
		JLabel type = new JLabel("New label");
		type.setBounds(21, 162, 46, 14);
		contentPane.add(type);
		
		textField = new JTextField();
		textField.setBounds(96, 22, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 69, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton add = new JButton("Add");
		add.setBounds(93, 209, 89, 23);
		contentPane.add(add);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(93, 159, 100, 28);
		comboBox.addItem("PAT");
		contentPane.add(comboBox);
		
		setTitle("PatientsScreen");
		setVisible(true);
	}
}
