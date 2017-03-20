
public class Utils<E> {
	public static <E> void print(E[] values){
		System.out.print("[");
		for(int i = 0; i<values.length; i++){
			if(i != values.length-1)
				System.out.print(values[i]+",");
			else
				System.out.print(values[i]);
		}
		System.out.print("]\n");
	}

	public static <E extends Comparable<E>> E[] sortiere (E[] zusortieren){
		for(int i=1; i<zusortieren.length; i++) {
			for(int j=0; j<zusortieren.length-i; j++) {
				if(zusortieren[j].compareTo(zusortieren[j+1]) >= 1) {
					E temp=zusortieren[j];
					zusortieren[j]=zusortieren[j+1];
					zusortieren[j+1]=temp;
				}
			}
		}
		return zusortieren;
	}

	public static void main(String[] args){
		Integer[] keys =
			{ 2000, 2, 99, 756, 999,0, 666, 2345, 7492, 22 };
		String[] article =
			{ "the", "a ", "one ", "some ","anton","ymca" };
		Utils.print(keys); //[2000,2,99,756,999,0,666,2345,7492,22]
		Utils.print(article); // [the,a,one,some,anton,ymca]
		Utils.sortiere(keys);
		System.out.println("--- Sortiert ---");
		Utils.print(keys);
		article = Utils.sortiere(article);
		Utils.print(article);
	}
}
