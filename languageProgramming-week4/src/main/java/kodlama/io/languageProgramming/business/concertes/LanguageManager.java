package kodlama.io.languageProgramming.business.concertes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.languageProgramming.business.abstracts.LanguageService;
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
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public List<Language> delete(Language language) {
		// TODO Auto-generated method stub
		return languageRepository.delete(language);
	}

	@Override
	public List<Language> setAdd(Language language) {
		// TODO Auto-generated method stub
		return languageRepository.setAdd(language);
	}

	@Override
	public void update(int id, Language language) {
		languageRepository.update(id, language);
		
	}

}
