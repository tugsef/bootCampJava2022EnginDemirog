package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,4,6};
		int aranacak = 7;
		
		boolean varMi = false;
		
		/*for (int i=0;i<sayilar.length;i++) {
			if(aranacak==sayilar[i]) {
				System.out.println("Dizi içerisinde var ");
				return;
			}
			}
		System.out.println("Dizi içerisinde yok");*/
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
			}
		}
		if(varMi) {
			System.out.println("Dizi içerisinde sayı mevcut");
		}else {
			System.out.println("Dizi içerisinde sayı mevcut değildir...");
		}
		}
	

}
