package JavaMethodReferences;
interface puma{
	void message(String msg);
}
public class MethodReference3 {
		MethodReference3(String msg){
			System.out.println(msg);
		}
		public static void main(String args[]) {
			puma p=MethodReference3::new;
			p.message("PUMA");
		}
}
