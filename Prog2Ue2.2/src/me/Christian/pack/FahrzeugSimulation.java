package me.Christian.pack;

public class FahrzeugSimulation {

	public static void main(String[] args) {
		Pkw hansmobil = new Pkw("Hansmobil");
		hansmobil.beschleunigen(200);
		hansmobil.fahren(10);
		hansmobil.stoppen();
		System.out.println(hansmobil.toString());
		
		Lkw EdekaLKW = new Lkw("EdekaLkw", 100);
		EdekaLKW.beschleunigen(200);
		EdekaLKW.beladen(10000);
		EdekaLKW.fahren(10);
		EdekaLKW.stoppen();
		System.out.println(EdekaLKW.toString());
		
		PkwOAbs PeterMobilOABS = new PkwOAbs("PeterMobil");
		PeterMobilOABS.beschleunigen(200);
		PeterMobilOABS.fahren(10);
		PeterMobilOABS.stoppen();
		System.out.println(PeterMobilOABS.toString());
	}

}
