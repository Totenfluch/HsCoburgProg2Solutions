package me.christian.filewalker;

import java.io.File;
import java.util.Vector;

public class FTW {

	Vector<String> names = new Vector<String>();
	
	public FTW(String path){
		walk(new File(path));
	}

	public void walk(File n){
		for(File f : n.listFiles())
			if(f.isDirectory())
				enterDir(f, 0);
			else if(f.isFile())
				atFile(f, 0);
	}

	void enterDir(File d, int dep){
		names.add(d.getName());
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i<dep; i++)
			sb.append("- ");
		sb.append(" | Directory: " + d.getPath() + " entered.");
		System.out.println(sb.toString());
		dep++;
		for(File f : d.listFiles())
			if(f.isFile())
				atFile(f, dep);
			else if(f.isDirectory())
				enterDir(f, dep);
		leaveDir(d);
	}

	void leaveDir(File d){
		System.out.println("Directory " +d.getPath() + " completed");
	}

	void atFile(File f, int dep){
		names.add(f.getName());
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i<dep; i++)
			sb.append("- ");
		sb.append(" | File: " + f.getName() + " found.");
		System.out.println(sb.toString());
	}
	
	void countnames(){
		@SuppressWarnings("unchecked")
		Vector<String> temp = (Vector<String>) names.clone();
		for(int i = 0; i<temp.size(); i++){
			String s = temp.elementAt(i);
			temp.removeElementAt(i);
			if(temp.contains(s))
				System.out.println(s);
			temp.remove(s);
		}
	}
}
