package kodlama.io.softwareLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.softwareLanguages.entity.Language;



public interface LanguagesRepository extends JpaRepository<Language, Integer>{

}
