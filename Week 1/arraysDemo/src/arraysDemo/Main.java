package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// arrays diziler
		// java.lang.ArrayIndexOutOfBoundsException array ın sınırlamanın dışında olduğunu belirten hata
		String ogrenciler1 = "Sefa";
		String ogrenciler2 = "Tugba";
		String ogrenciler3= "Miraç";
		
		System.out.println(ogrenciler1);
		System.out.println(ogrenciler2);
		System.out.println(ogrenciler3);
		
		System.out.println("---------------------------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Sefa";
		ogrenciler[1] = "Tugba";
		ogrenciler[2] = "Miraç";
		ogrenciler[3] = "Ege";
		//ogrenciler[4] = "ALi";
		for(int i=0;i<ogrenciler.length;i++) {
			
			System.out.println(ogrenciler[i]);
			
				}
		System.out.println("-------------------------------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
	}

}
