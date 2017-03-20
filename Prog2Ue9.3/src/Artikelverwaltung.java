import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Artikelverwaltung {

	LinkedList<Artikel> artikel;

	public Artikelverwaltung(Artikel[] artikel){
		this.artikel = new LinkedList<Artikel>();
		this.artikel.addAll(Stream.of(artikel).collect(Collectors.toList()));
	}

	public Artikelverwaltung(){};

	public void write(String filename){
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(new File(filename)))){
			if(!new File(filename).exists())
				new File(filename).createNewFile();
			bf.write(toString());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void read(String filename){
		artikel = new LinkedList<Artikel>();
		File f = new File(filename);
		try(BufferedReader br = new BufferedReader(new FileReader(f))){
			if(!f.exists())
				throw new FileNotFoundException();
			StreamTokenizer st = new StreamTokenizer(br);
			while(st.nextToken() != StreamTokenizer.TT_EOF){
				if(st.ttype == -1)
					break;
				//String bezeichnung = "";
				String name = "";
				int groesse = 0;
				String farbe = "";
				int schrittgroese = 0;
				int count = 0;
				while(st.nextToken() != StreamTokenizer.TT_EOL && (char)st.ttype != ','){
					if(count == 0)
						name = st.sval;
					if(count == 1)
						groesse = (int)st.nval;
					if(count == 2)
						farbe = st.sval;
					if(count == 3)
						schrittgroese = (int)st.nval;

					if(st.ttype == -1)
						break;

					count++;
				}
				Jeans j = new Jeans(groesse, Kleidungsstück.Farbe.valueOf(farbe), name, schrittgroese);
				//System.out.println(j);
				artikel.add(j);
			}
		}catch(Exception e){
			e.printStackTrace();
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
