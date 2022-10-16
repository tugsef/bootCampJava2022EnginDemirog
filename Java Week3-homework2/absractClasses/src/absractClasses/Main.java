package absractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		//Abstract classlar bu şekilde newlenemez GameCalculator gameCalculator = new GameCalculator();
		GameCalculator gameCalculator1 = new WomenGameCalculator();
		gameCalculator1.hesapla();
	}

}
