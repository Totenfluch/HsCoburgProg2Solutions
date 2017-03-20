package me.Christian.pack;

import java.util.TreeSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class TreeBibliothek {
	private TreeSet<Buch> Content;

	public TreeBibliothek(){
		Content = new TreeSet<Buch>();
	}

	public boolean einfügen(Buch b){
		if(!Content.contains(b))
			return Content.add(b);
		return false;
	}

	public Collection<Buch> sucheNachAutor(String autor){
		TreeSet<Buch> returnContent = new TreeSet<Buch>();
		Iterator<Buch> Li = Content.iterator();
		while(Li.hasNext()){
			Buch b = Li.next();
			if(b.getAutor().equals(autor))
				returnContent.add(b);
		}
		return returnContent;
	}

	public Collection<Buch> sucheNachAutor(String autor, TreeSet<Buch> toSearch){
		TreeSet<Buch> returnContent = new TreeSet<Buch>();
		Iterator<Buch> Li = toSearch.iterator();
		while(Li.hasNext()){
			Buch b = Li.next();
			if(b.getAutor().equals(autor))
				returnContent.add(b);
		}
		return returnContent;
	}

	public Collection<String> sucheNachAutorTiteln(String autor, TreeSet<Buch> toSearch){
		TreeSet<String> returnContent = new TreeSet<String>();
		Iterator<Buch> Li = toSearch.iterator();
		while(Li.hasNext()){
			Buch b = Li.next();
			if(b.getAutor().equals(autor))
				returnContent.add(b.getTitel());
		}
		return returnContent;
	}

	public Buch sucheNachISBN(String isbn){
		Iterator<Buch> it = Content.iterator();
		while(it.hasNext()){
			Buch rBuch;
			if((rBuch = it.next()).getIsbn().equals(isbn))
				return rBuch;
		}
		return null;
	}

	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp){
		TreeSet<Buch> newSet = new TreeSet<Buch>(comp);
		newSet.addAll(Content);
		return newSet;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, TreeSet<String>> bestandNachAutor(){
		// Array to return Authors with a TreeSet of their books
		HashMap<String, TreeSet<String>> BnA = new HashMap<String, TreeSet<String>>();
		// Clone of the Content List so we can sort
		TreeSet<Buch> tempList = (TreeSet<Buch>) Content.clone();

		// while the List is not Empty
		while(!tempList.isEmpty()){
			// Get the first Element
			String firstAutor = tempList.first().getAutor();
			// While there is an Author 
			while(sucheNachAutor(firstAutor, tempList).size() != 0){
				// The List of BnA(2) HashMap<Author, stuffList>
				TreeSet<String> stuffList = new TreeSet<String>();
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
