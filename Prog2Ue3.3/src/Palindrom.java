import java.util.Stack;

public class Palindrom {
	private Stack<Character> palistack = new Stack<Character>();
	private Stack<Character> palihelpstack = new Stack<Character>();

	public static void main(String[] args){
		Palindrom p = new Palindrom("hannah");
		System.out.println(p.isPalindrom());
	}

	public Palindrom(String word){
		char[] parts = word.toCharArray();
		if(word.length()%2 != 0)
			return;
		int size = word.length();
		for(int i = 0; i<size/2; i++)
			palistack.push(parts[i]);
		for(int i=size-1; i>=size/2; i--)
			palihelpstack.push(parts[i]);

	}

	public boolean isPalindrom(){
		while(palistack.pop().equals(palihelpstack.pop()))
			if(palistack.isEmpty() && palihelpstack.isEmpty())
				return true;
		return false;
	}
}
