package kodlama.io.languageProgramming.business.abstracts;

import java.util.List;

import kodlama.io.languageProgramming.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	List<Language> delete(Language language);
	List<Language> setAdd(Language language);
	void update(int id ,Language language);
}
