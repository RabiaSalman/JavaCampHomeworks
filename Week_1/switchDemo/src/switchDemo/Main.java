package switchDemo;

public class Main {

	public static void main(String[] args) {
	//�artl� Dalland�rma bloklar�
	//Bir ��rencinin bir s�navdan ald��� nota g�re ona mesaj vermeye y�nelik bir program yaz�n.
		
	char grade='C';
	switch(grade) {
	
	//Durum
	case 'A':System.out.println("M�kemmel:Ge�tiniz");break;
	
	case 'B':
	case 'C':
		System.out.println("�yi:Ge�tiniz");break;
	
	case 'D':System.out.println("Fena De�il:Ge�tiniz");break;
	
	case 'F':System.out.println("Malesef:Kald�n�z");break;
	
	default	:
		System.out.println("Ge�ersiz Not Girdiniz");
		//istenilen durum sart sa�lam�yorsa �al��acak kodlar
	}
		
	
	}

}
