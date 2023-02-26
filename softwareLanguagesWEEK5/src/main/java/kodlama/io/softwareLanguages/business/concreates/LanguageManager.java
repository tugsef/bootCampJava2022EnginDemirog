package kodlama.io.softwareLanguages.business.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstracts.LanguagesService;
import kodlama.io.softwareLanguages.business.requests.langueges.CreateLanguageRequests;
import kodlama.io.softwareLanguages.business.requests.langueges.GetIdAllRequests;
import kodlama.io.softwareLanguages.business.requests.langueges.UpdateRequest;
import kodlama.io.softwareLanguages.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.softwareLanguages.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.softwareLanguages.entity.Language;

@Service
public class LanguageManager implements LanguagesService {
		
	
	private LanguagesRepository languagesRepository;
	
	@Autowired
	public LanguageManager(LanguagesRepository languagesRepository) {
		this.languagesRepository = languagesRepository;
	}
	
	
	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<GetAllLanguagesResponse> languagesResponses = new ArrayList<>();
		List<Language> languages = languagesRepository.findAll();
		for (Language language : languages) {
			GetAllLanguagesResponse response = new GetAllLanguagesResponse();
			response.setLanguageName(language.getLanguageName());;
			response.setLanguagesId(language.getLanguageId());
			languagesResponses.add(response);
			
			
		}
		
		
		return languagesResponses;
	}


	@Override
	public void add(CreateLanguageRequests createLanguageRequests) {
		Language language = new Language();
		language.setLanguageName(createLanguageRequests.getLanguageName());
		languagesRepository.save(language);
		
	}


	@Override
	public void delete(int id) throws Exception {
		languagesRepository.deleteById(id);
		
	}


	@Override
	public Language getById(GetIdAllRequests getIdAllRequests) throws Exception {
		
	List<Language> languages = languagesRepository.findAll();
	for (Language language : languages) {
		if(language.getLanguageId()==getIdAllRequests.getId()) {
			return language;
		}
	}
	return null;
	}


	@Override
	public void update(UpdateRequest updateRequest, int id) {
		Language language = languagesRepository.findById(id).get();
		
		language.setLanguageName(updateRequest.getName());
		languagesRepository.save(language);
		
	}
		
		
	
	
	
	
}
