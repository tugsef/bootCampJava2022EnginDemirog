package kodlama.io.languageProgramming.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public List<Language> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/{id}")
	public Language getById(@PathVariable() int id) throws Exception{
		return languageService.getById(id);
	}
	@PostMapping("/add")
	public void add(@RequestBody Language language) {
		languageService.add(language);
	} 
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") int id) throws Exception{
		languageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Language language) {
		languageService.update(language);
	}
}
