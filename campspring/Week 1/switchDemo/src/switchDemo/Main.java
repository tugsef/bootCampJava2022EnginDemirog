package switchDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * iyi kodyazılımının suistimal edildiği bir yapı grade ingilizce not
		 */
		char grade = 'F';

		switch (grade) {
		case 'A' :
		case 'a' :
			System.out.println("MÜKEMMEL GEÇTİNİZ...");
			break;
		case 'B':
		case 'b' :
			System.out.println("ÇOK GÜZEL GEÇTİNİZ...");
			break;
		case 'C':
		case 'c' :
			System.out.println("İYİ DEÇTİNİZ...");
			break;
		case 'D':
		case 'd' :
			System.out.println("FENA DEÇTİNİZ...");
			break;
		case 'F':
		case 'f' :
			System.out.println("KALDINIZ...");
			break;
		default:
			System.out.println("Hatalı Bir Ders Notu Girdiniz...");
		}
	}

}
