package loopDemo;

public class Main {

	public static void main(String[] args) {
   /*
    * loop döngü demek
    * döngü bir programda birbirinr benzeyen işlemleri tekrarlamaya yarar
    * ör 1 den yüze kadar yazdırmak defalarca println yazmak yerine
    * ör veri tabanı kaynaklar excel den bir öğrenci listesini ekrana bastırmak*/
		
		//for
		System.out.println("-----------------------------------------------------");
		System.out.println("\nFor Döngüsü Başladı....\n");
		for(int i = 1;i<=10;i++) {
			System.out.println("For Döngüsü Çalıştı Tekrar : " + i);
		}
		for(int i =1;i<10;i+=2) {
			System.out.println("For Döngüsü 0-10 arası tek sayılar : " + i);
		}
		System.out.println("\nFor Döngüsü Bitti...\n");
		System.out.println("-----------------------------------------------------");
		System.out.println("\nWhile Döngüsü Başladı....\n");
		
		
		
		//While
		//infinite loop sonsuz döngü i artırılmazsa döngüye girer.
		int i = 1 ; //i değişkeni bulunduğu döngüden sonra başka döngüde tekrar belirlendi. Yazıldığı döngüde çalışır.
		System.out.println("Birden 100 kadar olan Çift sayılar...");
		while(i<=100) {
			System.out.print(i+"-");
			i+=2;
			
		}
		System.out.println("\n\nWhile Döngüsü Bitti...\n");
		System.out.println("------------------------------------------------------");
		// Do While
		// DO-While ile While arasındaki fark Do-While döngüsü şart sağlanmasa bile bir kere mutlaka çalışır log atarken kullanılabilir
		System.out.println("\nDo-While Döngüsü Başladı....\n");
		int j =1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("\nDo-While Döngüsü Bitti....\n");
		System.out.println("-----------------------------------------------------");
	}

}
