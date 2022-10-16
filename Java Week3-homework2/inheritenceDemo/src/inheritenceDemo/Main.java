package inheritenceDemo;

public class Main {

	public static void main(String[] args) {
// Bizi amacımız değişime direnmeyen program yazmak...
//Yazılım mimari
// Bizim amacımız zamanla değişen müşteri taleplerini karşılayan programlar yazmak..
//Değişime direniyorsa cod demekki temiz cod yazmıyoruz anlamı çıkar 
		
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(new TarimKrediManager());
		krediUI.krediHesapla(new AskerKrediManager());
	}

}
