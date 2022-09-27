package methots;

//dry Don't repeat Yourself kendini tekrarlama
//fonksiyonlardan yaralarnarak tekrardan kurtulabilirsimn 
//Java da methot iyimleri camel casing yazılır.
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 3, 5, 7, 9, 0 };
		int aranacak = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			mesajVer("Sayı Mevcuttur..." + aranacak);
		} else {
			mesajVer("Sayı Mevcut Değildir..." + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
