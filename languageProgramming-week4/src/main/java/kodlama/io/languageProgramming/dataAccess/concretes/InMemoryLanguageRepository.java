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
		// TODO Auto-generated method stub
		return languages;
	}






	public List<Language> delete(Language language) {
		for(Language l:languages) {
			if (l.getId()<language.getId()) {
				System.out.println("id kayıtlı değil...");
			}
		}
		languages.remove(language.getId());
		
		return languages;
	}






	@Override
	public List<Language> setAdd(Language language) {
		for(Language l:languages) {
			if(l.getName().equals(language.getName())) {
				System.out.println("Kurs tekrar edemez...");
			}
			languages.add(language);
		}
		return languages;
	}






	@Override
	public void update(int id ,Language language) {
		languages.set(id, language);
		for (Language l:languages) {
			System.out.println(l);
		}
	}
























}
