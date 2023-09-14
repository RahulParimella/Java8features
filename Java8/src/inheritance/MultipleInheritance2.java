package inheritance;


interface Interface1{
	default void show() {
		System.out.println("default interface 1");
	}
}
interface Interface2{
	default void show() {
		System.out.println("default interface 2");
	}
}
 class MultipleInheritance2  implements Interface1 ,Interface2{
	
	 public void show() {
		 
		 Interface1.super.show();
		 Interface2.super.show();
		 
	 }
	 public static void main(String[] args) {
		 MultipleInheritance2 d=new MultipleInheritance2();
		 d.show();
	}

}
