package Conditions;

public class Demo8 {
	public static void main(String[]args) {
		int raja=18;
		int ravi=35;
		int ram=22;
		if(raja>ravi&&raja>ram) {
			System.out.println("raja is elder");
		}
		else if(ravi>raja&&ravi>ram) {
			System.out.println("ravi is elder");
		}
		else if(ram>raja&&ram>ravi) {
			System.out.println("ram is elder");
		}
	}

}
