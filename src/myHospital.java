import java.awt.Component;
import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.Label;
import java.awt.TextArea;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.TextAction;

import hospital.person.Doctor;

public class myHospital extends JFrame {

	private void displaydocname() {

		Doctor d1 = new Doctor(1000, "Jim", "Amsterdam", "Doc");
		Doctor d2 = new Doctor(1001, "Jack", "Berlin", "Doc");
		Doctor d3 = new Doctor(1002, "Karin", "Rotterdam", "Doc");
		Doctor[] docarray = new Doctor[] { d1, d2, d3 };
		final JTextArea textarea = new JTextArea();

		JComboBox<Object> comboBox1 = new JComboBox<Object>(
				new DefaultComboBoxModel(docarray));
		comboBox1.setRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index,
						isSelected, cellHasFocus);
				if (value instanceof Doctor) {
					Doctor doc = (Doctor) value;
					setText(doc.getName());
				}
				return this;
			}
		});

		ActionListener getdetails = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox is = (JComboBox) e.getSource();
				Doctor s = (Doctor) is.getSelectedItem();
				textarea.setText(s.getAddress());
			}

		};

		JPanel panel = new JPanel();
		setSize(300, 400);
		setResizable(true);
		panel.add(new JLabel("List of Doctors:"));
		panel.add(comboBox1);
		panel.add(new JLabel("Doctors is From:"));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(textarea);
		comboBox1.addActionListener(getdetails);
		add(panel);
		setVisible(true);

	}

	public static void main(String[] args) {

		new myHospital().displaydocname();

	}
}