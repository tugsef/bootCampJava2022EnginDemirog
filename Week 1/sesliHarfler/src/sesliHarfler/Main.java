package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		/*char[] sesliHarf = {'A','a','E','e','I','ı','İ','i','O','o','Ö','ö','U','u','Ü','ü'};
		char girilenHarf='E';
	
		;
		
       for (int i= 0;i<sesliHarf.length;i++) {
    	   
    	   if(girilenHarf==sesliHarf[i]) {
    		   System.out.println("Sesli Harfdir");
    		   return;
    	   }
    	   
    	    }
       System.out.println("Sesli Harf DEğildir");
	}*/
		char harf = 'A';
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harfdir...");
			break;
		default:
			System.out.println("İnce Sesli Harf Değildir...");
				
		
		
		}
	}

}
