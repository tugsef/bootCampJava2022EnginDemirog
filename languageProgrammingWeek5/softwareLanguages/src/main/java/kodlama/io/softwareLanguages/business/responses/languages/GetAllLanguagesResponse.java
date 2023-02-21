package kodlama.io.softwareLanguages.business.responses.languages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesResponse {
	
	private int languagesId;
	private String languageName;
	
	
	
}
