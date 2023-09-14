package JavaFunctionalInterface;

public interface NewPen extends Pen{

	class NewPencil implements NewPen{

		@Override
		public void write(int a) {
			// TODO Auto-generated method stub
			System.out.println("i have to write"  + a + "pages");
		}

		@Override
		public void say(String str) {
			// TODO Auto-generated method stub
			System.out.println(str);
		}

	
		
	}
	public static void main(String[] args) {
		NewPencil pencil =new NewPencil();
		pencil.say("This is my pen ");
		pencil.write(20);
	}
}
