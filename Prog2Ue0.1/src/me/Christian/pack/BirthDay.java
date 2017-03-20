package me.Christian.pack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BirthDay {
	private String theDay;
	
	public BirthDay(String s) throws InvalidBirthdayException{
		this.theDay = s;
	}
	
	public void checkDay() throws InvalidBirthdayException{
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		df.setLenient(false);
		try {
			df.parse(theDay);
		} catch (Exception e) {
			throw new InvalidBirthdayException("Ungültiges Datum");
		}
	}
}
