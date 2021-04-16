package sim;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Simulation {
	private JFrame frame;
	private JPanel panel;
	private JButton[] grid;
	private JButton start;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10 ,l11, l12, wl, rl;
	private String Grass, Rabbit, Wolf;
	private JTextField w1, w2, w3, w4, w5, w6, r1, r2, r3, r4, r5, r6;
	
	public Simulation() {
		Grass = "G";
		Rabbit = "R";
		Wolf = "W";
		
		frame = new JFrame("Rabbit & Wolf Sim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		wl = new JLabel("WOLF PERAMETERS");
		c.gridx = 1;
		c.gridy = 0;
		panel.add(wl, c);
		
		w1 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 1;
		panel.add(w1, c);
		
		l1 = new JLabel("# of wolves at start ");
		c.gridx = 1;
		c.gridy = 1;
		panel.add(l1, c);
		
		w2 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 2;
		panel.add(w2, c);
		
		l2 = new JLabel("Metabolism rate");
		c.gridx = 1;
		c.gridy = 2;
		panel.add(l2, c);
		
		w3 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 3;
		panel.add(w3, c);
		
		l3 = new JLabel("Amount of food at start ");
		c.gridx = 1;
		c.gridy = 3;
		panel.add(l3, c);
		
		w4 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 4;
		panel.add(w4, c);
		
		l4 = new JLabel("Max food allowed");
		c.gridx = 1;
		c.gridy = 4;
		panel.add(l4, c);
		
		w5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 5;
		panel.add(w5, c);
		
		l5 = new JLabel("Max age");
		c.gridx = 1;
		c.gridy = 5;
		panel.add(l5, c);
		
		w6 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 6;
		panel.add(w6, c);
		
		l6 = new JLabel("Reproduction probability ");
		c.gridx = 1;
		c.gridy = 6;
		panel.add(l6, c);
		
		rl = new JLabel("RABBIT PERAMETERS");
		c.gridx = 1;
		c.gridy = 8;
		panel.add(rl, c);
		
		r1 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 9;
		panel.add(r1, c);
		
		l7 = new JLabel("# of rabbits at start ");
		c.gridx = 1;
		c.gridy = 9;
		panel.add(l7, c);
		
		r2 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 10;
		panel.add(r2, c);
		
		l8 = new JLabel("Metabolism rate");
		c.gridx = 1;
		c.gridy = 10;
		panel.add(l8, c);
		
		r3 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 11;
		panel.add(r3, c);
		
		l9 = new JLabel("Amount of food at start ");
		c.gridx = 1;
		c.gridy = 11;
		panel.add(l9, c);
		
		r4 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 11;
		panel.add(r4, c);
		
		l10 = new JLabel("Max food allowed");
		c.gridx = 1;
		c.gridy = 11;
		panel.add(l10, c);
		
		r5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 12;
		panel.add(r5, c);
		
		l11 = new JLabel("Max age");
		c.gridx = 1;
		c.gridy = 12;
		panel.add(l11, c);
		
		r6 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 13;
		panel.add(r6, c);
		
		l12 = new JLabel("Reproduction probability ");
		c.gridx = 1;
		c.gridy = 13;
		panel.add(l12, c);
		
		start = new JButton("Next Day");
		grid = new JButton[100];
		String b[] = {};
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
			
		});
		
		frame.setContentPane(panel);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Simulation run = new Simulation();

	}

}
