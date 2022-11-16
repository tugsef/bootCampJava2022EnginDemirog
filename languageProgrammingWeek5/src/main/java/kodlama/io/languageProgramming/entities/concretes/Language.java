package kodlama.io.languageProgramming.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="languages")
@Entity	
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="language_id")
	private int languageId;
	
	@Column(name="language_name")
	private String languageName;
	
	@OneToMany(mappedBy = "language")
	private List<Technology> technologies;
	
	
	
}
