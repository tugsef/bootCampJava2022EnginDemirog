package atmProgrami;

public class Main {

	public static void main(String[] args) {
		Hesap hesap = new Hesap("Sefa Demirtaş", "12345", 2500);
		Atm atm = new Atm();
		atm.calis(hesap);
		System.out.print("Programdan Çıkılıyor...");
		
		
	}

}
