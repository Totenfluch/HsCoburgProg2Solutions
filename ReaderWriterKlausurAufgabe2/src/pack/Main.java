package pack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream(new File("src//input.txt"))); OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(new File("src//output.txt")))){
			char buffer;
			int lol;
			while((lol = fis.read()) !=  -1){
				buffer = (char)lol;
				if(buffer == 'X')
					buffer = ' ';
				else if(buffer == ' ')
					buffer = 'X';
				fos.write(buffer);
			}
		}catch(Exception e){}
	}
}