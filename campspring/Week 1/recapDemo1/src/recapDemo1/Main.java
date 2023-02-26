package recapDemo1;

public class Main {

	public static void main(String[] args) {
		/*
		 recapDemo-->baştan sona tekrar işlediğimiz konuları içine alan bir demo uygulama
		 */
		int sayi1 = 54;
		int sayi2 = 60;
		int sayi3 = 61;
		int sayi4 = 53;
		
		int enBuyukSayi = sayi1;
		
		if(enBuyukSayi<sayi2) {
			
			enBuyukSayi = sayi2;
			
		}
		
		if(enBuyukSayi<sayi3) {
			
			enBuyukSayi = sayi3;
			
		}

		if(enBuyukSayi<sayi4) {
	
	enBuyukSayi = sayi4;
	
		}

		System.out.println("En büyük sayı = " + enBuyukSayi);
		
		
		

	}

}
