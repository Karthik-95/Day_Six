package Conditions;

public class Demo7 {
	public static void main(String[]args) {
		int rate=35;
		if(rate>=90&&rate<100) {
			System.out.println("Block Buster");
		}
		else if(rate>=70&&rate<90) {
			System.out.println("Good Movie");
		}
		else if(rate>=50&&rate<70) {
			System.out.println("One time watch");
		}
		else if(rate>=30&&rate<50) {
			System.out.println("Ok");
		}
		else if(rate<30) {
			System.out.println("Flop");
		}
		}
		
	}


