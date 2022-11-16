package kodlama.io.languageProgramming.business.concertes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.languageProgramming.business.abstracts.LanguageService;
import kodlama.io.languageProgramming.business.requests.CreateLanguageRequest;
import kodlama.io.languageProgramming.business.requests.DeleteLanguageRequest;
import kodlama.io.languageProgramming.business.requests.UpdateLanguageRequest;
import kodlama.io.languageProgramming.business.responses.GetAllLanguagesResponse;
import kodlama.io.languageProgramming.dataAccess.abstracts.LanguageRepository;
import kodlama.io.languageProgramming.entities.concretes.Language;
@Service // Bu sınıf bir business 
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}
	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages=languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<>();
		
		for (Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setLanguageId(language.getLanguageId());
			responseItem.setLanguageName(language.getLanguageName());
			languagesResponse.add(responseItem);
		}
		return languagesResponse;
	}
	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setLanguageName(createLanguageRequest.getLanguageName());
		language.setLanguageId(createLanguageRequest.getLaguageId());
        this.languageRepository.save(language);		
	}
	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		Language language = new Language();
		language.setLanguageId(deleteLanguageRequest.getLanguageId());
		this.languageRepository.delete(language);
		
	}
	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest, int languageId) {
		List<Language> languages = languageRepository.findAll();
		List<UpdateLanguageRequest> languageRequests= new ArrayList<>();
		for (Language language : languages) {
			UpdateLanguageRequest responseItem = new UpdateLanguageRequest();
			responseItem.setLanguageId(language.getLanguageId());
			responseItem.setLanguageName(language.getLanguageName());
			languageRequests.add(responseItem);
			
		}
		for (int i =0 ; i<languageRequests.size();i++) {
			UpdateLanguageRequest update= languageRequests.get(i);
			if(update.getLanguageId()==languageId) {
				languageRequests.set(i, updateLanguageRequest);
				return;
			}
		}
		
	}
	

	

	

}
