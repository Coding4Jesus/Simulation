/*
 * Jack Dixon
 * Apr,12,2021
 * make the code for rabbits in a simulation about wolves and rabbits :P
 */
package sim;

import java.util.Random;

public class Simulation {

	public static void main(String[] args) {
		Random r = new Random();
		
		int rabbits = 0;
		int stage = 0;
		int RabFood = 0;
		int RabRepro = 0;
		int RabMaxFood = 45;
		int RabMaxAge = 25;
		int RabMeta = 3;
		int RabMinReFo = 40;
		
		// for starting with a random number of rabbits
		rabbits = r.nextInt(24-18+1)+18;
		
		
		
	}

}
