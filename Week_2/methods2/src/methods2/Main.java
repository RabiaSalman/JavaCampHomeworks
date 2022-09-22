package methods2;

public class Main {

	public static void main(String[] args) {	
	
		String mesaj="Bug�n hava �ok g�zel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(15,7);
		System.out.println(sayi);
		int toplam=topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}
	
	
	//void metodlar geriye bir de�er d�nd�rmez
   public  static void ekle() {
	System.out.println("Eklendi");
		
   }
	
   public  static void sil() {
	System.out.println("Silindi");
	   
   }
   
   public  static void g�ncelle() {
	System.out.println("G�ncellendi");
	   
   }
   
   
   //Bu fonksiyon int t�r�nde bir de�er d�d�r�r
   public static int topla(int sayi1,int sayi2) {
	   return sayi1+sayi2;
   }
   
   
   //Variable Arguments
   public static int topla2(int... sayilar) {
	   int toplam=0;
	   for (int sayi:sayilar) {
		   toplam+=sayi;
		
	}
	   return toplam;   
   }
   
   
   
   public static String sehirVer() {
	   return "Ankara";
   }

}
