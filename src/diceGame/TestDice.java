package diceGame;

public class TestDice {
	public int[] roll_and_count() {
		
			Dice die=new Dice();
			int[] c= {0,0,0,0,0,0};
			int numbrolls=60000;
			for(int i=1;i <= numbrolls;i++) {
				die.roll();
				int fv=die.roll();
				switch(fv) {
				case 1: c[0]++;
				break;
				case 2: c[1]++;
				break;
				case 3: c[2]++;
				break;
				case 4: c[3]++;
				break;
				case 5: c[4]++;
				break;
				case 6: c[5]++;
				}	
				
			}
		return c;	
	}
	
//	public double[] percentage() {
//		Dice die=new Dice();
//		int[] c= {0,0,0,0,0,0};
//		int numbrolls=10000000;
//		for(int i=1;i <= numbrolls;i++) {
//			die.roll();
//			int fv=die.roll();
//			switch(fv) {
//			case 1: c[0]++;
//			break;
//			case 2: c[1]++;
//			break;
//			case 3: c[2]++;
//			break;
//			case 4: c[3]++;
//			break;
//			case 5: c[4]++;
//			break;
//			case 6: c[5]++;
//			}	
//			
//		}
//		double expected = (double)numbrolls/6;
//		double[] per= {0,0,0,0,0,0};
//		for(int i=0;i<6;i++)  {
//			per[i]=(c[i]-expected)/expected*100;
//		}
//		return per;
//		double diff1=c1-expected;
//		double diff2=c2-expected;
//		double diff3=c3-expected;
//		double diff4=c4-expected;
//		double diff5=c5-expected;
//		double diff6=c6-expected;
//		double per1 =diff1/expected*100;
//		double per2 =diff2/expected*100;
//		double per3 =diff3/expected*100;
//		double per4 =diff4/expected*100;
//		double per5 =diff5/expected*100;
//		double per6 =diff6/expected*100;
//		System.out.println(" Number of 1's rolled: "+c[0]+".");
//		System.out.println(" Number of 2's rolled: "+c[1]+".");
//		System.out.println(" Number of 3's rolled: "+c[2]+".");
//		System.out.println(" Number of 4's rolled: "+c[3]+".");
//		System.out.println(" Number of 5's rolled: "+c[4]+".");
//		System.out.println(" Number of 6's rolled: "+c[5]+".");
//		System.out.print(""+per[0]+"  ");
//		System.out.print(""+per[1]+"  ");
//		System.out.print(""+per[2]+"  ");
//		System.out.print(""+per[3]+"  ");
//		System.out.print(""+per[4]+"  ");
//		System.out.print(""+per[5]+"  ");
	}




