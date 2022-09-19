package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//bug böcek uygulamadaki mantıksal hataları veya sistemler hatalara denir...Açıklara
		//
		int number=111;
		boolean isPrime = true;
		if(number==1) {
			System.out.println(number + " Sayısı asal bir sayı değildir...");	
			return;
		}
		if(number<2) {
			System.out.println(number + " Asal sayı değildir....");
			return;
		}
		
		for(int i = 2;i<number;i++) {
			if(number%i==0) {
				isPrime = false;
			}
			}
		if(isPrime) {
			System.out.println(number + " Asal bir sayıdır...");
			
		}else {
			System.out.println(number + " Asal sayı değildir...");
			
			
		}
			
			
		}
	

}
