import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class cat {
	public static void main(String[] args) {
		if(args.length != 1){
			System.err.println("invalid length of params");
			System.exit(1);
		}
		File f1 = new File(args[0]);
		if(!f1.exists()){
			System.err.println("File doesn't exist");
			System.exit(1);
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(f1))){
			String line;
			while((line = br.readLine()) != null)
				System.out.println(line);
		}catch(Exception e){}
	}
}
