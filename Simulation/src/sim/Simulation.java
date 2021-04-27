package sim;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Simulation {

/* 
 * Jesus on wolves
 * Jack on rabbits
 * Devin on the environment
 */

	private JFrame frame;
	private JPanel panel;
	private JButton[] grid;
	private JButton start, nextDay;
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
		Wolves wolves = new Wolves();
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		wl = new JLabel("WOLF PARAMETERS");   //builds the labels and text boxes for changing the parameters
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
		
		l2 = new JLabel("Metabolism rate ");
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
		
		l4 = new JLabel("Max food allowed ");
		c.gridx = 1;
		c.gridy = 4;
		panel.add(l4, c);
		
		w5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 5;
		panel.add(w5, c);
		
		l5 = new JLabel("Max age ");
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
		
		l8 = new JLabel("Metabolism rate ");
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
		
		l10 = new JLabel("Max food allowed ");
		c.gridx = 1;
		c.gridy = 12;
		panel.add(l10, c);
		
		r5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 13;
		panel.add(r5, c);
		
		l11 = new JLabel("Max age ");
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
		
		start = new JButton("Set Parameters");
		
		grid = new JButton[100];
		
		String[] b;
		b = new String[100];
		
		for (int a = 0; a < 100 ; a++) {	//hopefully 100 strings, 0 as "1", 1 as "2" etc. 
			String ba;
			ba = Integer.toString(a+1);
			b[a] = ba;
		}
		//String b[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
		//		    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
		//		    "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
		//		    "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80",
		//		    "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
		
		for(int i = 0; i<grid.length; i++) {  //builds the grid for the simulation 
			grid[i] = new JButton(" ");
			c.gridx = i+4;
			c.gridy = 2;
			if (i > 9) {
				c.gridx = i-6;
				c.gridy = 3;
			}
			if (i > 19) {
				c.gridx = i - 16;
				c.gridy = 4;
			}
			if (i > 29) {
				c.gridx = i - 26;
				c.gridy = 5;
			}
			if (i > 39) {
				c.gridx = i - 36;
				c.gridy = 6;
			}
			if (i > 49) {
				c.gridx = i - 46;
				c.gridy = 7;
			}
			if (i > 59) {
				c.gridx = i - 56;
				c.gridy = 8;
			}
			if (i > 69) {
				c.gridx = i - 66;
				c.gridy = 9;
			}
			if (i > 79) {
				c.gridx = i - 76;
				c.gridy = 10;
			}
			if (i > 89) {
				c.gridx = i - 86;
				c.gridy = 11;
	}
			panel.add(grid[i], c);
			System.out.println(i);
		}
			
			
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(w1.getText() != "" && w1.getText() != " ") {		
				wolves.WolAlter1(Integer.parseInt(w1.getText()));	//parses all input to ints and inserts them into the wolves class
				}													//also checks for no empty text boxes
				if(w2.getText() != "" && w2.getText() != " ") {
				wolves.WolAlter2(Integer.parseInt(w2.getText()));
				}
				if(w3.getText() != "" && w3.getText() != " "){
				wolves.WolAlter3(Integer.parseInt(w3.getText()));
				}
				if(w4.getText() != "" && w4.getText() != " ") {
				wolves.WolAlter4(Integer.parseInt(w4.getText()));
				}
				if(w5.getText() != "" && w5.getText() != " ") {
				wolves.WolAlter5(Integer.parseInt(w5.getText()));
				}
				if(w6.getText() != "" && w6.getText() != " ") {
				wolves.WolAlter6(Integer.parseInt(w6.getText()));
				}
				
			}
		});
		c.gridx = 3;
		c.gridy = 0;
		panel.add(start, c);
		
		nextDay = new JButton("Next Day");
		
		c.gridx = 3;
		c.gridy = 1;
		panel.add(nextDay, c);
		
		frame.setContentPane(panel);
		
		frame.setVisible(true);
		
	}


	public static void main(String[] args) {

		Simulation run = new Simulation();
		
	}
	
	public static class Wolves {
		private int WolNum1, WolMeta2, WolFS3, WolFM4, WolOld5, WolChance6;		//the 6 variables I think we'll need
		public Wolves() {																		//numbered to keep them in mind more easily
			WolNum1 = 10;	//initial values
			WolMeta2 = 10;	//just placeholder
			WolFS3 = 50;
			WolFM4 = 150;
			WolOld5 = 50;
			WolChance6 = 75;
		}
		public int WolAlter1(int placehold) { 
			WolNum1 = placehold;				//they all change the initial values
			return(WolNum1);					//and return them
		}
		public int WolAlter2(int placehold) {
			WolMeta2 = placehold;
			return(WolMeta2);
		}
		public int WolAlter3(int placehold) {
			WolFS3 = placehold;
			return(WolFS3);
		}
		public int WolAlter4(int placehold) {
			WolFM4 = placehold;
			return(WolFM4);
		}
		public int WolAlter5(int placehold) {
			WolOld5 = placehold;
			return(WolOld5);
		}
		public int WolAlter6(int placehold) {
			int a;
			WolChance6 = placehold;
			a = WolChance6/100;
			return(a);
		}
		public int WolSend1() { 				
			return(WolNum1);					//just return them
		}
		public int WolSend2() {
			return(WolMeta2);
		}
		public int WolSend3() {			
			return(WolFS3);
		}
		public int WolSend4() {			
			return(WolFM4);
		}
		public int WolSend5() {
			return(WolOld5);
		}
		public int WolSend6() {
			int a;
			a = WolChance6/100;
			return(a);
		}
	}
	
	public static class Rabbits {
		
		public static int RabNum1, RabMeta2, RabFS3, RabFM4, RabOld5, RabChance6; //based on Jesus's code I should only need 6 variables, if not i can add some later
		public Rabbits () {
			
			RabNum1 = 15; //placeholder value, mostly for testing stuff.      the value that stores the number of rabbits
			RabMeta2 = 10; //also a placeholder value       the value that stores the rabbit's metabolism
			RabFS3 = 15; //initial amount of food
			RabFM4 = 40; //maximum amount of food
			RabOld5 = 25; //maximum age
			RabChance6 = 50; //chance to reproduce if in proper enviroment (check the website reference to see proper enviroment)
			
		}
		
		public void RabAlter1(int placehold) {
			RabNum1 = placehold;              //for changing the values
		}
		public void RabAlter2(int placehold) {
			RabMeta2 = placehold;
		}
		public void RabAlter3(int placehold) {
			RabFS3 = placehold;
		}
		public void RabAlter4(int placehold) {
			RabFM4 = placehold;
		}
		public void RabAlter5(int placehold) {
			RabOld5 = placehold;
		}
		public void RabAlter6(int placehold) {
			RabChance6 = placehold;
		}
		public int RabSend1() {
			return(RabNum1);              //for returning the values
		}
		public int RabSend2() {
			return(RabMeta2);
		}
		public int RabSend3() {
			return(RabFS3);
		}
		public int RabSend4() {
			return(RabFM4);
		}
		public int RabSend5() {
			return(RabOld5);
		}
		public double RabSend6() {
			double b;
			b = RabChance6/100;
			return(b);
		}
		
		public void RabEat() {
			
			//placeholder, come back to this later when the grass code is ready
			
		}
		
		public void RabMove() {
			
			//placeholder, come back to this later when the grass code is ready
			
		}
		
		public void RabAge() {
			
			// evertime new day is pressed the age goes up by 1
			
			int age[];
			
		}
		
		public void RabRepro() {
			
			//placeholder, come back to this later when the grass code is ready
			
		}
		
	}
	
}
