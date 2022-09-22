package classes;

public class Main {

	public static void main(String[] args) {

	//Bir class� kullanmak i�in onun NEW'lenmesi gerek.
	//Classlar REFERANS tiptir.
		
		
	//CustomerManager s�n�f�ndan bir nesne olu�turuldu.
	//Class�n �a��r�m� bu �ekildedir
	 CustomerManager customerManager=new CustomerManager();
	 CustomerManager customerManager2=new CustomerManager();
	//customerManager referans numaras� customerManager2'nin referans numaras�d�r
	 customerManager=customerManager2;
	 customerManager.add();
	 customerManager.remove();
	 customerManager.update();
	 
	 
	//De�er tipte bir�ey tan�mlad���m�zda heap'le hi�bir alakas� yok her�ey stack'te olu�ur.
	//Value Type
	 int sayi1=10;
	 int sayi2=20;
	 sayi2=sayi1;
	 sayi1=30;
	 System.out.println(sayi2);
	 
	 
	 //Diziler referans tiptir
	 int[] sayilar1=new int[] {1,2,3};
	 int[] sayilar2=new int[] {4,5,6};
	 sayilar2=sayilar1;//sayilar2'nin de�eri sayilar1 de�eri
	 sayilar1[0]=10;
	 System.out.println(sayilar2[0]);
		
	}

}

