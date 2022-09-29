package Conditions;

public class Demo10 {
	public static void main(String[]args) {
	int shop1=339;
	int shop2=250;
	int shop3=99;
	if(shop1<shop2&&shop1<shop3) {
		System.out.println("shop1 ");
	}
	else if(shop2<shop1&&shop2<shop3) {
		System.out.println("shop2");
	}
	else if(shop3<shop1&&shop3<shop2){
		System.out.println("shop3");
	}

	}
}
