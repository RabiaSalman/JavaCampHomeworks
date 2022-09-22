package methods;

public class Main {

	public static void main(String[] args) {		
		sayiBulmaca();
	}
	//Metod,yanl�zca  �a�r�ld���nda �al��an bir kod blo�udur.
	//Metod birden �ok yerde �a��r�labilir.
	//Mainde bir metodtur.
	//Metodlar belirli eylemleri ger�ekle�tirmek i�in kullan�l�r.Bunlara i�levlerde denilir.
	//Kendi metodlar�m�z� olu�turabiliriz.
	//Metod yazarak kendimizi tekrarlamam�za engel oluruz
	//Javada metot isimleri camelCase �eklinde yaz�l�r.
	
	//Parametresiz metod
	public static void sayiBulmaca() {
		
		  int[] sayilar=new int[] {1,2,5,7,9,0};
		     int aranacak=55;
		     boolean varMi=false;
		     
		     for(int sayi:sayilar) {
		    	 if(sayi==aranacak) {
		    		varMi=true;
		    		break;
		    		
		    	 }
		     }
		     if(varMi) {
		    	mesajVer("Say� Mevcuttur:"+aranacak);
		     }else {
		    	mesajVer("Say� Mevcut De�ildir:"+aranacak);
		     }	
	}
	
	
	//Parametreli metod
	 public static void mesajVer(String mesaj  ) {
		
		 System.out.println(mesaj);
	 }

}
