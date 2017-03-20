package me.Christian.pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InvalidBirthdayException{
		Scanner sc = new Scanner(System.in);
		String TheDay = sc.nextLine();

		BirthDay bday = new BirthDay(TheDay);
		bday.checkDay();

		sc.close();
	}
}
