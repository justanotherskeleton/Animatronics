package rchstsa.local;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

public class UI extends JFrame {

	/*
	 * Created 10-26-16
	 * 
	 * This class generates the UI for the controlling computer
	 * It also listens for WASD and the arrow keys to move the motors
	 * 
	 * Controls:
	 * 
	 * WASD - Steering the body
	 * Arrow keys - Translate the dinosaur's head
	 */
	
	private JPanel contentPane;
	private JTextField tfConnect;
	private JTextField tfSpeed;
	
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea eventLog = new JTextArea();
		eventLog.setBounds(10, 364, 493, 176);
		contentPane.add(eventLog);
		
		JLabel lblEventLog = new JLabel("Serial Log");
		lblEventLog.setBounds(10, 339, 179, 14);
		contentPane.add(lblEventLog);
		
		JTextArea networkLog = new JTextArea();
		networkLog.setBounds(10, 249, 493, 79);
		contentPane.add(networkLog);
		
		JLabel lblNetwork = new JLabel("Network | Status:");
		lblNetwork.setBounds(10, 224, 493, 14);
		contentPane.add(lblNetwork);
		
		tfConnect = new JTextField();
		tfConnect.setBounds(10, 11, 148, 20);
		contentPane.add(tfConnect);
		tfConnect.setColumns(10);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(168, 10, 105, 23);
		contentPane.add(btnConnect);
		
		JLabel lblProtocol = new JLabel("Protocol");
		lblProtocol.setBounds(299, 14, 46, 14);
		contentPane.add(lblProtocol);
		
		JCheckBox chckbxHaltMotorsOn = new JCheckBox("Halt motors on disconnect");
		chckbxHaltMotorsOn.setBounds(309, 35, 167, 23);
		contentPane.add(chckbxHaltMotorsOn);
		
		tfSpeed = new JTextField();
		tfSpeed.setColumns(10);
		tfSpeed.setBounds(10, 42, 148, 20);
		contentPane.add(tfSpeed);
		
		JButton btnUpdateSpeed = new JButton("Update speed");
		btnUpdateSpeed.setBounds(168, 41, 105, 23);
		contentPane.add(btnUpdateSpeed);
		
		JLabel lblCc = new JLabel("C&C");
		lblCc.setBounds(10, 93, 46, 14);
		contentPane.add(lblCc);
		
		JButton btnStartControl = new JButton("Start Control");
		btnStartControl.setBounds(10, 118, 112, 23);
		contentPane.add(btnStartControl);
		
		JButton btnForceHalt = new JButton("Force halt");
		btnForceHalt.setBounds(10, 152, 112, 23);
		contentPane.add(btnForceHalt);
	}
}
