package overriding;

public class Main {

	public static void main(String[] args) {
			BasekrediManager[] krediManagers = new BasekrediManager[] {new OgretmenKrediManager() , new TarimKrediManager() , new OgrenciKrediManager()};
			
			for (BasekrediManager krediManager:krediManagers ) {
				System.out.println(krediManager.hesapla(1000));
			}
	}

}
