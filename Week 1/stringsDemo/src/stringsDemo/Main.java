package stringsDemo;

import java.security.MessageDigest;

public class Main {

	public static void main(String[] args) {
		/*
		 * String message = "Bugün hava çok güzel."; //ekrana yazdır
		 * System.out.println(message); //eleman sayısını bul
		 * System.out.println("Metnin Karakter Sayısı : "+ message.length()); //5.
		 * elemanı arat System.out.println("5. Eleman : " + message.charAt(4)); //metin
		 * yanına metin ekle System.out.println(message.concat(" Öyle değil mi?"));
		 * //Karakterle başlıyor mu?True veya false döner
		 * System.out.println(message.startsWith("B")); //Bu karakterle bitiyor mu?true
		 * veya false döner. System.out.println(message.endsWith("A")); //Hangi indexde
		 * aratma
		 * 
		 * System.out.println(message.indexOf("av"));
		 * System.out.println(message.lastIndexOf("."));
		 * 
		 * char[] karakterler = new char[5]; message.getChars(0, 5, karakterler, 0);
		 * System.out.println(karakterler);
		 */
		String message = "Bugün hava çok güzel."; //ekrana yazdır
		System.out.println(message);
		System.out.println("------------------------------------------------");
		//replace() Karekterleri değiştirme
		System.out.println(message.replace(' ', '-'));
		System.out.println("------------------------------------------------");
		//substring() Belli yerden başlayıp bitirme yazdırma
		System.out.println(message.substring(2,5));
		System.out.println("------------------------------------------------");
		//split fonksiyonu ile metni ayarlama ve diziye yazma
		for(String karakter : message.split(" ")) {
			System.out.println(karakter);
		}
		System.out.println("------------------------------------------------");
		//toLowerCase() metni küçük harfe çevirme
		System.out.println(message.toLowerCase());
		System.out.println("------------------------------------------------");
		//tUpperCase() metnin tamamını büyük harf yapma
		System.out.println(message.toUpperCase());
		System.out.println("------------------------------------------------");
		//trim() metnin başındaki ve sonun daki boşlukları kaldırma
		String yenimesaj = "   Bugün hava çok güzel.   ";
		System.out.println(yenimesaj.trim());
		System.out.println("------------------------------------------------");
		}

}
