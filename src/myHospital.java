import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.Label;
import java.awt.TextArea;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.Element;
import javax.swing.text.TextAction;

import hospital.person.Doctor;
import hospital.person.Person;

public class myHospital extends JFrame {
	private JTextField textField1 = new JTextField(10);
	private JTextField textField2 = new JTextField(10);
	private int clicked = 1;
	private int counter = 0;
	
	public void displaydocname() {
		Doctor d1 = new Doctor(1000, "Jim", "Amsterdam", "Doc");
		Doctor d2 = new Doctor(1001, "Jack", "Berlin", "Doc");
		Doctor d3 = new Doctor(1002, "Karin", "Rotterdam", "Doc");
		Doctor[] docarray = new Doctor[] { d1, d2, d3 };

		/* Main Frame */
		JFrame f = new JFrame("Doctors Details");
		
		/* list to display the doctors name */
		JList<Object> jist = new JList<Object>(new DefaultComboBoxModel(docarray));
		jist.setCellRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index,
						isSelected, cellHasFocus);
				if (value instanceof Doctor) {
					Doctor doc = (Doctor) value;
					setText(doc.getName());
					setForeground( Color.gray );
					setBorder(new LineBorder(Color.BLUE));
					textField2.setText("0");
					counter=0;
				}
				return this;
			}
			public int getHorizontalAlignment() {
                return CENTER;
			}
		});

		/* Text field to diaply the doctors city name when slected */
		textField1.setHorizontalAlignment(JTextField.CENTER);
		textField1.setMaximumSize( textField1.getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
		textField1.setBorder(border);
		textField1.setBackground(Color.WHITE);
		textField1.setForeground(Color.gray );
		MouseListener mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JList theList = (JList) e.getSource();
				if (e.getClickCount() == 1) {
					int index = theList.locationToIndex(e.getPoint());
					if (index >= 0) {
						Doctor o = (Doctor) theList.getModel().getElementAt(
								index);
						textField1.setText((o).getAddress());
					}
				}
			}
		};
		jist.addMouseListener(mouseListener);

		textField2.setHorizontalAlignment(JTextField.CENTER);
		textField2.setMaximumSize( textField2.getPreferredSize());
		textField2.setBorder(border);
		textField2.setBackground(Color.WHITE);
		textField2.setForeground(Color.gray );
		textField2.setText("0");
		
		/* Salary increment counter */
		ActionListener getsalary = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				{
					if (clicked >= 1) {
						counter += 100;
					}
					textField2.setText(String.valueOf(counter));
					clicked++;
				}
			}
		};
		
		/*Box */
		Box box = Box.createVerticalBox();
		JLabel name = new JLabel("Name");
		name.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		name.setFont(new Font("sans-serif", Font.BOLD, 16));
		name.setForeground(Color.BLACK);
		box.add(name);

		jist.setFixedCellHeight(30);
		jist.setFixedCellWidth(100);
		box.add(jist);

		JLabel city = new JLabel("City");
		city.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		city.setFont(new Font("sans-serif", Font.BOLD, 16));
		city.setForeground(Color.BLACK);
		box.add(city);
		
			
		box.add(textField1);
		textField1.setEditable(false);
		
		JLabel salary = new JLabel("Salary");
		salary.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		salary.setFont(new Font("sans-serif", Font.BOLD, 16));
		salary.setForeground(Color.BLACK);
		box.add(salary);
		
		box.add(textField2);
		textField2.setEditable(false);

		add(box);

		/* Panel with Buttons */
		JPanel p1 = new JPanel(new BorderLayout());
		JButton button1 = new JButton("Add Salary");
		JButton button2 = new JButton("Add Doctor");
		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(button1);
		button1.addActionListener(getsalary);
		p2.add(button2);
		p1.add(BorderLayout.CENTER, p2);

		box.add(p1);

		
		setSize(300, 300);
		setResizable(true);
		setVisible(true);
	}

	public static void main(String[] args) {

		new myHospital().displaydocname();

	}
}