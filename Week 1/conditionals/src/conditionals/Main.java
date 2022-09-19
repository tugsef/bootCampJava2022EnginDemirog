package conditionals;

public class Main {

	public static void main(String[] args) {
		//conditionals şartlar
		/*
		  İF ELSE KULLANILARAK PROGRAMIN KAÇACAK NOKTASI KALMAMIŞ OLDU.
		  VERİ KAÇAKLARI UYGULAMA KAÇAKLARIÖNLENMİŞ OLUR
		  DEFENSİVE PROGRAMİNG(OLABİLECEK SENERYOLARA HAZIRLIKLI BİR PROGRAM YAPMAK SAVUNMACI)
	  */
		int sayi = 21 ;
		
		if(sayi<20) {
			
			System.out.println("SAYI YİRMİDEN KÜÇÜKTÜR...");
			
		} else if (sayi==20) {
			System.out.println("SAYI YİRMİYE EŞİTTİR");
			
		} else {
			
			System.out.println("SAYI YİRMİDEN BÜYÜKTÜR...");
			
		}
	}

}
