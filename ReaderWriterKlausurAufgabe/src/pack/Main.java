package pack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		String output = "";
		char[] buffer;
		try(BufferedReader br = new BufferedReader(new FileReader(new File("src//input.txt"))); BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src//output.txt")))){
			while((output += br.readLine()) != null && br.readLine() != null);
			buffer = output.toCharArray();
			for(int i = 0 ; i<output.length(); i++)
				if(buffer[i] == 'X')
					buffer[i] = ' ';
				else if(buffer[i] == ' ')
					buffer[i] = 'X';
			bw.write(buffer);
		}catch(Exception e){}
	}
}