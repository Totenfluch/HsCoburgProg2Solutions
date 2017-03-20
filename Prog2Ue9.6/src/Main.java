import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(ReverseInputStream ris = new ReverseInputStream(new FileInputStream(new File("src//input.txt")))){
			byte[] buffer = new byte[24];
			while(ris.read(buffer, 0, buffer.length) != -1)
				System.out.println(buffer);
		}
	}

}
