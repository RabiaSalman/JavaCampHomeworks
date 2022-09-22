package classesWithAttributes;

public class Product {

//Single-responsibility-principle(Tek Sorumluluk Prensipi):Bir class bir metot sadece bir i�i yapar
//Classlar�n bir di�er �zelli�ide �zellik tutmas� Field vaye Attribute olarak isimlendirilirler
//Private:Sadece tan�mland��� blokta ge�erlidir	
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
//Yap�c� blok isimleri Class ismiyle ayn� olmak zorundad�r,
//New'ledi�imizde �al��an blo�u devreye sokmu� oluruz
//Parmetreli Constructor
	public Product(int id, String name,String description,double price,int stockAmount,String renk) {
	    System.out.println("Yap�c� blok �al��t�");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
	}
	
	//Parametresiz Constructor
	public Product() {
		
	}
	
//Encapsulation(Kaps�lleme):Herhangibir alan� kullanmak i�in k�s�tlamay� �n g�r�r.
//get:Bir de�eri okumaya y�nelik i�lemdir.(Read)
//set:Bir de�ere de�erini vermeye y�nelik i�lemdir.(Write)
//set edilen de�er parametre olarak verilir.


/*Do�rudan eri�im ,daha b�y�k ve do�rudan anla��lmayacak hatalarada sebep olabilir
 *Bu y�zden her s�n�f kendi alan�n�n y�netiminden kendisi sorunlu olmal�d�r.
 *S�n�f i�erisindeki alanlara eri�im ancak s�n�f�n kendi istegi ile d��ar�ya a�t��� GETTER ve SETTER metotlar� arac�l��� ile olmal�d�r*/
	
	public int   getId() {
		return id;
	}
	
	public void  setId(int id) {
	   this.id=id;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getDescription() {
		return description;
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public double getPrice() {
		return price;
	}
	

	public void setPrice(double price) {
		this.price = price;
	}
	

	public int getStockAmount() {
		return stockAmount;
	}
	

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
	

	public String getKod() {
		return this.name.substring(0,1)+id;
	}
	
	
	
	
}
	