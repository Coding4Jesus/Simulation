package sim;
public class Simulation {
/* 
 * Jesus on wolves
 * Jack on rabbits
 * Devin on the environment
 */
	public static void main(String[] args) {
		Wolves wolves = new Wolves();			//testing
		
		System.out.println(wolves.returnW1());	//test
		wolves.ChangeW1(5);
		System.out.print(wolves.returnW1());

	}
	
	public static class Wolves {
		private int NumberW1, MetabolW2, StartFW3, MaxFW4, MaxAgeW5, ChancetoXW6;		//the 6 variables I think we'll need
		public Wolves() {																		//numbered to keep them in mind more easily
			NumberW1 = 10;	//initial values
			MetabolW2 = 10;	//just placeholder
			StartFW3 = 50;
			MaxFW4 = 150;
			MaxAgeW5 = 50;
			ChancetoXW6 = 75;
		}
		public void ChangeW1(int placehold) { 
			NumberW1 = placehold;				//they all change the initial values
		}
		public void ChangeW2(int placehold) {
			MetabolW2 = placehold;
		}
		public void ChangeW3(int placehold) {
			StartFW3 = placehold;
		}
		public void ChangeW4(int placehold) {
			MaxFW4 = placehold;
		}
		public void ChangeW5(int placehold) {
			MaxAgeW5 = placehold;
		}
		public void ChangeW6(int placehold) {
			ChancetoXW6 = placehold;
		}
		public int returnW1() {					//return said values
			return(NumberW1);
		}
		public int returnW2() {
			return(MetabolW2);
		}
		public int returnW3() {
			return(StartFW3);
		}
		public int returnW4() {
			return(MaxFW4);
		}
		public int returnW5() {
			return(MaxAgeW5);
		}
		public double returnW6() {				//ChancetoX6 is returned as a double since it 
			double a;							//is easier to work with a fraction for its intended
			a=ChancetoXW6/100;					//purposes
			return(a);
		}
	}
}
