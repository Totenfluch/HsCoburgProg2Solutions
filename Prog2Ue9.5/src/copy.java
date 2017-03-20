import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy {

	public static void main(String[] args) {
		if(args.length < 2){
			System.err.println("not enoug params");
			System.exit(1);
		}
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		if(!f1.exists()){
			System.err.println("Source doesn't exist - exiting");
			System.exit(1);
		}
		
		try(FileInputStream fis = new FileInputStream(f1); FileOutputStream fos = new FileOutputStream(f2)){
			byte[] buf = new byte[4096];
			int len;
			while((len = fis.read(buf)) > 0){
				fos.write(buf,  0, len);
			}
		}catch(Exception e){}
		
	}

}
