package reCapDemo_Clasess;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		int toplama = dortIslem.topla(5,2);
		System.out.println("İki Sayının Toplamı.:" + toplama);
		
		int cikartma = dortIslem.cikarma(5,3);
		System.out.println("İki Sayının Çıkarma.:"+cikartma);
		
		int bolme = dortIslem.bolme(8,2);
		System.out.println("İki Sayının Bölümü.:"+bolme);
		
		int carpma = dortIslem.carpma(5,5);
		System.out.println("İki Sayının Çarpımı.:"+carpma);
		

	}

}
