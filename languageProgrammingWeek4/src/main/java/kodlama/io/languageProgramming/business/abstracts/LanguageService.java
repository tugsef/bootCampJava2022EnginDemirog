package kodlama.io.languageProgramming.business.abstracts;

import java.util.List;

import kodlama.io.languageProgramming.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language getById(int id) throws 	Exception;
	void add(Language language);
	void delete(int id) throws Exception;
	void update(Language language);
}
