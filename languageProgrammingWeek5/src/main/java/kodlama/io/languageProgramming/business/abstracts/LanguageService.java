package kodlama.io.languageProgramming.business.abstracts;

import java.util.List;

import kodlama.io.languageProgramming.business.requests.CreateLanguageRequest;
import kodlama.io.languageProgramming.business.requests.DeleteLanguageRequest;
import kodlama.io.languageProgramming.business.requests.UpdateLanguageRequest;
import kodlama.io.languageProgramming.business.responses.GetAllLanguagesResponse;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest);	
	void delete(DeleteLanguageRequest deleteLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest,int languageId);

}
