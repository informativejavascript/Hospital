import java.awt.Component;
import java.awt.Dimension;
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

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.text.Element;
import javax.swing.text.TextAction;

import hospital.person.Doctor;
import hospital.person.Person;

public class myHospital extends JFrame {

	private void displaydocname() {

		Doctor d1 = new Doctor(1000, "Jim", "Amsterdam", "Doc");
		Doctor d2 = new Doctor(1001, "Jack", "Berlin", "Doc");
		Doctor d3 = new Doctor(1002, "Karin", "Rotterdam", "Doc");
		Doctor[] docarray = new Doctor[] { d1, d2, d3 };
		final JTextArea textarea = new JTextArea();

		
		JList<Object> jist = new JList<Object>(new DefaultComboBoxModel(docarray));
		jist.setCellRenderer(new DefaultListCellRenderer() {
			@Override
		    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		        if (value instanceof Doctor) {
		        	Doctor doc = (Doctor) value;
					setText(doc.getName());
		        }
		        return this;
		    }
		});
		
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

		MouseListener mouseListener = new MouseAdapter() {
		      public void mouseClicked(MouseEvent e) {
		        JList theList = (JList) e.getSource();
		        if (e.getClickCount() == 1) {
		          int index = theList.locationToIndex(e.getPoint());
		          if (index >= 0) {
		            Doctor o = (Doctor)theList.getModel().getElementAt(index);
		            textarea.setText((o).getAddress());
		          }
		        }
		      }
		    };

		JPanel panel = new JPanel();
		setSize(300, 400);
		setResizable(true);
		panel.add(new JLabel("List of Doctors:"));
		panel.add(jist);
		panel.add(new JLabel("Doctors is From:"));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		textarea.setBounds(0,0,200,100);
		textarea.setLineWrap(true);
		//textarea.setL
		panel.add(textarea);
		jist.addMouseListener(mouseListener);
		
		panel.add(comboBox1);
		comboBox1.addActionListener(getdetails);
		add(panel);
		setVisible(true);

	}

	public static void main(String[] args) {

		new myHospital().displaydocname();

	}
}