package kodlama.io.softwareLanguages.business.responses.subTecnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubTecnologyResponse {

	private int id;
	private String subName;
	private String languageName; 
	
}
