package kodlama.io.softwareLanguages.business.abstracts;

import java.util.List;

import kodlama.io.softwareLanguages.business.requests.langueges.CreateLanguageRequests;
import kodlama.io.softwareLanguages.business.requests.langueges.GetIdAllRequests;
import kodlama.io.softwareLanguages.business.requests.langueges.UpdateRequest;
import kodlama.io.softwareLanguages.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.softwareLanguages.entity.Language;

public interface LanguagesService {
	
  List<GetAllLanguagesResponse> getAll();
  void add(CreateLanguageRequests createLanguageRequests);
  void delete(int id) throws Exception;
  Language getById(GetIdAllRequests getIdAllRequests) throws Exception;
  void update(UpdateRequest updateRequest , int id) throws Exception;
}
