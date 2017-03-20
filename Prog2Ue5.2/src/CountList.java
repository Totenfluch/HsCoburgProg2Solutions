import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SuppressWarnings("serial")
public class CountList <E> extends ArrayList<E>{
	public CountList(){
		super();
	}
	
	public int count(E Element){
		if(!contains(Element))
			return 0;
		Iterator<E> it = iterator();
		int count = 0;
		while(it.hasNext())
			if(it.next().equals(Element))
				count++;
		return count;
	}
	
	public int unique(){
		ArrayList<E> uniques = new ArrayList<E>();
		Iterator<E> it = iterator();
		while(it.hasNext()){
			E eT;
			if(!uniques.contains((eT = it.next())))
					uniques.add(eT);
		}
		return uniques.size();
	}
	
	@SuppressWarnings("unchecked")
	public Map<E, Integer> counts(){
		HashMap<E, Integer> returnMap = new HashMap<E, Integer>();
		ArrayList<E> tempList = (ArrayList<E>) clone();
		if(tempList.size() <= 0)
			return returnMap;
		returnMap.put(tempList.get(0), 1);
		tempList.remove(0);
		for(int i = 0; i<tempList.size(); i++){
			if(returnMap.containsKey(tempList.get(i))){
				returnMap.put(tempList.get(i), returnMap.get(tempList.get(i)).intValue() + 1);
			}else{
				returnMap.put(tempList.get(i), 1);
			}
		}
		
		return returnMap;
	}
	
	public static void main(String[] args){
		final CountList<Integer> cl = new CountList<Integer>();
		cl.add(2);
		cl.add(5);
		cl.add(2);
		cl.add(5);
		cl.add(3);
		System.out.println(cl.count(2));    // 2
		System.out.println(cl.unique());   // 3
		System.out.println(cl.counts());    //{2=2, 3=1, 5=2 } 
	}
}
