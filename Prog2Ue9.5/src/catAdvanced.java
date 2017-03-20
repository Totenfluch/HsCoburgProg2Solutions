import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class catAdvanced {
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
			int linecount = 0;
			while((line = br.readLine()) != null){

				System.out.println(line);
				if(linecount >= 40){
					try(Scanner sc = new Scanner(System.in)){
						sc.next();
					}catch(Exception e){}
					linecount = 0;
				}
				linecount++;
			}
		}catch(Exception e){}
	}
}
