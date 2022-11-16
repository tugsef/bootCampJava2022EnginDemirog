package kodlama.io.languageProgramming.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTecnologyRequest {
	private int technologyId;
	private String technologyName;
	private int languageId;
}
