package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=H3QOQRh8cgk&list=PLqG356ExoxZWfcrBP53Njxir4a-OgqRki&index=2
		//00.00-48.00 dk arasındaki bilgi notları
		/*    Örnek 1 değer atama
		 int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1=sayi2;
		sayi2 = 100;
		System.out.print(sayi1);
		//cevap 20
		//Program yaparken bellekte kullanılan iki alan var (Stack-heap)
		//Sayısal değerler değer tiptir belleğin stack bölümünde tutulur.
		//Atama sadece değer üzerinden olur.*/
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		//array referans tiptir. Değer tip değil.!!
		//interface be absract lar referans tiplerdir.
		
		

	}

}
