package kodlama.io.languageProgramming.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.languageProgramming.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Integer> {



}
