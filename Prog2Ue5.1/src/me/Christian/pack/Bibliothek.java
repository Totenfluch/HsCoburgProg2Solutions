package me.Christian.pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class Bibliothek {
	private ArrayList<Buch> Content;

	public Bibliothek(){
		Content = new ArrayList<Buch>();
	}

	public boolean einfügen(Buch b){
		return Content.add(b);
	}

	public Collection<Buch> sucheNachAutor(String autor){
		ArrayList<Buch> returnContent = new ArrayList<Buch>();
		Iterator<Buch> Li = Content.iterator();
		while(Li.hasNext()){
			Buch b = Li.next();
			if(b.getAutor().equals(autor))
				returnContent.add(b);
		}
		return returnContent;
	}

	public Collection<Buch> sucheNachAutor(String autor, ArrayList<Buch> toSearch){
		ArrayList<Buch> returnContent = new ArrayList<Buch>();
		Iterator<Buch> Li = toSearch.iterator();
		while(Li.hasNext()){
			Buch b = Li.next();
			if(b.getAutor().equals(autor))
				returnContent.add(b);
		}
		return returnContent;
	}

	public Collection<String> sucheNachAutorTiteln(String autor, ArrayList<Buch> toSearch){
		ArrayList<String> returnContent = new ArrayList<String>();
		Iterator<Buch> Li = toSearch.iterator();
		while(Li.hasNext()){
			Buch b = Li.next();
			if(b.getAutor().equals(autor))
				returnContent.add(b.getTitel());
		}
		return returnContent;
	}

	public Buch sucheNachISBN(String isbn){
		int index;
		if((index = Content.indexOf(isbn)) != -1)
			return Content.get(index);
		else
			return null;
	}

	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp){
		Content.sort(comp);
		return Content;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, ArrayList<String>> bestandNachAutor(){
		// Array to return Authors with a ArrayList of their books
		HashMap<String, ArrayList<String>> BnA = new HashMap<String, ArrayList<String>>();
		// Clone of the Content List so we can sort
		ArrayList<Buch> tempList = (ArrayList<Buch>) Content.clone();
		
		// while the List is not Empty
		while(!tempList.isEmpty()){
			// Get the first Element
			String firstAutor = tempList.get(0).getAutor();
			// While there is an Author 
			while(sucheNachAutor(firstAutor, tempList).size() != 0){
				// The List of BnA(2) HashMap<Author, stuffList>
				ArrayList<String> stuffList = new ArrayList<String>();
				// If BnA already has an entry of firstAuthor we stuff the old items in the stuffList
				if(BnA.get(firstAutor) != null)
					stuffList.addAll(BnA.get(firstAutor));

				// Add All Books from the Author with the Title
				stuffList.addAll(sucheNachAutorTiteln(firstAutor, tempList));
				// Remove All Books that we previously added
				tempList.removeAll(sucheNachAutor(firstAutor, tempList));

				// Check if we have a Key, if not make a new key and add the List to it
				if(BnA.get(firstAutor) != null)
					BnA.get(firstAutor).addAll(stuffList);
				else
					BnA.put(firstAutor, stuffList);
			}
		}
		
		return BnA;
	}


	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[\n");
		for(Buch b : Content){
			sb.append(b.toString() + ",\n");
		}
		sb.substring(sb.length()-1, sb.length());
		sb.append("]");
		return sb.toString();
	}






}
