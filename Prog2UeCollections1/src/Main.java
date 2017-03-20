import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(15);
		arr.add(25);
		arr.add(53);
		arr.add(54);
		arr.add(6);
		arr.add(1);
		
		arr.forEach(a -> System.out.print(a+ " "));
		System.out.println();
		arr.sort((a,b) -> a.compareTo(b));
		arr.forEach(a -> System.out.print(a+ " "));
		System.out.println();
		
		List<Number> arrr = new ArrayList<Number>();
		arrr.add(19);
		arrr.add(19.1f);
		arrr.add(124.3D);
		arrr.add(12489);
		arrr.add(1);
		arrr.sort((a,b) -> compareTo(a,b));
		
		Map<Integer, String> values = new HashMap<Integer, String>();
		values.put(0, "Null");
		values.put(1, "Eins");
		values.put(2, "Zwei");
		values.put(3, "Drei");
		values.put(4, "Vier");
		values.put(5, "Fünf");
		values.put(6, "Sechs");
		values.put(7, "Sieben");
		values.put(8, "Acht");
		values.put(9, "Neun");
		
		System.out.println("Telefonnummer eingeben:");
		
		try(Scanner sc = new Scanner(System.in)){
			String l = sc.nextLine();
			try{
				for(int i = 0; i<l.length(); i++){
					int x = Integer.parseInt(l.substring(i, i+1));
					System.out.println(values.get(x));
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}
	
	public static int compareTo(Number a, Number b){
		if(a.doubleValue() == b.doubleValue())
			return 0;
		else if(a.doubleValue() < b.doubleValue())
			return -1;
		else
			return 1;
	}

}
