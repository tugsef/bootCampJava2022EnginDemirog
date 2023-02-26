package kodlama.io.softwareLanguages.business.requests.subTecnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTecnologyRequest {
	
	private int languageId;
	
	private String subName;
	
}
