package atmProgrami;

import java.util.Scanner;

public class Atm {

	public void calis(Hesap hesap) {
		
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankamıza Hoş Geldiniz...");
		System.out.println("**********************************");
		System.out.println("Kullanıcı Girişi..");
		System.out.println("**********************************");
		
		int girisHakki = 3;
		Login login= new Login();
		while(true) {
			if (login.login(hesap)) {
				
				System.out.println("Giriş Başarılı...");
				break;
				
				
			}else {
				System.out.println("Giriş Başarısız...");
				girisHakki-=1;
				System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
			}
			if (girisHakki==0) {
				System.out.println("Giriş Hakkınız Bitti...");
				return;
			}
		}
		System.out.println("**********************************");
		String islemler = "1.Bakiye Görüntüle\n"
				        + "2.Para Yatırma\n"
				        + "Çıkış için q'ya basın";
		System.out.println(islemler);
		System.out.println("**********************************");
		
		while(true) {
			
			System.out.println(	"İşlemi Seçiniz : ");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				break;
			}else if (islem.equals("1")) {
				System.out.println("Bakiyeniz : "+hesap.getBakiye());
				
				
				
			}else if (islem.equals("2")) {
				System.out.println("Yatırmak istediğiniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
				
				
			}else if (islem.equals("3")){
				
				System.out.println("Çekmek İstediğiniz Tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
				
			}else {
				System.out.println("Geçersiz İşlem...");
			}
			
		}
		
		
	}

}
