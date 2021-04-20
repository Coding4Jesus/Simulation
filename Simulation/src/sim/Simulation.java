package sim;


public class Simulation {
/* 
 * Jesus on wolves
 * Jack on rabbits
 * Devin on the environment
 */
	public static void main(String[] args) {
		Wolves wolves = new Wolves();			//testing
		Wolves wolves2 = new Wolves();
		System.out.print(wolves.NumberW1);
		
		Rabbits rabbits = new Rabbits(); //testing stuff
		Rabbits rabbits2 = new Rabbits();
		System.out.println("");
		System.out.println(rabbits.RabNum1);
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
	
	public static class Rabbits {
		
		public static int RabNum1, RabMeta2, RabFS3, RabFM4, RabOld5, ChanceToM6; //based on Jesus's code I should only need 6 variables, if not i can add some later
		public Rabbits () {
			
			RabNum1 = 10; //placeholder value, mostly for testing stuff
			RabMeta2 = 10; //also a placeholder value
			RabFS3 = 15; //initial amount of food
			RabFM4 = 40; //maximum amount of food
			RabOld5 = 25; //maximum age
			ChanceToM6 = 50; //chance to reproduce if in proper enviroment (check the website reference to see proper enviroment)
			
		}
		
		public void Alter1(int placehold) {
			RabNum1 = placehold;              //for changing the values
		}
		public void Alter2(int placehold) {
			RabMeta2 = placehold;
		}
		public void Alter3(int placehold) {
			RabFS3 = placehold;
		}
		public void Alter4(int placehold) {
			RabFM4 = placehold;
		}
		public void Alter5(int placehold) {
			RabOld5 = placehold;
		}
		public void Alter6(int placehold) {
			ChanceToM6 = placehold;
		}
		public int Send1() {
			return(RabNum1);
		}
		public int Send2() {
			return(RabMeta2);
		}
		public int Send3() {
			return(RabFS3);
		}
		public int Send4() {
			return(RabFM4);
		}
		public int Send5() {
			return(RabOld5);
		}
		public double Send6() {
			double b;
			b = ChanceToM6/100;
			return(b);
		}
		
	}
	
}
