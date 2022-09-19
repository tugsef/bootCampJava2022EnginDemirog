package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String[7][3];
		
		cities[0][0] = "Ankara";
		cities[0][1] = "Konya";
		cities[0][2] = "Kayseri";
		cities[1][0] = "İstanbul";
		cities[1][1] = "İzmit";
		cities[1][2] = "Bolu";
		cities[2][0] = "Diyarbakır";
		cities[2][1] = "Gaziantep";
		cities[2][2] = "Şanlıurfa";
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.println(cities[i][j]);
			}
			
			System.out.println("-----------------------");
		}
		
		
	}

}
