package overriding;

public class OgrenciKrediManager extends BasekrediManager{
	
	public double hesapla(double tutar) {
		return tutar*1.10;
//overridable classlarda siz aksini belşrtmrzseniz üstünüze yazabiir...
		}
}
