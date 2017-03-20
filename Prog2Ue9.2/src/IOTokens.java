import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;

public class IOTokens {
	public IOTokens(String input){
		StreamTokenizer st = new StreamTokenizer(new StringReader(input));
		try{
			while(st.nextToken() != StreamTokenizer.TT_EOF){
				if(st.ttype == StreamTokenizer.TT_WORD){
					System.out.println("Wort: " + st.sval);
				}else if(st.ttype == StreamTokenizer.TT_NUMBER){
					System.out.println("Number: " + st.nval);
				}else if(st.ttype == StreamTokenizer.TT_EOL){
					// Do nothing
				}else{
					System.out.println("Zeichen: " + (char)st.ttype);
				}
			}
		}catch(Exception e){}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			new IOTokens(sc.nextLine());
		}catch(Exception e){}
	}
}
