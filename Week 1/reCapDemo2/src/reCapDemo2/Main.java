package reCapDemo2;

public class Main {
	/*
	 * NE YAPTIK
	 * Double veri tipi içeren bir arrays oluşturduk
	 * Elemanları ekrana bastırdık
	 * arrays elemanlarının toplamını veren bir for döngüsü kurduk
	 * if bloğu yardımı ile liste içindeki en büyük sayıyı bulduk */

	public static void main(String[] args) {
		double[] myList = {1.2,2.6,3.7,6};
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			System.out.println("Benim Listemdeki Sayı : "+number);
			total = total + number;
			if(max<number) {
				max = number;
			}
			
		}
		System.out.println("Benim Listemdeki Sayıların Toplamı = " + total);
		System.out.println("Benim Listemdeki En Büyük Sayı = " + max);
		
	}

}
