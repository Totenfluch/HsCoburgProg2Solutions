package me.Christian.pack;

public class Main {
	public static void main(String[] args){
		int[] ia = new int[10];
		for(int i = 0 ; i< 10; i++){
			Integer p = i*2+10/(i+1)*i;
			ia[i] = p.intValue();
		}

		
		sortieren(ia);
		
	}
	
	public static void sortieren(int[] zahlen){
		int[] zusortieren = zahlen;//{2000, 2, 45, 34, 100000, 345, 56, 78, 99 ,756,  999, 0, 666, 2345, 7492, 22};
		int temp;
		
		System.out.println("Data items in original order");
		for(int x=0; x<zusortieren.length; x++){
			System.out.print(zusortieren[x] + " ");
		}
		
		
		for(int i=1; i<zusortieren.length; i++) {
			for(int j=0; j<zusortieren.length-i; j++) {
				if(zusortieren[j]>zusortieren[j+1]) {
					temp=zusortieren[j];
					zusortieren[j]=zusortieren[j+1];
					zusortieren[j+1]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("Data items in ascending order");
		for(int x=0; x<zusortieren.length; x++){
			System.out.print(zusortieren[x] + " ");
		}
	}
}
