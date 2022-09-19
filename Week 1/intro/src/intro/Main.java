package intro;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello Word!");
		//DEĞİŞKEN İSİMLENDİRMELERİ camelCase yazılar
		String ortaMetin = "İlginizi Çekebilir..."; //NOKTA VİRGÜLLER BİTER 
		String altMetin = "Vade süresi...";
		
		System.out.println(ortaMetin);
		
		double dolarDun = 18.51;
		double dolarBugun = 18.51;
		String okYonu = "";
		
		if (dolarDun<dolarBugun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if (dolarDun>dolarBugun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equals.up";
			System.out.println(okYonu);
		}
		
		String [] aileUyeleri = {"Sefa Demirtaş" , "Tuğba Nur Demirtaş" , "Miraç Ege Demirtaş"  };
		
		for (int i = 0; i < aileUyeleri.length; i++) {
			System.out.println(aileUyeleri[i]);
		}
		
		
		
	}

}
