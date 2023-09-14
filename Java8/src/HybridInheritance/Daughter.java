package HybridInheritance;
//multilevel  and hierarchial

class GrandFather{
	void ShowG() {
		System.out.println("he is grandfather");
	}
}
class Father extends GrandFather{
	void showF() {
		System.out.println("he is father");
	}
}
class Son extends Father{
	void showSon() {
		System.out.println("he is son");
	}
}
public class Daughter extends Father {
void showDaughter() {
	System.out.println("she is daughter");
}
public static void main(String[] args) {
	Son s=new Son();
	s.showF();
	s.ShowG();
	s.showSon();
	Daughter d=new Daughter();
	d.showDaughter();
	d.showF();
	d.ShowG();
}
}
