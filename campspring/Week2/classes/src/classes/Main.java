package classes;

public class Main {
//classlar referance type dir.
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
//value type
		int sayi1 = 10;
		int sayi2 =20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println("sayi1 ve sayi2 değerleri ayrı ayrı değer aldı\n"
				+ "daha sonra sayi1 değeri otuz olarak deişti\n"
				+ "sayi2 nindeğeri bir önceki sayi1 değerinde kaldı ve ekrana onu yazar\n"
				+ "sayi1=10\n"
				+ "sayi2=20\n"
				+ "sayi2=10\n"
				+ "sayi1=30\n"
				+ "sayi2 Çıktısı:------------------------>"+sayi2);
// Çok önemlidizilerde referans type özellikleri gösterir...
		int[] deger1 = new int[] {1,2,3};
		int[] degerler2 = new int[] {4,5,6};
		deger1=degerler2;
		deger1[0]=0;
		System.out.println("Satır 26 deger bir stackde bir referan kodu oluştu aynı zamanda heap ta bir alan"
				+ "\n27 satırda deger2 için için stack de bir referans kodu heap da bir alan"
				+ "\n28 deger2 referans olarak deger1 referansına eşitlendi yani aynı referans stack de kodda hemde heap da aynı alanı gösterir"
				+ "\n29 satır deger1 dizisinde 1 eleman 0 olarak değiştirildi... "
				+ "\ndeger2 nin birinci elemanını ekrana yazdırmak ister isek referans kodu ve alan aynı yeri gösterdiğinden deger1 degerini yazar"
				+ "\ndeger2[0]=  "+degerler2[0]);
		
		

	}
// Ürünü müşteriye ekleriz güncelleriz..Gruplama yapmak--->önemli igili alan
}
