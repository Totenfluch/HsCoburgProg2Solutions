import java.util.Vector;

public class Pair <K, V>{
	private K Key;
	private V Value;
	public Pair(K Key, V Value){
		this.Key = Key;
		this.Value = Value;
	}
	
	public String toString(){
		return "(" + Key + ", "+ Value +")";
	}
	
	public static void main(String[] args){
		Vector<Pair<String, Integer>> vector
		= new Vector<Pair<String, Integer>>();
		 vector.add(new Pair<String, Integer>("I", 1));
		 vector.add(new Pair<String, Integer>("V", 5));
		 vector.add(new Pair<String, Integer>("C", 100));
		 vector.add(new Pair<String, Integer>("II", 2));
		 vector.add(new Pair<String, Integer>("IX", 9));
		 System.out.println(vector);
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Object o){
		if(o == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		
		Pair<K, V>p = (Pair<K, V>)o;
		
		if(p.Key.equals(Key) && p.Value.equals(Value))
			return true;
		
		return false;
	}
	
}
