import java.io.File;
import java.io.FileInputStream;

public class compare {
	public static void main(String[] args) {
		if(args.length != 2)
			System.err.println("Invalid arg count");
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		if(f1.exists()){
			System.err.println("File : " + args[0] + " doesn't exist...");
			System.exit(1);
		}
		if(f2.exists()){
			System.err.println("File : " + args[1] + " doesn't exist...");
			System.exit(1);
		}
		try(FileInputStream fis1 = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);){
			byte[] fis1b = new byte[4096];
			byte[] fis2b = new byte[4096];
			int len1,len2;
			while((len1 = fis1.read(fis1b)) > 0 && ((len2 = fis2.read(fis2b)) > 0)){
				if(!fis1b.equals(fis2b) || len1 != len2){
					System.out.println("false");
					System.exit(1);
				}
			}
			System.out.println("true");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
