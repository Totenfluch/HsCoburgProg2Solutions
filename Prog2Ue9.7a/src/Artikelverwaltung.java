import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Artikelverwaltung{

	LinkedList<Artikel> artikel;

	public Artikelverwaltung(Artikel[] artikel){
		this.artikel = new LinkedList<Artikel>();
		this.artikel.addAll(Stream.of(artikel).collect(Collectors.toList()));
	}

	public Artikelverwaltung(){};

	public void write(String filename) throws FileNotFoundException, IOException{
		try(ObjectOutputStream bf = new ObjectOutputStream(new FileOutputStream(new File(filename)))){
			if(!new File(filename).exists())
				new File(filename).createNewFile();
			for(Artikel pArtikel : artikel)
				bf.writeObject(pArtikel);
		}
	}

	public void read(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))){
			Artikel oii;
			while((oii = (Artikel)ois.readObject()) != null)
				System.out.println(oii.toString());
		}
	}

	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<artikel.size(); i++){
			Artikel a = artikel.get(i);
			sb.append(a.toString());
			if(i != artikel.size()-1)
				sb.append(",\n");
		}
		return sb.toString();
	}

}
