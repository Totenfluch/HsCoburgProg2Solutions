package me.Christian.pack;

public class Buch implements Comparable<Buch>{
	private String autor;
	private String isbn;
	private String titel;
	public Buch(String autor, String titel, String isbn){
		this.autor = autor;
		this.isbn = isbn;
		this.titel = titel;
	}
	public String getAutor() {
		return autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitel() {
		return titel;
	}
	
	public String toString(){
		return autor + " " + "\""+titel+"\" " + isbn;
	}
	@Override
	public int compareTo(Buch buch) {
		return buch.getTitel().compareTo(titel);
	}
}
