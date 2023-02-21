package kodlama.io.softwareLanguages.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "language")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int languageId;
	
	@Column(name = "language_name")
	private String languageName;
	
	
	
	
	
	
	
	
	
}
