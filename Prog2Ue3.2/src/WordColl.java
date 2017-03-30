import java.util.StringTokenizer;
import java.util.Vector;

public class WordColl {

	private Vector<String> woerter = new Vector<String>();

	public WordColl(String[] sentences){
		append(sentences);
	}

	int size(){
		return woerter.size();
	}

	int count(String s){
		if(!woerter.contains(s))
			return 0;

		int counter = 0;
		for(String sp : woerter){
			if(sp.equals(s))
				counter++;
		}
		return counter;
	}

	void append(String[] sentences){
		for(String sentence : sentences){
			// Split correctly at . & ,
			sentence = sentence.replace(", ", " , ");
			sentence = sentence.replace(". ", " . ");
			// Split brackets correctly and extract them from the String and replace inside if necessary
			while(sentence.contains("(") && sentence.contains(")")){
				String frag = sentence.substring(sentence.indexOf("("), sentence.indexOf(")")+1);
				char[] frags = frag.toCharArray();
				boolean containsDigit = false;
				for(char c : frags){
					if(Character.isDigit(c))
						containsDigit = true;
				}

				frag = containsDigit ? frag.replace(" ", "") : frag;
				woerter.add(frag);
				sentence = sentence.substring(0, sentence.indexOf("(")) + sentence.substring(sentence.indexOf(")")+1, sentence.length());
			}

			StringTokenizer St = new StringTokenizer(sentence);
			while(St.hasMoreTokens()){
				woerter.add(St.nextToken());
			}
		}
	}

	String top(){
		// Create Temp Vector we can destroy
		Vector<String> temp = new Vector<String>();
		// Clone the Content to the Test Vector
		temp.addAll(woerter);
		String top = "";
		int topint = 0;
		while(temp.size() > 0){
			String first = temp.firstElement();
			int counter = 0;
			while(temp.indexOf(first) != -1){
				temp.remove(first);
				counter++;
			}
			if(counter > topint){
				top = first;
				topint = counter;
			}
		}
		return top;
	}

	public String toString(){
		Vector<String> temp = new Vector<String>();
		temp.addAll(woerter);
		StringBuffer sb = new StringBuffer();
		sb.append("Word                        | count\n");
		sb.append("-----------------------------------------\n");
		int total = 0;
		while(temp.size() > 0){
			String first = temp.firstElement();
			int counter = 0;
			while(temp.indexOf(first) != -1){
				temp.remove(first);
				counter++;
				total++;
			}
			// 28 to make a clear border
			int spaces = 28-first.length() ;
			sb.append(first);
			for(int i=0; i<spaces;i++)
				sb.append(" ");
			sb.append("| " + counter+"\n");
		}
		sb.append("-----------------------------------------\n");
		sb.append("Total: " + total+"\n");
		return sb.toString();
	}

	public static void main(String[] args){
		String[] sentences = { "Thomas Mann , der jüngere", "Bruder von Heinrich Mann" }; 
		WordColl wl = new WordColl(sentences);
		System.out.println("Top Word: " + wl.top());
		System.out.println(wl.toString());
		String[] sentences2 = {"Thomas Mann, der jüngere Bruder von Heinrich Mann (1871–  1950), war Sohn des Kaufmanns und Lübecker Senators Thomas Johann Heinrich Mann.", "Seine Mutter Julia (geborene da Silva-Bruhns) war mütterlicherseits brasilianischer Herkunft. Aus der Ehe gingen noch die Kinder "};
		System.out.println();
		System.out.println("Size: " + wl.size());
		wl.append(sentences2);
		System.out.println("Top Word: " + wl.top());
		System.out.println(wl.toString());
		System.out.println();
		System.out.println("Size: " + wl.size());
	}
}
