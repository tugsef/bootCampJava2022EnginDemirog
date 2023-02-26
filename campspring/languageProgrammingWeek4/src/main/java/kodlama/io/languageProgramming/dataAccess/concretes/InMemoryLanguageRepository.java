package kodlama.io.languageProgramming.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import kodlama.io.languageProgramming.dataAccess.abstracts.LanguageRepository;
import kodlama.io.languageProgramming.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
 
	List<Language> languages;
 
	
	



	public InMemoryLanguageRepository() {
	languages = new ArrayList<Language>();
	languages.add(new Language(1,"C#"));
	languages.add(new Language(2,"Java"));
	languages.add(new Language(3,"Python"));
	languages.add(new Language(4,"Javascript"));
}






	@Override
	public List<Language> getAll() {
		
		return languages;
	}






	@Override
	public Language getById(int id) throws Exception {
		for (Language l : languages) {
			if(l.getId()==id) {
				return l;
			}
		}
		throw new Exception("Yeni Kayıt Bulunamadı...");
	}






	@Override
	public void add(Language language) {
		languages.add(language);
		
	}






	@Override
	public void delete(int id) throws Exception {
		for(Language l:languages) {
			if(l.getId()==id) {
				languages.remove(id);
			}
		} throw new Exception("Kayıt bulunmadı...");
		
	}






	@Override
	public void update(Language language) {
		languages.set(language.getId(), language);		
		
	}













	


























}
