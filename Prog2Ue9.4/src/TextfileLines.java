import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Vector;

public class TextfileLines implements Iterable<String>{
	Vector<String> lines = new Vector<String>();
	
	public TextfileLines(String filename) {
		try(BufferedReader br = new BufferedReader(new FileReader(new File(filename)))){
			String line;
			while((line = br.readLine()) != null)
				lines.add(line);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Iterator<String> iterator() {
		return lines.iterator();
	}
	
	public static void main(String[] args) {
		for (String line : new TextfileLines("input.txt"))
			 System.out.println(line);
	}

}
