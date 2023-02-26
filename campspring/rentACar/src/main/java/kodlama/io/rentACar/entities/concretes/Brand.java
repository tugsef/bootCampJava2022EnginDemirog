package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;   // veriyibir yerde tutmak persistance
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "brands")
//@Data  			Setter ve Getirlerını birlikte oluştur... , tostring ,equels , parametresiz constructur
@Getter 			// Sadece getter
@Setter 			// Sadec egettır
@AllArgsConstructor // Parametreli consructor  
@NoArgsConstructor 	//Pametresiz contrktır...
@Entity 			//Sen bir veri tabanı varlığısın tablo olarakta buraya karşılık geliyorsun...
public class Brand {
	
	@Id 		//sen veri tabanında primary key alanısın bir nura ver heryerde onu kullan
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // farklı platformdan gelen brandleri bir bir artır.id otomatik artan
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	
}
