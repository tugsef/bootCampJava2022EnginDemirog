package methods2;
// void değer döndürmez değiştir yap dersin...

public class Main {

	public static void main(String[] args) {
		String sehir = sehirVer();
		System.out.println(sehir);
		int topla = topla(5, 7);
		System.out.println(topla);
		int toplam = toplam(1,2,3,4);
		System.out.println(toplam);

	}
	public static void ekle() {
		System.out.println("Eklendi...");
	}
	public static void sil() {
		System.out.println("Silindi...");
	}
	public static void güncelle() {
		
	}
	public static int topla(int sayi1 , int sayi2) {
		return sayi1 + sayi2;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	//Variable Arguments !! 
	public static int toplam(int... sayilar) {
		int topla= 0;
		for(int sayi:sayilar) {
			topla+=sayi;
		}
		return topla;
	}

}
