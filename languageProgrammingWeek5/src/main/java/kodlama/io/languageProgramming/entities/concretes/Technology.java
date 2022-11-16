package kodlama.io.languageProgramming.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "technologies")
@Entity
public class Technology {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "technology_id")

private int techologyId;

@Column(name = "technology_name")
private String techologyName;


@ManyToOne
@JoinColumn(name = "language_id")
private Language language;
}
