package oopYoutubeVideos;

public abstract class BaseCreditManager implements ICreditManager {
   
	
	//Ortak de�il heryerde de�i�ken
	public abstract void calculate();
	
	public void save() {
		System.out.println("Kaydedildi");
	}

}
