package me.Christian.pack;

public class InvalidBirthdayException extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidBirthdayException(){
		super();
	}
	public InvalidBirthdayException(String theDay){
		super(theDay);
	}
}
