import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hospital.person.Doctor;
import hospital.person.Person;
import hospital.person.Receptionist;
import hospital.rooms.Storage;
import hospital.rooms.Testing;

public class myHospital extends JFrame {

	JPanel panel = new JPanel();
	JButton docbutton = new JButton("Doctors");
	JButton recpbutton = new JButton("Receptionist");
	JButton clrbutton = new JButton("Clear");
	JLabel list = new JLabel("List");
	JTextArea textarea = new JTextArea(5, 10);

	public static void main(String[] args) {

		new myHospital();
	}

	public String listofdoctors() {
		StringBuilder sb = new StringBuilder();
		Doctor[] Doctorlist = new Doctor[3];
		Doctorlist[0] = new Doctor(1000, "Jim", "Amsterdam", "Doc");
		Doctorlist[1] = new Doctor(1001, "Jack", "Berlin", "Doc");
		Doctorlist[2] = new Doctor(1002, "Karin", "Rotterdam", "Doc");

		for (int i = 0; i < Doctorlist.length; i++) {
			sb.append(Doctorlist[i].getName());
			sb.append("\n");
		}
		return sb.toString();
	}

	public String Receptionlist() {
		StringBuilder sb = new StringBuilder();
		Receptionist[] replist = new Receptionist[2];
		replist[0] = new Receptionist(2000, "Claire", "Munster", "Recp");
		replist[1] = new Receptionist(2001, "Nancy", "Hengelo", "Recp");

		for (int j = 0; j < replist.length; j++) {
			sb.append(replist[j].getName());
			sb.append("\n");
		}
		return sb.toString();
	}

	public myHospital() {

		super("List of Doctors");
		setSize(300, 400);
		setResizable(true);

		panel.add(docbutton);
		panel.add(textarea);

		panel.add(recpbutton);
		panel.add(clrbutton);
		panel.add(list);

		docbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textarea.setText(null);
				textarea.setText(listofdoctors());
			}

		});
		recpbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textarea.setText(null);
				textarea.setText(Receptionlist());
			}

		});
		panel.add(textarea);

		clrbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textarea.setText(null);
			}

		});

		add(panel);
		setVisible(true);
	}

}
