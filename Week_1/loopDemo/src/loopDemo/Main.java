package loopDemo;


public class Main {

	public static void main(String[] args) {
	//D�ng�ler programda birbirine benzeyen i�lemleri tekrarlamaya yarar.
	
	//1'den 10'a kadar yazd�rma.
	//int i:ba�lang��
	//i<=100:�art biti�
	//i++:art��
		
	for (int i = 1; i <=10; i++) {
		System.out.println(i);	
	}
	System.out.println("D�ng� bitti");
	
	
	//1-10 aras� �ift say�lar� yazd�rma.

	for (int i = 2; i <=10; i+=2) {
		System.out.println(i);	
	}
	System.out.println("D�ng� bitti");
	
	
	//1-10 aras� tek say�lar� yazd�rma.
	
	for (int i = 1; i <=10; i+=2) {
		System.out.println(i);	
	}
	System.out.println("For D�ng�s� Bitti");
	
	
	//WH�LE D�NG�S�
	//1-10 aras� �ift say�lar� yazd�r�n.
	int i=1;
	while(i<10) {
		System.out.println(i);
		i+=2;	
	}
	System.out.println("While D�ng�s� Bitti");
	
	
	//DO WH�LE D�NG�S�
	//Do While d�ng�s� �art sa�lanmasa bile en az i�lemi 1 kere ger�ekle�tirir.
	int j=100;
	do {
	    System.out.println("Logland�");
		System.out.println(j);
		j+=2;	
		
	}while(j<10);
	System.out.println("Do While D�ng�s� Bitti");
	
	
	
	}

}
