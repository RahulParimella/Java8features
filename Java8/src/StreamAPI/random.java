
package StreamAPI;

import java.util.ArrayDeque;
import java.util.Deque;

public class random {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();

		deque.add("a");

		deque.push("b");

		deque.offer("c");

		System.out.println(deque);
	}

}
