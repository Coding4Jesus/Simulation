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
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10 ,l11, l12, wl, rl, space;
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
		
		wl = new JLabel("WOLF PARAMETERS");
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
		
		space = new JLabel("   ");
		c.gridx = 1;
		c.gridy = 7;
		panel.add(space, c);
		
		rl = new JLabel("RABBIT PARAMETERS");
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
		c.gridy = 12;
		panel.add(r4, c);
		
		l10 = new JLabel("Max food allowed");
		c.gridx = 1;
		c.gridy = 12;
		panel.add(l10, c);
		
		r5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 13;
		panel.add(r5, c);
		
		l11 = new JLabel("Max age");
		c.gridx = 1;
		c.gridy = 13;
		panel.add(l11, c);
		
		r6 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 14;
		panel.add(r6, c);
		
		l12 = new JLabel("Reproduction probability ");
		c.gridx = 1;
		c.gridy = 14;
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
		Wolves wolves = new Wolves();			//testing
		Wolves wolves2 = new Wolves();
		System.out.print(wolves.NumberW1);
		
		Simulation run = new Simulation();

	}
	
	public static class Wolves {
		private static int NumberW1, Metabol2, StartF3, MaxF4, MaxAge5, ChancetoX6;		//the 6 variables I think we'll need
		public Wolves() {																//numbered to keep them in mind more easily
			NumberW1 = 10;	//initial values
			Metabol2 = 10;	//just placeholder
			StartF3 = 50;
			MaxF4 = 150;
			MaxAge5 = 50;
			ChancetoX6 = 75;
		}
		public void Change1(int placehold) { 
			NumberW1 = placehold;				//they all change the initial values
		}
		public void Change2(int placehold) {
			Metabol2 = placehold;
		}
		public void Change3(int placehold) {
			StartF3 = placehold;
		}
		public void Change4(int placehold) {
			MaxF4 = placehold;
		}
		public void Change5(int placehold) {
			MaxAge5 = placehold;
		}
		public void Change6(int placehold) {
			ChancetoX6 = placehold;
		}
		public int return1() {					//return said values
			return(NumberW1);
		}
		public int return2() {
			return(Metabol2);
		}
		public int return3() {
			return(StartF3);
		}
		public int return4() {
			return(MaxF4);
		}
		public int return5() {
			return(MaxAge5);
		}
		public double return6() {				//ChancetoX6 is returned as a double since it 
			double a;							//is easier to work with a fraction for its intended
			a=ChancetoX6/100;					//purposes
			return(a);
		}
	}
}
