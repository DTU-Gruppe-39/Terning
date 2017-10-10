package diceGame;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		double d1=Math.random() * 6 ;     // 0-6
		return (int)Math.ceil(d1);		
	}
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(roll() + " ");
		}		
	}
}
