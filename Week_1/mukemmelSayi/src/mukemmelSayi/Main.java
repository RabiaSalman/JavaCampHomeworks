package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=5;
		int bolenToplam=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				bolenToplam=bolenToplam+i;
			}
		}
		if(bolenToplam==sayi) {
			System.out.println("M�kemmel say�d�r");
		}
		else {
			System.out.println("M�kemmel  say� de�ildir");
		}

	}

}
