package  absractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();// GameCaculator hangi class extends ediyorsa kendi hesaplamasını yazmalı...(abstract)
	
	public final void gameOver() {//final ifadesi metodun farklı class ların kullanımı durumunda değiştirlmeden kullanılmasını sağlıyor...
		System.out.println("Oyun Bitti...");
	}
	
	
	
	// abstract bir class ın abstract olabilmesi için abstract imzası taşımalı
	//Operayonun abstract üolması için abstract la desteklenmes, gerekiyor...
	//Abstract class da illa bir abstract operasyonu olma zorunda değil..
	//Abstractlar sizin base gizlemek istediğiniz zamanda kulllanılır..
	//!!!!!!!!!!!!!!!!Abstract classlar asla new lenemez..... !!!!!!!!!!!!!!!!!!!!!!! 
}
