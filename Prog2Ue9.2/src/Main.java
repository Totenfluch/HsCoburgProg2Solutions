import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Integer> zahlen = new Vector<Integer>();
		try(Scanner sc = new Scanner(System.in)){
			for(int i=0;i<5;i++){
				System.out.println("Bitte Zahl " + (i+1) + ". eingeben");
				zahlen.add(sc.nextInt());
			}
		}catch (Exception e){}
		for(int i = 0; i<5; i++){
			System.out.print(zahlen.get(i));
			if(i<4)
				System.out.print(" + ");
		}
		System.out.println(" = " + zahlen.stream().mapToInt(i -> i.intValue()).sum());
	}

}
