package inheritance;

class Cricket{
	void TestCricket() {
		System.out.println("test cricket is invoked");
	}
}
class Ttwenty extends Cricket{
	void TwentyTwenty() {
		System.out.println("t20 cricket is invoked");
	}
}
class Odi extends Cricket{
	void OneDay() {
		System.out.println("ODI is invoked");
	}


}
public class HierarchialInheritance {
public static void main(String[] args) {
	Odi odi =new Odi();
	odi.OneDay();
	odi.TestCricket();
	//odi.TwentyTwenty();
}
}
