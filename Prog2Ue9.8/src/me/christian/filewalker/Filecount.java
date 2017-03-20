package me.christian.filewalker;

import java.io.File;

public class Filecount extends FTW{

	private int count = 0;
	
	public Filecount(String path) {
		super(path);
		walk(new File(path));
	}
	
	@Override
	void atFile(File f, int dep){
		count++;
	}
	
	public int getCount(){
		return count;
	}

}
