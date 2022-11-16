package kodlama.io.languageProgramming.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.languageProgramming.business.abstracts.LanguageService;
import kodlama.io.languageProgramming.business.requests.CreateLanguageRequest;
import kodlama.io.languageProgramming.business.requests.DeleteLanguageRequest;
import kodlama.io.languageProgramming.business.requests.UpdateLanguageRequest;
import kodlama.io.languageProgramming.business.responses.GetAllLanguagesResponse;
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
	public List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest){
		this.languageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest ) {
		this.languageService.delete(deleteLanguageRequest);
	}
	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest,int languageId) {
		this.languageService.update(updateLanguageRequest, languageId);
	}


}
