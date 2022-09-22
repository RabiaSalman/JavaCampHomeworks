package inheritance;

public class Main {

	public static void main(String[] args) {
 	
	/*Inheritance(Kal�t�m-Miras)
	 *Kal�t�m, classlar�n birbirinin �zelliklerini tekrar etmeden ba�ka
	 *bir class �zerinden geni�letebilmelerine imkan sa�layan yap�lard�r.
	 
	 * Inheritance ile kod tekrar�n�n �n�ne ge�ilir ve nesneler aras�ndaki
	 * ili�kilerin dah kolay y�netebilmesini sa�lar.
	 
	 * Bir class sadece extens etti�i class�n i�indeki bilgileri al�r.Ba�ka bir class�n
	 * i�indeki bilgileri alamaz.
	*/
		
		Customer customer=new Customer();
	    Employee employee=new Employee();
	    
	    EmployeeManager employeeManager=new EmployeeManager();
	    employeeManager.add();
	    employeeManager.list();
	    employeeManager.bestEmployee();
	    System.out.println("---------------------------");
	    CustomerManager customerManager=new CustomerManager();
	    customerManager.add();
	    customerManager.list();
	    
	
	}

}
