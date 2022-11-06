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
		
		return languageRepository.getAll()	;
	}
	@Override
	public Language getById(int id) throws Exception {
		
		return languageRepository.getById(id);
	}
	@Override
	public void add(Language language) {
		languageRepository.add(language);
		
	}
	@Override
	public void delete(int id) throws Exception {
		languageRepository.delete(id);
		
	}
	@Override
	public void update(Language language) {
		// TODO Auto-generated method stub
		languageRepository.update(language);
	}

	

}
