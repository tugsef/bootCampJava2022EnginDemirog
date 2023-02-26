package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		int sayi = 28;
		int toplamBolen=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplamBolen = toplamBolen + i;
			}
			
		
		}
		if(toplamBolen==sayi) {
			System.out.println(sayi + " Mükemmel Bir Sayıdır...");
		}else {
			System.out.println(sayi + " Mükemmel Bir Sayı Değildir... ");
		}
	}

}
