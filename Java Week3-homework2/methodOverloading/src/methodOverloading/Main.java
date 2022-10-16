package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		System.out.println("Toplam = "+dortIslem.topla(20, 29));
		System.out.println("Tolam = "+ dortIslem.topla(25, 41, 18));
		
	}

}
