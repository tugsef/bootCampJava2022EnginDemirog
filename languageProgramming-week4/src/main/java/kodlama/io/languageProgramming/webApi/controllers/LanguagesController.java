package kodlama.io.languageProgramming.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.languageProgramming.business.abstracts.LanguageService;
import kodlama.io.languageProgramming.entities.concretes.Language;
@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
		
	}
	
	@GetMapping("/delete")
	public List<Language> delete(@RequestBody Language language) {
		// TODO Auto-generated method stub
		return languageService.delete(language);
	}

	@GetMapping("/setadd")
	public List<Language> setAdd(@RequestBody Language language) {
		// TODO Auto-generated method stub
		return languageService.setAdd(language);
	}

	@GetMapping("/update")
	public void update(@RequestBody int id, Language language) {
		languageService.update(id, language);
		
	}
}
