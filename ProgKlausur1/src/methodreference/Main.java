package methodreference;
import java.util.ArrayList;


public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Einfach L�sung */
		replaceStrings f1 = (s,cs1,cs2) -> s.replace(cs1, cs2);
		splitString f2 = (s3, s4, in) -> s3.split(s4, in);
		createArrayList<Integer> f3 = () -> new ArrayList<Integer>();
		
		Func f4 = Foo::foo;
		/* Einfache L�sung Ende */
		
		/* Schwierige L�sung */
		TriFunction<String, String, String> f5 = (s,cs1,cs2) -> s.replace(cs1, cs2);
		TriFunctionArray<String, String, Integer> f6 = (s3, s4, in) -> s3.split(s4, in);
		// Rest Analog zur einfachen L�sung
		/* Schwierige L�sung Ende*/
		
	}
	
	/* Einfach L�sung */
	interface replaceStrings{
		String apply(String a, String b, String c);
	}
	
	interface splitString{
		String[] apply(String s3, String s4, int splint);
	}
	
	interface createArrayList<E>{
		ArrayList<E> apply();
	}
	
	interface Func{
		public String apply(int n);
	}
	
	/* Einfache L�sung Ende */
	
	
	/* Schwierige L�sung */
	interface TriFunction<E,K,V>{
		E apply(E x, K y, V z);
	}
	interface TriFunctionArray<E,K,V>{
		E[] apply(E x, K y, V z);
	}
	/* Schwierige L�sung Ende*/
	
}
