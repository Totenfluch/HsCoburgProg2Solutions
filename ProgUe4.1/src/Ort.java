
public class Ort<E> {
	private final int ortsId;
	private E ortsElement = null;
	
	public Ort(int ortsId){
		this.ortsId = ortsId;
	}
	
	public E entnehmen(){
		E tempelement = ortsElement;
		ortsElement = null;
		return tempelement;
	}
	
	public boolean hinzufügen(E e){
		if(!istBelegt()){
			this.ortsElement = e;
			return true;
		}
		return false;
	}
	
	public E getEingelagertesElement(){
		return ortsElement;
	}
	
	public boolean istBelegt(){
		if(ortsElement != null)
			return true;
		return false;
	}
	
	public int getOrtsId(){
		return ortsId;
	}
	
	public String toString(){
		if(istBelegt()){
			return "Belegt mit: " + ortsElement;
		}else{
			return "Element ist nicht belegt";
		}
	}
	
	public static void main(String args[]){
		Ort<String> einOrt = new Ort<String>(1);
		einOrt.hinzufügen("OO-Softwareentwicklung");
		String s = einOrt.getEingelagertesElement();
		System.out.println(einOrt);
		s = einOrt.entnehmen();
		System.out.println(einOrt);
		System.out.println(s);
	}
	
	
}
