package me.christian.filewalker;

public class Main {

	public static void main(String[] args) {
		FTW ftw = new FTW("C:\\Users\\Christian\\Desktop\\mysqldumper");
		ftw.countnames();
		//Filecount fc = new Filecount("C:\\Users\\Christian\\Desktop\\mysqldumper");
		//System.out.println(fc.getCount());
		

	}

}
