package methodOverloading;

public class DortIslem {
	
	//Birden fazla ayn� isimli metodun yaz�lmas�na overloading(a��r� y�kleme) denir.
	public int  topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
    
	public int  topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}

}
