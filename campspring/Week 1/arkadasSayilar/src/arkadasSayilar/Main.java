package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int numbercut1 = 0;
		int numbercut2 = 0;
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				numbercut1 = numbercut1 + i;

			}

		}

		for (int j = 1; j < number2; j++) {

			if (number2 % j == 0) {
				numbercut2 = numbercut2 + j;
			}
		}
		if(number1==numbercut2 && number2==numbercut1) {
			System.out.println(number1 + " ve " + number2+" Sayıları Kardeş Sayılardır.");
		}else {
			System.out.println(number1 + " ve " + number2+" Sayıları Kardeş Değillerdir.");
		}

	}

}
